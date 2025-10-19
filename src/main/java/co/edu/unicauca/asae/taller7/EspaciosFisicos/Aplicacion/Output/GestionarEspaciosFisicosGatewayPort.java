package co.edu.unicauca.asae.taller7.EspaciosFisicos.Aplicacion.Output;

import java.util.List;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;

public interface GestionarEspaciosFisicosGatewayPort {
    EspacioFisico guardarEspacioFisicoOut(EspacioFisico espacioFisico);
    List<EspacioFisico> buscarEspaciosFisicosPorNombreOut(String nombre);
    List<EspacioFisico> buscarEspaciosFisicosPorPatronYCapacidadOut(String patron, Integer capacidadMinima);
}