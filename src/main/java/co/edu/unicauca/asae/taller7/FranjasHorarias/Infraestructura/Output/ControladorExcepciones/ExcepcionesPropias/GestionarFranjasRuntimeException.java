package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.ControladorExcepciones.ExcepcionesPropias;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.ControladorExcepciones.EstructuraExcepciones.CodigoError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public abstract class GestionarFranjasRuntimeException extends RuntimeException {

  protected CodigoError codigoError;

  public abstract String formatException();
}
