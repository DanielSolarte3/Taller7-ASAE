package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.DTORespuesta;

import java.util.List;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Asignatura;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CursoDTORespuesta {
    private Integer cursoId;
    private String nombre;
    private Asignatura asignatura;
    private List<Docente> docentes;
    private List<FranjaHoraria> franjasHorarias;
}
