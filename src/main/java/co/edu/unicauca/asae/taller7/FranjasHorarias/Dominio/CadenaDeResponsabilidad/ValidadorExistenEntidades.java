package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.Commons.Aplicacion.Output.FormateadorResultadosPort;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

public class ValidadorExistenEntidades extends ValidadorBase {

    public ValidadorExistenEntidades(FormateadorResultadosPort formateadorResultados, GestionarFranjasGatewayPort franjasGateway) {
        super(formateadorResultados, franjasGateway);
    }

    @Override
    protected boolean manejarValidacion(FranjaHoraria franjaHoraria) {
        EspacioFisico espacioFisico = franjasGateway.getEspacioFisicoById(franjaHoraria.getEspacioFisico().getEspacioFisicoId());
        if (espacioFisico == null) {
            formateadorResultados.retornarRespuestaErrorEntidadNoExiste("franjaHoraria.espacioFisico.noExiste");
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
            formateadorResultados.retornarRespuestaErrorEntidadNoExiste("franjaHoraria.curso.noExiste");
            return false;
        }
        franjaHoraria.setCurso(curso);

        return true;
    }
}

