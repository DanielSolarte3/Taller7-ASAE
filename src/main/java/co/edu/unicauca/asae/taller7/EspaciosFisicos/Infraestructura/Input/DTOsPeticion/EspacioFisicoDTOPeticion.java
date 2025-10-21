package co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTOsPeticion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTOs.FranjaHorariaDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EspacioFisicoDTOPeticion {
    private String nombre;
    private Integer capacidad;
    private List<FranjaHorariaDTO> franjasHorarias;
    private Boolean estado;
}
