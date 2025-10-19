package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.Taller03.CapaAccesoADatos.Models.DocenteEntity;
import co.edu.unicauca.asae.Taller03.CapaAccesoADatos.Models.FranjaHorariaEntity;
import co.edu.unicauca.asae.Taller03.FachadaServicios.DTO.SaveFranjaDTORespuesta;
import co.edu.unicauca.asae.Taller03.FachadaServicios.Services.Interfaces.IFranjaHorariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ValidadorDocenteLibre extends ValidadorBase{

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

            if (existente.getDia().equals(franjaHoraria.getDia())) {
                // Para cada docente dictando la materia hay que verificar si se solapa la franja
                for (DocenteEntity docente : franjaHoraria.getDocentes()) {
                    if (existente.getDocentes().contains(docente)) {
                        // Una franja se solapa con otra si NO se cumple ninguna de estas condiciones:
                        // 1) La nueva franja termina antes de que empiece la existente
                        // 2) La nueva franja empieza después de que termine la existente
                        // En cualquier otro caso significa que sí hay cruce de horarios
                        boolean seSolapa = !(franjaHoraria.getHoraFin().isBefore(existente.getHoraInicio())
                                || franjaHoraria.getHoraInicio().isAfter(existente.getHoraFin()));

                        if (seSolapa) {
                            respuesta.setCodigoRespuesta("ERROR 104");
                            respuesta.setMensaje("No se debe permitir asignar una franja horaria a un docente que está dictando un curso en el día y hora" +
                                    " de inicio y hora fin de la nueva franja." + franjaHoraria.getFranjaHorariaId() + " se solapa con " +
                                    existente.getFranjaHorariaId() + ".");
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
