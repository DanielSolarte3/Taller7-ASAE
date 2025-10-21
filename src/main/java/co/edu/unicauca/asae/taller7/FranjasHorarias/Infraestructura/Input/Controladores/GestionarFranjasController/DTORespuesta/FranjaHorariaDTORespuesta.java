package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.DTORespuesta.CursoDTORespuesta;
import lombok.Data;
import java.time.LocalTime;

@Data
public class FranjaHorariaDTORespuesta {
    private Integer franjaId;
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private CursoDTORespuesta curso;
    private EspacioFisicoDTORespuesta espacioFisico;
}
