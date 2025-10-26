package co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTOMappers;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTOPeticion.EspacioFisicoDTOPeticion;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTORespuesta.EspacioFisicoDTORespuesta;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EspacioFisicoDTOMapper {

    EspacioFisico toModel(EspacioFisicoDTORespuesta espacioFisicoDTO);

    EspacioFisicoDTORespuesta toDTO(EspacioFisico espacioFisico);

    List<EspacioFisico> toModelList(List<EspacioFisicoDTORespuesta> espacioFisicoDTOList);

    List<EspacioFisicoDTORespuesta> toDTOList(List<EspacioFisico> espacioFisicoList);

    EspacioFisico toModelFromPeticion(EspacioFisicoDTOPeticion espacioFisicoDTOPeticion);
}
