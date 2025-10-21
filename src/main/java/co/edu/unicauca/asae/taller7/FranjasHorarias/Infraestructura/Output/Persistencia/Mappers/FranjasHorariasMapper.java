package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Mappers;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Mappers.EspacioFisicoMapper;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.FranjaHorariaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CursoMapper.class, EspacioFisicoMapper.class})
public interface FranjasHorariasMapper {
    FranjaHorariaEntity toEntity(FranjaHoraria franjaHoraria);
    FranjaHoraria toModel(FranjaHorariaEntity franjaHorariaEntity);
    List<FranjaHoraria> toModelList(List<FranjaHorariaEntity> franjaHorariaEntities);
    List<FranjaHorariaEntity> toEntityList(List<FranjaHoraria> franjaHorariaEntities);
}
