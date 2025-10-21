package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOPeticion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import java.time.LocalTime;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOPeticion.ValidacionesPersonalizadas.CapacidadSuficiente.ValidarCapacidadSuficiente;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOPeticion.ValidacionesPersonalizadas.HorarioMilitar.ValidarHorarioMilitar;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ValidarHorarioMilitar
@ValidarCapacidadSuficiente
public class FranjaHorariaDTOPeticion {

    @NotEmpty(message = "{franjaHoraria.dia.empty}")
    @Pattern(regexp = "^(Lunes|Martes|Miércoles|Miercoles|Jueves|Viernes|Sábado|Sabado)$", message = "{franjaHoraria.dia.invalid}")
    private String dia;

    @NotNull(message = "{franjaHoraria.horaInicio.empty}")
    private LocalTime horaInicio;

    @NotNull(message = "{franjaHoraria.horaFin.empty}")
    private LocalTime horaFin;

    @NotNull(message = "{franjaHoraria.cursoId.empty}")
    @Positive(message = "{franjaHoraria.cursoId.positive}")
    private Integer cursoId;

    @NotNull(message = "{franjaHoraria.espacioFisicoId.empty}")
    @Positive(message = "{franjaHoraria.espacioFisicoId.positive}")
    private Integer espacioFisicoId;
}
