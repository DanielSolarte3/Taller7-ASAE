package co.edu.unicauca.asae.taller7.Commons.Aplicacion.Output;

public interface FormateadorResultadosPort {
    void retornarRespuestaErrorEntidadNoExiste(String mensaje);
    void retornarRespuestaErrorReglaDeNegocio(String mensaje);
}
