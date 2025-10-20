package co.edu.unicauca.asae.taller7.EspaciosFisicos.Aplicacion.Input;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import java.util.List;

public interface GestionarEspaciosFisicosCUPort {
    EspacioFisico guardarEspacioFisicoIn(EspacioFisico espacioFisico);
    List<EspacioFisico> buscarEspaciosFisicosPorPatronYCapacidadIn(String patron, Integer capacidadMinima);
}