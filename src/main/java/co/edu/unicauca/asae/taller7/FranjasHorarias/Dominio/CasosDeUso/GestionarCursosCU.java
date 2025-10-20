package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CasosDeUso;

import java.util.List;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Input.GestionarCursosCUPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarCursosGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GestionarCursosCU implements GestionarCursosCUPort {
    private final GestionarCursosGatewayPort gestionarCursosGatewayPort;
    
    @Override
    public List<Curso> buscarCursosPorNombreAsignaturaIn(String nombreAsignatura) {
        return gestionarCursosGatewayPort.buscarCursosPorNombreAsignaturaOut(nombreAsignatura);
    }

    
}
