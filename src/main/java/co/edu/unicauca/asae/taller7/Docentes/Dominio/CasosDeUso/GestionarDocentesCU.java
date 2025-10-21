package co.edu.unicauca.asae.taller7.Docentes.Dominio.CasosDeUso;

import co.edu.unicauca.asae.taller7.Docentes.Aplicacion.Input.GestionarDocentesCUPort;
import co.edu.unicauca.asae.taller7.Docentes.Aplicacion.Output.GestionarDocentesGatewayPort;
import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GestionarDocentesCU implements GestionarDocentesCUPort{

    private final GestionarDocentesGatewayPort gestionarDocentesGatewayPort;
    
    @Override
    public Docente guardarDocenteIn(Docente docente) {
        return gestionarDocentesGatewayPort.guardarDocenteOut(docente);
    }
    
}
