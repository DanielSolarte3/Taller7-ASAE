package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.DTOMappers;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.DTORespuesta.CursoDTORespuesta;

@Mapper (componentModel = "spring")
public interface CursosDTOMapper {
    CursoDTORespuesta toDTO(Curso objCurso);

    List<CursoDTORespuesta> toDTOList(List<Curso> listCursos);
}
