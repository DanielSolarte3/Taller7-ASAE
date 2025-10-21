package co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Input;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

import java.util.List;

public interface GestionarFranjasCUPort {
    FranjaHoraria guardarFranjaIn(FranjaHoraria franjaHoraria);
    List<FranjaHoraria> listarFranjasPorCursoIn(Integer cursoId);
    List<FranjaHoraria> listarFranjasPorDocenteIn(Integer docenteId);
}
