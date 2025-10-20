package co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.CasosDeUso;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Aplicacion.Input.GestionarEspaciosFisicosCUPort;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Aplicacion.Output.GestionarEspaciosFisicosGatewayPort;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;

import java.util.List;

public class GestionarEspaciosFisicosCU implements GestionarEspaciosFisicosCUPort {
    
    private final GestionarEspaciosFisicosGatewayPort gestionarEspaciosFisicosGatewayPort;
    
    public GestionarEspaciosFisicosCU(GestionarEspaciosFisicosGatewayPort gestionarEspaciosFisicosGatewayPort) {
        this.gestionarEspaciosFisicosGatewayPort = gestionarEspaciosFisicosGatewayPort;
    }
    
    @Override
    public EspacioFisico guardarEspacioFisicoIn(EspacioFisico espacioFisico) {
        return gestionarEspaciosFisicosGatewayPort.guardarEspacioFisicoOut(espacioFisico);
    }
    
    @Override
    public List<EspacioFisico> buscarEspaciosFisicosPorPatronYCapacidadIn(String patron, Integer capacidadMinima) {
        return gestionarEspaciosFisicosGatewayPort.buscarEspaciosFisicosPorPatronYCapacidadOut(patron, capacidadMinima);
    }
}