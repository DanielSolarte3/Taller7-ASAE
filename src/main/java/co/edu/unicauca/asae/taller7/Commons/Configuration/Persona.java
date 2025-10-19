package co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Persona {
    private Integer personaId;
    private String nombre;
    private String apellido;
    private String correo;
}