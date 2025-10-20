package co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Mappers;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Entidades.EspacioFisicoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EspacioFisicoMapper {
    EspacioFisico toModel(EspacioFisicoEntity e);
    EspacioFisicoEntity toEntity(EspacioFisico e);
    List<EspacioFisicoEntity> toEntityList(List<EspacioFisico> e);
    List<EspacioFisico> toModelList(List<EspacioFisicoEntity> e);
}
