package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTORespuesta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OficinaDTORespuesta {
    private Integer oficinaId;
    private String nombre;
    private String ubicacion;
}
