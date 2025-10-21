package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Mapper;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta.EspacioFisicoDTORespuesta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EspaciosFisicosDTOMapper {
    EspacioFisicoDTORespuesta toDTO(EspacioFisico espacioFisico);
    EspacioFisico toModel(EspacioFisicoDTORespuesta espacioFisicoDTO);
}
