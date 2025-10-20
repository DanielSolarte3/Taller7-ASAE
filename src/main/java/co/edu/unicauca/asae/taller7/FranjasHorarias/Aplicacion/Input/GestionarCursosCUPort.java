package co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Input;

import java.util.List;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;

public interface GestionarCursosCUPort {
    public List<Curso> buscarCursosPorNombreAsignaturaIn(String nombreAsignatura);
}
