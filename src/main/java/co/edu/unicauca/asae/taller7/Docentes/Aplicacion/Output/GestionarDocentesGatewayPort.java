package co.edu.unicauca.asae.taller7.Docentes.Aplicacion.Output;

import java.time.LocalTime;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;

public interface GestionarDocentesGatewayPort {
    public Docente guardarDocenteOut(Docente docente);

    public boolean isDocenteOcupado(Integer docenteId, String dia, LocalTime horaInicio, LocalTime horaFin);
}
