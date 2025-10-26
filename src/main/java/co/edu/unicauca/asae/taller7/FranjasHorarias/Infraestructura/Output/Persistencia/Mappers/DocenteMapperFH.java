package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Mappers;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades.DocenteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DocenteMapperFH {
    @Mapping(target = "cursos", ignore = true)
    DocenteEntity toEntity(Docente docente);
    @Mapping(target = "cursos", ignore = true)
    Docente toModel(DocenteEntity entity);
}
