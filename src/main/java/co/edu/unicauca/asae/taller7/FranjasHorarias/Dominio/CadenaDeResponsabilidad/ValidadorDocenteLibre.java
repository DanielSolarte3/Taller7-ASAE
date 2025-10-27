package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.Commons.Aplicacion.Output.FormateadorResultadosPort;
import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

public class ValidadorDocenteLibre extends ValidadorBase{

    public ValidadorDocenteLibre(FormateadorResultadosPort formateadorResultados, GestionarFranjasGatewayPort franjasGateway) {
        super(formateadorResultados, franjasGateway);
    }

    @Override
    protected boolean manejarValidacion(FranjaHoraria franjaHoraria) {

        for(Docente docente : franjaHoraria.getCurso().getDocentes()){
            if (franjasGateway.docenteEstaOcupado(docente.getPersonaId(), franjaHoraria.getDia(), franjaHoraria.getHoraInicio(), franjaHoraria.getHoraFin())){
                formateadorResultados.retornarRespuestaErrorReglaDeNegocio(
                    "franjaHoraria.docente.ocupado"
                );
                return false;
            }
        }
        return true;
    }
}
