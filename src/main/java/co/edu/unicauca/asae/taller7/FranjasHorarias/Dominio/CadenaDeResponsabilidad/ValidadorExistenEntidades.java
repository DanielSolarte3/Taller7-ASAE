package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ValidadorExistenEntidades extends ValidadorBase {


    @Override
    protected boolean manejarValidacion(FranjaHoraria franjaHoraria) {
        if (!franjasGateway.espacioExiste(franjaHoraria.getEspacioFisico().getEspacioFisicoId())){
            franjasFormateadorResultados.retornarRespuestaErrorEntidadNoExiste("No existe el espacio fisico con id "+
                                                                                franjaHoraria.getEspacioFisico().getEspacioFisicoId());
            return false;
        }

        for(Docente docente: franjaHoraria.getCurso().getDocentes()){
            if(!franjasGateway.docenteExiste(docente.getPersonaId())){
                franjasFormateadorResultados.retornarRespuestaErrorEntidadNoExiste("No existe el docente con id" +
                                                                                    docente.getPersonaId());
                return false;
            }
        }

        if(!franjasGateway.cursoExiste(franjaHoraria.getCurso().getCursoId())){
            franjasFormateadorResultados.retornarRespuestaErrorEntidadNoExiste("No existe el curso con id "+
                                                                                franjaHoraria.getCurso().getCursoId());
            return false;
        }

        return true;
    }
}
