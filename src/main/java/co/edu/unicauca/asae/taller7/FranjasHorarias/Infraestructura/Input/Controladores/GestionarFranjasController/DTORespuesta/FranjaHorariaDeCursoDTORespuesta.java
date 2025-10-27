package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta;

import java.time.LocalTime;

import lombok.Data;

@Data
public class FranjaHorariaDeCursoDTORespuesta {
    private Integer franjaId;
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private EspacioFisicoDTORespuesta espacioFisico;
}
