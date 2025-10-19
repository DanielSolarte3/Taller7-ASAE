package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.DTOs;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import lombok.Data;

import java.time.LocalTime;

@Data
public class FranjaHorariaDTORespuesta {
    private Integer franjaId;
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Curso curso;
    private EspacioFisicoDTO espacioFisico;
}
