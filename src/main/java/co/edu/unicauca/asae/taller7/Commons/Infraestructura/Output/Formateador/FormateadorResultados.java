package co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.Formateador;

import co.edu.unicauca.asae.taller7.Commons.Aplicacion.Output.FormateadorResultadosPort;
import co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones.ExcepcionesPropias.EntidadNoExisteException;
import co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones.ExcepcionesPropias.ReglaNegocioException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class FormateadorResultados implements FormateadorResultadosPort {

    @Autowired
    private MessageSource messageSource;

    @Override
    public void retornarRespuestaErrorEntidadNoExiste(String mensaje) {
        throw new EntidadNoExisteException(mensaje);
    }

    @Override
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje) {
        throw new ReglaNegocioException(mensaje);
    }

    @Override
    public void retornarRespuestaErrorEntidadNoExisteI18n(String messageKey, Object... params) {
        String mensaje = messageSource.getMessage(messageKey, params, LocaleContextHolder.getLocale());
        throw new EntidadNoExisteException(mensaje);
    }

    @Override
    public void retornarRespuestaErrorReglaDeNegocioI18n(String messageKey, Object... params) {
        String mensaje = messageSource.getMessage(messageKey, params, LocaleContextHolder.getLocale());
        throw new ReglaNegocioException(mensaje);
    }
}
