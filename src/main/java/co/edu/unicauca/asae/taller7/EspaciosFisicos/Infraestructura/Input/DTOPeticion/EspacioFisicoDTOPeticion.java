package co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTOPeticion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTORespuesta.FranjaHorariaDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EspacioFisicoDTOPeticion {

    @NotNull(message = "{espacioFisico.nombre.empty}")
    @NotEmpty(message = "{espacioFisico.nombre.empty}")
    @Size(min = 3, max = 100, message = "{espacioFisico.nombre.length}")
    private String nombre;

    @NotNull(message = "{espacioFisico.capacidad.empty}")
    @NotEmpty(message = "{espacioFisico.capacidad.empty}")
    @Min(value = 5, message = "{espacioFisico.capacidad.positive}")
    private Integer capacidad;

    @Valid
    @Size(min = 1, message = "{espacioFisico.franjasHorarias.min}")
    private List<FranjaHorariaDTO> franjasHorarias;

    @NotNull(message = "{espacioFisico.estado.empty}")
    private Boolean estado;
}
