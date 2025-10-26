package co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTORespuesta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EspacioFisicoDTORespuesta {
    private Integer espacioFisicoId;
    private String nombre;
    private Integer capacidad;
    private Boolean estado;
}
