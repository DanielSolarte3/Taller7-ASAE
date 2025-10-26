package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarCursosController.Controlador;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Input.GestionarCursosCUPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarCursosController.DTORespuesta.CursoDTORespuesta;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarCursosController.Mapper.CursosDTOMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/curso")
@RequiredArgsConstructor
public class GestionarCursosController {
    private final GestionarCursosCUPort gestionarCursosCUPort;
    private final CursosDTOMapper cursosDTOMapper;

    @GetMapping("/cursosPorNombreAsignatura/{nombreAsignatura}")
    public ResponseEntity<List<CursoDTORespuesta>> listarPorNombreDeAsignatura(@PathVariable String nombreAsignatura) {
        return new ResponseEntity<List<CursoDTORespuesta>>(cursosDTOMapper.toDTOList(this.gestionarCursosCUPort.buscarCursosPorNombreAsignaturaIn(nombreAsignatura)),HttpStatus.OK);
    }
    
}
