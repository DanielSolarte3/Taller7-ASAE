package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.DTOMappers;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.DTOs.FranjaHorariaDTORespuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FranjasHorariasDTOMapper {

    FranjaHoraria toModel(FranjaHorariaDTORespuesta franjaHorariaDTO);
    @Mapping(source = "espacioFisico.espacioFisicoId", target = "espacioFisicoId")
    FranjaHorariaDTORespuesta toDTO(FranjaHoraria franjaHoraria);

    List<FranjaHoraria> toModelList(List<FranjaHorariaDTORespuesta> franjaHorariaDTO);
    List<FranjaHorariaDTORespuesta> toDTOList(List<FranjaHoraria> franjaHoraria);
}
