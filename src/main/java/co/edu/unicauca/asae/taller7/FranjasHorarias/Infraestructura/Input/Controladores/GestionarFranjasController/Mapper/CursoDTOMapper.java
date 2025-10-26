package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Mapper;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta.CursoDTORespuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CursoDTOMapper {
    @Mapping(target = "docentes.cursos", ignore = true)
    CursoDTORespuesta toDTO(Curso curso);
    Curso toModel(CursoDTORespuesta dto);
}
