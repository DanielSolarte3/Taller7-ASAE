package co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.Formateador;

import co.edu.unicauca.asae.taller7.Commons.Aplicacion.Output.FormateadorResultadosPort;
import co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones.ExcepcionesPropias.EntidadNoExisteException;
import co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones.ExcepcionesPropias.ReglaNegocioException;

import org.springframework.stereotype.Service;

@Service
public class FormateadorResultados implements FormateadorResultadosPort {
    @Override
    public void retornarRespuestaErrorEntidadNoExiste(String mensaje) {
        throw new EntidadNoExisteException(mensaje);
    }

    @Override
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje) {
        throw new ReglaNegocioException(mensaje);
    }
}
