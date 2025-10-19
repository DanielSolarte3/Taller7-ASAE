package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.Taller03.CapaAccesoADatos.Models.FranjaHorariaEntity;
import co.edu.unicauca.asae.Taller03.FachadaServicios.DTO.SaveFranjaDTORespuesta;
import co.edu.unicauca.asae.Taller03.FachadaServicios.Services.Interfaces.IFranjaHorariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ValidadorEspacioLibre extends ValidadorBase {

    @Autowired
    private IFranjaHorariaService franjaHorariaService;

    @Override
    protected boolean manejarValidacion(FranjaHorariaEntity franjaHoraria, SaveFranjaDTORespuesta respuesta) {
        ArrayList<FranjaHorariaEntity> listaFranjas = franjaHorariaService.getAllFranjasHorarias();
        if(listaFranjas.isEmpty()){
            return true;
        }
        for (FranjaHorariaEntity existente : listaFranjas) {
            // Si es la misma franja ignorarla
            if(franjaHoraria.getFranjaHorariaId().equals(existente.getFranjaHorariaId())){
                continue;
            }
            // Si es el mismo espacio fisico y el mismo dia
            if (existente.getEspacioFisico().getEspacioFisicoId().equals(franjaHoraria.getEspacioFisico().getEspacioFisicoId()) &&
                    existente.getDia().equals(franjaHoraria.getDia())) {
                // Una franja se solapa con otra si NO se cumple ninguna de estas condiciones:
                // 1) La nueva franja termina antes de que empiece la existente
                // 2) La nueva franja empieza después de que termine la existente
                // En cualquier otro caso significa que sí hay cruce de horarios
                boolean seSolapa = !(franjaHoraria.getHoraFin().isBefore(existente.getHoraInicio())
                        || franjaHoraria.getHoraInicio().isAfter(existente.getHoraFin()));

                if (seSolapa) {
                    respuesta.setCodigoRespuesta("ERROR 103");
                    respuesta.setMensaje("No se permite asignar una franja horaria a un espacio físico que está ocupado en el día y hora de" +
                            " inicio y hora fin de la nueva franja." + franjaHoraria.getFranjaHorariaId() + " se solapa con " + existente.getFranjaHorariaId() + ".");
                    return false;
                }
            }
        }
        return true;
    }
}
