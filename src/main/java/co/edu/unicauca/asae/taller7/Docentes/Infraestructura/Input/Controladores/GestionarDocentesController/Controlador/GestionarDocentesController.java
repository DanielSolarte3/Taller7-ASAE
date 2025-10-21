package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.asae.taller7.Docentes.Aplicacion.Input.GestionarDocentesCUPort;
import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTOMappers.DocenteDTOMapper;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTORespuesta.DocenteDTORespuesta;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTOs.DocenteDTO;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/docentes")
@RequiredArgsConstructor
public class GestionarDocentesController {
    private final GestionarDocentesCUPort gestionarDocentesCUPort;
    private final DocenteDTOMapper docenteDTOMapper;

    @PostMapping("/docentes")
    public ResponseEntity<DocenteDTORespuesta> create(@RequestBody DocenteDTO docente) {
        Docente docenteACrear = docenteDTOMapper.toModelFromRequest(docente);
        Docente docenteCreado = gestionarDocentesCUPort.guardarDocenteIn(docenteACrear);
        ResponseEntity<DocenteDTORespuesta> objRespuesta = new ResponseEntity<DocenteDTORespuesta>(docenteDTOMapper.toResponseFromModel(docenteCreado), HttpStatus.CREATED);

        return objRespuesta;
    }

    

}
