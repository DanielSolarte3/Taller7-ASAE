package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTOMappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Oficina;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTOPeticion.OficinaDTO;

@Mapper(componentModel = "spring")
public interface OficinaDTOMapper {
    @Mapping(target = "oficinaId", ignore = true)
    Oficina toModelFromRequestDTO(OficinaDTO peticion);
}
