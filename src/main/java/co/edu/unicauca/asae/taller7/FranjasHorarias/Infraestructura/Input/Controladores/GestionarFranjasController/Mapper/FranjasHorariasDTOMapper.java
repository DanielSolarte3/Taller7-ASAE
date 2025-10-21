package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Mapper;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta.FranjaHorariaDTORespuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {EspaciosFisicosMapper.class, CursoMapper.class})
public interface FranjasHorariasDTOMapper {

    FranjaHoraria toModel(FranjaHorariaDTORespuesta franjaHorariaDTO);
    FranjaHorariaDTORespuesta toDTO(FranjaHoraria franjaHoraria);

    List<FranjaHoraria> toModelList(List<FranjaHorariaDTORespuesta> franjaHorariaDTO);
    List<FranjaHorariaDTORespuesta> toDTOList(List<FranjaHoraria> franjaHoraria);
}
