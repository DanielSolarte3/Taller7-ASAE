package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Controlador;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Input.GestionarFranjasCUPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Mapper.FranjasHorariasDTOMapper;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOPeticion.FranjaHorariaDTOPeticion;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta.FranjaHorariaDTORespuesta;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@RequestMapping("/franjasHorarias")
@RequiredArgsConstructor
@Validated
public class GestionarFranjasController {
    private final GestionarFranjasCUPort gestionarFranjasCUPort;
    private final FranjasHorariasDTOMapper franjasHorariasDTOMapper;

    @GetMapping("/listarPorCurso/{id}")
    public ResponseEntity<List<FranjaHorariaDTORespuesta>> listarPorCurso(@PathVariable int id) {
        List<FranjaHorariaDTORespuesta> listaFranjas = franjasHorariasDTOMapper
                .toDTORespuestaList(gestionarFranjasCUPort.listarFranjasPorCursoIn(id));
        return new ResponseEntity<>(listaFranjas, HttpStatus.OK);
    }

    @GetMapping("/listarPorDocente/{id}")
    public ResponseEntity<List<FranjaHorariaDTORespuesta>> listarPorDocente(
            @PathVariable @Min(value = 1, message = "{docente.id.min}") Integer id) {
        List<FranjaHorariaDTORespuesta> listaFranjas = franjasHorariasDTOMapper
                .toDTORespuestaList(gestionarFranjasCUPort.listarFranjasPorDocenteIn(id));
        return new ResponseEntity<>(listaFranjas, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<FranjaHorariaDTORespuesta> guardarFranjaHoraria(
            @Valid @RequestBody FranjaHorariaDTOPeticion franjaHorariaDTO) {
        FranjaHorariaDTORespuesta franjaHorariaDTORespuesta = franjasHorariasDTOMapper.toDTORespuesta(
                gestionarFranjasCUPort.guardarFranjaIn(franjasHorariasDTOMapper.toModelFromPeticion(franjaHorariaDTO)));
        return new ResponseEntity<>(franjaHorariaDTORespuesta, HttpStatus.CREATED);
    }
}
