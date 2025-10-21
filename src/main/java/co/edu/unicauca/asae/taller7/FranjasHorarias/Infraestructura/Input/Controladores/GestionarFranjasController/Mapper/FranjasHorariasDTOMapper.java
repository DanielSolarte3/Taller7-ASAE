package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Mapper;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTOPeticion.FranjaHorariaDTOPeticion;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta.FranjaHorariaDTORespuesta;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = { EspaciosFisicosDTOMapper.class, CursoDTOMapper.class })
public interface FranjasHorariasDTOMapper {

    FranjaHoraria toModelFromRespuesta(FranjaHorariaDTORespuesta franjaHorariaDTO);

    FranjaHorariaDTORespuesta toDTORespuesta(FranjaHoraria franjaHoraria);

    List<FranjaHoraria> toModelFromRespuestaList(List<FranjaHorariaDTORespuesta> franjaHorariaDTO);

    List<FranjaHorariaDTORespuesta> toDTORespuestaList(List<FranjaHoraria> franjaHoraria);

    @Mappings({
            @Mapping(source = "cursoId", target = "curso.cursoId"),
            @Mapping(source = "espacioFisicoId", target = "espacioFisico.espacioFisicoId")
    })
    FranjaHoraria toModelFromPeticion(FranjaHorariaDTOPeticion dto);

}
