package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta;

import lombok.Data;
import java.time.LocalTime;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarCursosController.DTORespuesta.CursoDTORespuesta;

@Data
public class FranjaHorariaDTORespuesta {
    private Integer franjaId;
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private CursoDTORespuesta curso;
    private EspacioFisicoDTORespuesta espacioFisico;
}
