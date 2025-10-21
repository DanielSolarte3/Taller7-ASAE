package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOPeticion.ValidacionesPersonalizadas;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = HorarioMilitarValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidarHorarioMilitar {
    String message() default "{franjaHoraria.horario.militar.invalid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String horaInicioField() default "horaInicio";

    String horaFinField() default "horaFin";
}
