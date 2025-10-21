package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTOMappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTOPeticion.DocenteDTO;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTORespuesta.DocenteDTORespuesta;

@Mapper(componentModel = "spring", uses = {OficinaDTOMapper.class})
public interface DocenteDTOMapper {
    @Mapping(target = "personaId", ignore = true)
    @Mapping(target = "cursos", ignore = true)
    Docente toModelFromRequest(DocenteDTO peticion);

    DocenteDTORespuesta toResponseFromModel(Docente modelo);
}
