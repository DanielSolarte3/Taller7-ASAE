package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades.DocenteEntity;

@Mapper(componentModel = "spring", uses = {OficinaMapper.class})
public interface DocenteMapper {
    @Mapping(target = "cursos", ignore = true) // CUIDAO: ESTO EVITA UN ERROR DE STACK OVERFLOW
    DocenteEntity toEntity(Docente docente);

    @Mapping(target = "cursos", ignore = true) // CUIDAO: ESTO EVITA UN ERROR DE STACK OVERFLOW
    Docente toModel(DocenteEntity docenteEntity);
}
