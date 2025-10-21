package co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTOMappers;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTOs.EspacioFisicoDTORespuesta;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Input.DTOsPeticion.EspacioFisicoDTOPeticion;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EspacioFisicoDTOMapper {

    @BeanMapping(ignoreByDefault = true)
    EspacioFisico toModel(EspacioFisicoDTORespuesta espacioFisicoDTO);

    @BeanMapping(ignoreByDefault = true)
    EspacioFisicoDTORespuesta toDTO(EspacioFisico espacioFisico);

    List<EspacioFisico> toModelList(List<EspacioFisicoDTORespuesta> espacioFisicoDTOList);

    @BeanMapping(ignoreByDefault = true)
    List<EspacioFisicoDTORespuesta> toDTOList(List<EspacioFisico> espacioFisicoList);

    @BeanMapping(ignoreByDefault = true)
    EspacioFisico toModelFromPeticion(EspacioFisicoDTOPeticion espacioFisicoDTOPeticion);
}
