package co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output;

import java.util.List;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;

public interface GestionarCursosGatewayPort {
        List<Curso> buscarCursosPorNombreAsignaturaOut(String nombreAsignatura);
}
