package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CasosDeUso;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Input.GestionarFranjasCUPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GestionarFranjasCU implements GestionarFranjasCUPort {
    private final GestionarFranjasGatewayPort gestionarFranjasGatewayPort;

    @Override
    public FranjaHoraria guardarFranjaIn(FranjaHoraria franjaHoraria) {
        return gestionarFranjasGatewayPort.guardarFranjaOut(franjaHoraria);
    }

    @Override
    public List<FranjaHoraria> listarFranjasPorCursoIn(Integer cursoId) {
        return gestionarFranjasGatewayPort.listarFranjasPorCursoOut(cursoId);
    }
}
