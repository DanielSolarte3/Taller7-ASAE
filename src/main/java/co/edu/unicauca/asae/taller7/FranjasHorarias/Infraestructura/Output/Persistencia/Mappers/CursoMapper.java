package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.CursoEntity;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CursoMapper {

    @Mappings({
        @Mapping(target = "franjasHorarias", ignore = true)
    })
    Curso toModel(CursoEntity entity);

    List<Curso> toModelList(List<CursoEntity> listCursos);
}
