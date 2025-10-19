package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asignatura {
    private Integer asignaturaId;
    private String nombre;
    private String codigo;
}
