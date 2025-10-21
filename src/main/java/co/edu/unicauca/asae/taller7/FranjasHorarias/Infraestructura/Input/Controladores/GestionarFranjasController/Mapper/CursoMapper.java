package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.Mapper;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Input.Controladores.GestionarFranjasController.DTORespuesta.CursoDTORespuesta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CursoMapper {
    CursoDTORespuesta toDTO(Curso curso);
    Curso toModel(CursoDTORespuesta dto);
}
