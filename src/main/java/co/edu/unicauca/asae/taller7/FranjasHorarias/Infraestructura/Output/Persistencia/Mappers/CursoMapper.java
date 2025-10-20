package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.CursoEntity;

@Mapper (componentModel = "spring")
public interface CursoMapper {
    @Mapping(target = "franjasHorarias", ignore = true)
    Curso toModel(CursoEntity entity);

    List<Curso> toModel(List<CursoEntity> listCursos);
}
