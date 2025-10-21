package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOPeticion.ValidacionesPersonalizadas.CapacidadSuficiente;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Entidades.EspacioFisicoEntity;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Repositorios.EspacioFisicoRepository;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOPeticion.FranjaHorariaDTOPeticion;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.CursoEntity;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Repositorios.CursoRepository;

@Component
public class CapacidadSuficienteValidator
        implements ConstraintValidator<ValidarCapacidadSuficiente, FranjaHorariaDTOPeticion> {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private EspacioFisicoRepository espacioFisicoRepository;

    @Override
    public boolean isValid(FranjaHorariaDTOPeticion franja, ConstraintValidatorContext context) {
        if (franja == null || franja.getCursoId() == null || franja.getEspacioFisicoId() == null) {
            return true;
        }

        try {
            // Obtener el curso
            Optional<CursoEntity> curso =  cursoRepository.findById(franja.getCursoId());

            if (!curso.isPresent()) {
                return false;
            }

            // Obtener el espacio físico
            Optional<EspacioFisicoEntity> espacioFisico = espacioFisicoRepository.findById(franja.getEspacioFisicoId());

            if (!espacioFisico.isPresent()) {
                return false;
            }

            // La capacidad del espacio físico debe ser mayor o igual al número de estudiantes del curso
            if (espacioFisico.get().getCapacidad() < curso.get().getCapacidadMatricula()) {
                return false;
            }

            // Si todas las validaciones pasan, la franja horaria es válida
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
