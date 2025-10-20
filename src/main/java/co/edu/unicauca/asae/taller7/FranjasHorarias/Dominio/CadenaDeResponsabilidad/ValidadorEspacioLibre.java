package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ValidadorEspacioLibre extends ValidadorBase {
    private final GestionarFranjasGatewayPort franjasGateway;

    @Override
    protected boolean manejarValidacion(FranjaHoraria franjaHoraria) {
        List<FranjaHoraria> listaFranjas = franjasGateway.listarFranjas();
        if(listaFranjas.isEmpty()){
            return true;
        }
        for (FranjaHoraria existente : listaFranjas) {
            // Si es la misma franja ignorarla
            if(franjaHoraria.getFranjaId().equals(existente.getFranjaId())){
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
                            " inicio y hora fin de la nueva franja." + franjaHoraria.getFranjaId() + " se solapa con " + existente.getFranjaId() + ".");
                    return false;
                }
            }
        }
        return true;
    }
}
