package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOs;

import lombok.Data;

import java.time.LocalTime;

@Data
public class FranjaHorariaDTOPeticion {
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Integer cursoId;
    private Integer espacioFisicoId;
}
