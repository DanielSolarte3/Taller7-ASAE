package co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones.ExcepcionesPropias;


import co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones.EstructuraExcepciones.CodigoError;

public class ReglaNegocioException extends GestionarFranjasRuntimeException{

  private static final String FORMATO_EXCEPCION = "%s - Violación a regla de negocio: %s";

  private final String reglaNegocio;

  public ReglaNegocioException(final String reglaNegocio) {
    super(CodigoError.VIOLACION_REGLA_DE_NEGOCIO);
    this.reglaNegocio = reglaNegocio;
  }

  @Override
  public String formatException() {
    return String.format(FORMATO_EXCEPCION, codigoError.getCodigo(), reglaNegocio);
  }
}
