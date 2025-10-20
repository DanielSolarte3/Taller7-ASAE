package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Input.GestionarCursosCUPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.DTOMappers.CursosDTOMapper;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.DTORespuesta.CursoDTORespuesta;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/curso")
@RequiredArgsConstructor
public class CursoRestController {
    private final GestionarCursosCUPort gestionarCursosCUPort;
    private final CursosDTOMapper cursosDTOMapper;

    @GetMapping("/cursosPorNombreAsignatura")
    public ResponseEntity<List<CursoDTORespuesta>> listarPorNombreDeAsignatura(@PathVariable String nombreAsignatura) {
        ResponseEntity<List<CursoDTORespuesta>> respuesta = new ResponseEntity<List<CursoDTORespuesta>>(cursosDTOMapper.toDTOList(this.gestionarCursosCUPort.buscarCursosPorNombreAsignaturaIn(nombreAsignatura)),HttpStatus.OK);

        return respuesta;
    }
    
}
