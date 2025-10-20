package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FranjaHoraria {
    private Integer franjaId;
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Curso curso;
    private EspacioFisico espacioFisico;
    private List<Docente> docentes;
}
