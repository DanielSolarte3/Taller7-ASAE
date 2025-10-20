package co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

import java.util.List;

public interface GestionarFranjasGatewayPort {
    FranjaHoraria guardarFranjaOut(FranjaHoraria franja);
    List<FranjaHoraria> listarFranjasPorCursoOut(Integer idCurso);
    List<FranjaHoraria> listarFranjas();
}
