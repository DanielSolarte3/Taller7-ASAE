package co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EspacioFisico {
    private Integer espacioFisicoId;
    private String nombre;
    private Integer capacidad;
    private List<FranjaHoraria> franjasHorarias;
    private Boolean estado;
}
