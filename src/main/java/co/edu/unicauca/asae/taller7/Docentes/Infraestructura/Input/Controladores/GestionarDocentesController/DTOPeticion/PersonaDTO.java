package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTOPeticion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class PersonaDTO {

    @NotEmpty(message = "{persona.nombre.empty}")
    @Size(min = 2, max = 50, message = "{persona.nombre.length}")
    private String nombre;

    @NotEmpty(message = "{persona.apellido.empty}")
    @Size(min = 2, max = 50, message = "{persona.apellido.length}")
    private String apellido;

    @NotEmpty(message = "{persona.correo.empty}")
    @Email(message = "{persona.correo.invalid}")
    private String correo;
}
