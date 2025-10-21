package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOPeticion.ValidacionesPersonalizadas.HorarioMilitar;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.time.LocalTime;

public class HorarioMilitarValidator implements ConstraintValidator<ValidarHorarioMilitar, Object> {

    private String horaInicioField;
    private String horaFinField;

    @Override
    public void initialize(ValidarHorarioMilitar constraintAnnotation) {
        this.horaInicioField = constraintAnnotation.horaInicioField();
        this.horaFinField = constraintAnnotation.horaFinField();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        try {
            Field inicioField = value.getClass().getDeclaredField(horaInicioField);
            Field finField = value.getClass().getDeclaredField(horaFinField);

            inicioField.setAccessible(true);
            finField.setAccessible(true);

            LocalTime horaInicio = (LocalTime) inicioField.get(value);
            LocalTime horaFin = (LocalTime) finField.get(value);

            if (horaInicio == null || horaFin == null) {
                return true;
            }

            // Validar formato militar: minutos deben ser 00
            boolean inicioValido = horaInicio.getMinute() == 0;
            boolean finValido = horaFin.getMinute() == 0;

            // Validar que hora fin sea posterior a hora inicio
            boolean ordenValido = horaFin.isAfter(horaInicio);

            if (!inicioValido || !finValido || !ordenValido) {
                context.disableDefaultConstraintViolation();

                if (!inicioValido || !finValido) {
                    context.buildConstraintViolationWithTemplate(
                            "{franjaHoraria.horario.militar.invalid}")
                            .addConstraintViolation();
                }

                if (!ordenValido) {
                    context.buildConstraintViolationWithTemplate(
                            "{franjaHoraria.horario.orden.invalid}")
                            .addConstraintViolation();
                }

                return false;
            }

            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
