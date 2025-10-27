package co.edu.unicauca.asae.taller7.Docentes.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.Commons.Aplicacion.Output.FormateadorResultadosPort;
import co.edu.unicauca.asae.taller7.Docentes.Aplicacion.Output.GestionarDocentesGatewayPort;
import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;

public class ValidadorCorreoDocente extends ValidadorBase {

    public ValidadorCorreoDocente(FormateadorResultadosPort formateadorResultados,
            GestionarDocentesGatewayPort docentesGateway) {
        super(formateadorResultados, docentesGateway);
    }

    @Override
    protected boolean manejarValidacion(Docente docente) {
        String correo = docente.getCorreo();
        if (docentesGateway.existeCorreoDocente(correo)) {
            formateadorResultados.retornarRespuestaErrorReglaDeNegocioI18n("docente.correo.duplicado");
            return false;
        }
        return true;
    }
}
