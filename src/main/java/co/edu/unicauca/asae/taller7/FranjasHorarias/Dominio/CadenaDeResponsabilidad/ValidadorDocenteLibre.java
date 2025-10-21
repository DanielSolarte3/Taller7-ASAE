package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

public class ValidadorDocenteLibre extends ValidadorBase{

    @Override
    protected boolean manejarValidacion(FranjaHoraria franjaHoraria) {

        for(Docente docente : franjaHoraria.getCurso().getDocentes()){
            if (franjasGateway.docenteEstaOcupado(docente.getPersonaId(), franjaHoraria.getDia(), franjaHoraria.getHoraInicio(), franjaHoraria.getHoraFin())){
                franjasFormateadorResultados.retornarRespuestaErrorReglaDeNegocio(
                                                    "No se permite asignar una franja horaria a un docente (Id docente: "+ docente.getPersonaId() +
                                                            ") que está dictando un curso en el día, hora" +
                                                            " de inicio y hora fin de la nueva franja.");
                return false;
            }
        }
        return true;
    }
}
