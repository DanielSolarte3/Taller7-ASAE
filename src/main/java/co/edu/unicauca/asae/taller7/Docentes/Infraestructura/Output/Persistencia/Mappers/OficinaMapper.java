package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Mappers;

import org.mapstruct.Mapper;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Oficina;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades.OficinaEntity;

@Mapper(componentModel = "spring")
public interface OficinaMapper {
    OficinaEntity toEntity(Oficina oficina);

    Oficina toModel(OficinaEntity oficinaEntity);
}
