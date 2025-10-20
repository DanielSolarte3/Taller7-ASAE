package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ValidadorDocenteLibre extends ValidadorBase{

    private final GestionarFranjasGatewayPort gestionarFranjasGateway;

    @Override
    protected boolean manejarValidacion(FranjaHoraria franjaHoraria) {
        List<FranjaHoraria> listaFranjas = gestionarFranjasGateway.listarFranjas();
        if(listaFranjas.isEmpty()){
            return true;
        }
        for (FranjaHoraria existente : listaFranjas) {
            // Si es la misma franja ignorarla
            if(franjaHoraria.getFranjaId().equals(existente.getFranjaId())){
                continue;
            }

            if (existente.getDia().equals(franjaHoraria.getDia())) {
                // Para cada docente dictando la materia hay que verificar si se solapa la franja
                for (Docente docente : franjaHoraria.getDocentes()) {
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
                                    " de inicio y hora fin de la nueva franja." + franjaHoraria.getFranjaId() + " se solapa con " +
                                    existente.getFranjaId() + ".");
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
