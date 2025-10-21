package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTOPeticion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OficinaDTO {

    @NotEmpty(message = "{oficina.nombre.empty}")
    @Size(min = 2, max = 100, message = "{oficina.nombre.length}")
    private String nombre;

    @NotEmpty(message = "{oficina.ubicacion.empty}")
    @Size(min = 5, max = 200, message = "{oficina.ubicacion.length}")
    private String ubicacion;
}
