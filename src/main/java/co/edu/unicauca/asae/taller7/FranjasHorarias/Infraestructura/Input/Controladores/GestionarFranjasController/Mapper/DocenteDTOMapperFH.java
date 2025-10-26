package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Mapper;

import org.mapstruct.Mapper;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Input.Controladores.GestionarDocentesController.DTORespuesta.DocenteDTORespuesta;

@Mapper(componentModel = "spring")
public interface DocenteDTOMapperFH {
    DocenteDTORespuesta toDTO(Docente docente);
    Docente toModel(DocenteDTORespuesta dto);
}
