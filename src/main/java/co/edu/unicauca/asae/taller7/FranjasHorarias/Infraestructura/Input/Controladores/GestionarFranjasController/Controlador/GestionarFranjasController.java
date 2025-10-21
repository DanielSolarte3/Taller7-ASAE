package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Controlador;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Input.GestionarFranjasCUPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOs.FranjaHorariaDTOPeticion;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Mapper.FranjasHorariasDTOMapper;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta.FranjaHorariaDTORespuesta;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/franjasHorarias")
@RequiredArgsConstructor
public class GestionarFranjasController {
    private final GestionarFranjasCUPort gestionarFranjasCUPort;
    private final FranjasHorariasDTOMapper franjasHorariasDTOMapper;

    @GetMapping("/listarPorCurso/{id}")
    public List<FranjaHorariaDTORespuesta> listarPorCurso(@PathVariable int id) {
        return franjasHorariasDTOMapper.toDTORespuestaList(gestionarFranjasCUPort.listarFranjasPorCursoIn(id));
    }

    @PostMapping()
    public FranjaHorariaDTORespuesta guardarFranjaHoraria(@RequestBody FranjaHorariaDTOPeticion franjaHorariaDTO) {
        return franjasHorariasDTOMapper.toDTORespuesta(gestionarFranjasCUPort.guardarFranjaIn(franjasHorariasDTOMapper.toModelFromPeticion(franjaHorariaDTO)));
    }
}
