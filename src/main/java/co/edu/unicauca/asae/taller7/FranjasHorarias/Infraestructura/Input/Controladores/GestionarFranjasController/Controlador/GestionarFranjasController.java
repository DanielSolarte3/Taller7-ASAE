package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Controlador;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Input.GestionarFranjasCUPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Mapper.FranjasHorariasDTOMapper;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOPeticion.FranjaHorariaDTOPeticion;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta.FranjaHorariaDTORespuesta;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/franjasHorarias")
@RequiredArgsConstructor
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
    public ResponseEntity<List<FranjaHorariaDTORespuesta>> listarPorDocente(@PathVariable Integer id) {
        List<FranjaHorariaDTORespuesta> listaFranjas = franjasHorariasDTOMapper.toDTORespuestaList(gestionarFranjasCUPort.listarFranjasPorDocenteIn(id));
        return new ResponseEntity<>(listaFranjas, HttpStatus.OK);
    }
    
    @PostMapping()
    public ResponseEntity<FranjaHorariaDTORespuesta> guardarFranjaHoraria(
            @RequestBody FranjaHorariaDTOPeticion franjaHorariaDTO) {
        FranjaHorariaDTORespuesta franjaHorariaDTORespuesta = franjasHorariasDTOMapper.toDTORespuesta(
                gestionarFranjasCUPort.guardarFranjaIn(franjasHorariasDTOMapper.toModelFromPeticion(franjaHorariaDTO)));
        return new ResponseEntity<>(franjaHorariaDTORespuesta, HttpStatus.CREATED);
    }
}
