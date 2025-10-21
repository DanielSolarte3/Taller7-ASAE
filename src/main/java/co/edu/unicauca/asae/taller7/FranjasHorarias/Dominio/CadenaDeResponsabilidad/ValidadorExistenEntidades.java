package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.FranjasFormateadorResultadosPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import lombok.RequiredArgsConstructor;

public class ValidadorExistenEntidades extends ValidadorBase {

    public ValidadorExistenEntidades(FranjasFormateadorResultadosPort franjasFormateadorResultados, GestionarFranjasGatewayPort franjasGateway) {
        super(franjasFormateadorResultados, franjasGateway);
    }

    @Override
    protected boolean manejarValidacion(FranjaHoraria franjaHoraria) {
        EspacioFisico espacioFisico = franjasGateway.getEspacioFisicoById(franjaHoraria.getEspacioFisico().getEspacioFisicoId());
        if (espacioFisico == null) {
            franjasFormateadorResultados.retornarRespuestaErrorEntidadNoExiste("No existe el espacio fisico con id "+
                                                                                franjaHoraria.getEspacioFisico().getEspacioFisicoId());
            return false;
        }
        franjaHoraria.setEspacioFisico(espacioFisico);

        /*for(Docente docente: franjaHoraria.getCurso().getDocentes()){
            if(!franjasGateway.docenteExiste(docente.getPersonaId())){
                franjasFormateadorResultados.retornarRespuestaErrorEntidadNoExiste("No existe el docente con id" +
                                                                                    docente.getPersonaId());
                return false;
            }
        }*/

        Curso curso = franjasGateway.getCursoById(franjaHoraria.getCurso().getCursoId());
        if(curso == null) {
            franjasFormateadorResultados.retornarRespuestaErrorEntidadNoExiste("No existe el curso con id "+
                                                                                franjaHoraria.getCurso().getCursoId());
            return false;
        }
        franjaHoraria.setCurso(curso);

        return true;
    }
}
