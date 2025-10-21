package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class PersonaDTO {
    // Se omite el id porque es autogenerado en el repositorio
    private String nombre;
    private String apellido;
    private String correo;
}