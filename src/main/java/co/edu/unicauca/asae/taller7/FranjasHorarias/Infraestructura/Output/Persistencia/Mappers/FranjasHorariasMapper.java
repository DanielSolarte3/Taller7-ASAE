package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Mappers;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Mappers.EspacioFisicoMapper;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.FranjaHorariaEntity;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring", uses = { CursoMapper.class, EspacioFisicoMapper.class })
public interface FranjasHorariasMapper {
        @Named("toModelConCurso")
        @Mappings({
                        @Mapping(target = "curso.franjasHorarias", ignore = true),
                        @Mapping(target = "espacioFisico.franjasHorarias", ignore = true)
        }) // CUIDAO: ESTO EVITA UN ERROR DE STACK OVERFLOW
        FranjaHorariaEntity toEntity(FranjaHoraria franjaHoraria);

        @Mappings({
                        @Mapping(target = "curso.franjasHorarias", ignore = true),
                        @Mapping(target = "espacioFisico.franjasHorarias", ignore = true)
        }) // CUIDAO: ESTO EVITA UN ERROR DE STACK OVERFLOW
        FranjaHoraria toModel(FranjaHorariaEntity franjaHorariaEntity);

        @Named("toModelSinCurso")
        @Mappings({
                        @Mapping(target = "curso", ignore = true),
                        @Mapping(target = "espacioFisico.franjasHorarias", ignore = true)
        }) // CUIDAO: ESTO EVITA UN ERROR DE STACK OVERFLOW
        FranjaHoraria toModelWithoutCurso(FranjaHorariaEntity franjaHorariaEntity);

        List<FranjaHoraria> toModelList(List<FranjaHorariaEntity> franjaHorariaEntities);

        List<FranjaHorariaEntity> toEntityList(List<FranjaHoraria> franjaHorariaEntities);

        // Se especifica el mapeo interno que usa el modelo con lista
        @IterableMapping(qualifiedByName = "toModelSinCurso")
        List<FranjaHoraria> toModelListWithoutCurso(List<FranjaHorariaEntity> franjaHorariaEntities);
}
