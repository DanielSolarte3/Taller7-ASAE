package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarCursosController.DTORespuesta;

import java.util.List;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Asignatura;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CursoDTORespuesta {
    private Integer cursoId;
    private String nombre;
    private Asignatura asignatura;
    private List<DocenteDTORespuesta> docentes;
}
