package co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output;

public interface FranjasFormateadorResultadosPort {
    void retornarRespuestaErrorEntidadNoExiste(String mensaje);
    void retornarRespuestaErrorReglaDeNegocio(String mensaje);
}
