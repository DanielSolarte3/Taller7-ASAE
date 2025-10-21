package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOPeticion.ValidacionesPersonalizadas.CapacidadSuficiente;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CapacidadSuficienteValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidarCapacidadSuficiente {
    String message() default "{espacioFisico.capacidad.insuficiente}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
