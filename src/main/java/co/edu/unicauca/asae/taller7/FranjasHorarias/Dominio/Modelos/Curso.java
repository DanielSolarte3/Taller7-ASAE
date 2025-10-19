package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    private Integer cursoId;
    private String nombre;
    private Asignatura asignatura;
    private List<Docente> docentes;
    private List<FranjaHoraria> franjasHorarias;
}
