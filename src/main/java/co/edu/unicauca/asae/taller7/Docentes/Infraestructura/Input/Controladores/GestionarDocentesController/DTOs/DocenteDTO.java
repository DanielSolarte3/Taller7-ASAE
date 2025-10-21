package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DocenteDTO extends PersonaDTO {
    private OficinaDTO oficina;
}
