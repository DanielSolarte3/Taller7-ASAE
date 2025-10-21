package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Controlador;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Input.GestionarFranjasCUPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Mapper.FranjasHorariasDTOMapper;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta.FranjaHorariaDTORespuesta;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/franjasHorarias")
@RequiredArgsConstructor
public class GestionarFranjasController {
    private final GestionarFranjasCUPort gestionarFranjasCUPort;
    private final FranjasHorariasDTOMapper franjasHorariasDTOMapper;

    @GetMapping("/listarPorCurso/{id}")
    public List<FranjaHorariaDTORespuesta> listarPorCurso(@PathVariable int id) {
        return franjasHorariasDTOMapper.toDTOList(gestionarFranjasCUPort.listarFranjasPorCursoIn(id));
    }
}
