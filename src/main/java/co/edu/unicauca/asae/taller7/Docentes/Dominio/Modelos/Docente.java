package co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Docente extends Persona {
    private Oficina oficina;
    private List<Curso> cursos;
}