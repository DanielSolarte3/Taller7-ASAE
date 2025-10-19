package co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.Controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Aplicacion.Input.GestionarEspaciosFisicosCUPort;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTOMappers.EspacioFisicoDTOMapper;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTOs.EspacioFisicoDTORespuesta;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/espaciosFisicos")
@RequiredArgsConstructor
public class GestionarEspacioFisicoController {
    private final EspacioFisicoDTOMapper espacioFisicoDTOMapper;
    private final GestionarEspaciosFisicosCUPort gestionarEspaciosFisicosCUPort;

    @GetMapping("/listarPorPatronYCapacidadMinima")
    public List<EspacioFisicoDTORespuesta> listarEspaciosFisicos(
            @RequestParam String patron,
            @RequestParam Integer capacidadMinima) {

        if (patron == null || patron.isBlank()) {
            throw new IllegalArgumentException("El patrón no puede estar vacío");
        }
        if (capacidadMinima == null || capacidadMinima < 0) {
            throw new IllegalArgumentException("La capacidad mínima debe ser mayor o igual a 0");
        }
        return espacioFisicoDTOMapper.toDTOList(
                gestionarEspaciosFisicosCUPort.buscarEspaciosFisicosPorPatronYCapacidadIn(patron, capacidadMinima));
    }
}