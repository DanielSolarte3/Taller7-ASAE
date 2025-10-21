package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Formateador;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.FranjasFormateadorResultadosPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.ControladorExcepciones.ExcepcionesPropias.EntidadNoExisteException;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.ControladorExcepciones.ExcepcionesPropias.ReglaNegocioException;
import org.springframework.stereotype.Service;

@Service
public class FranjasFormateadorResultados implements FranjasFormateadorResultadosPort {
    @Override
    public void retornarRespuestaErrorEntidadNoExiste(String mensaje) {
        throw new EntidadNoExisteException(mensaje);
    }

    @Override
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje) {
        throw new ReglaNegocioException(mensaje);
    }
}
