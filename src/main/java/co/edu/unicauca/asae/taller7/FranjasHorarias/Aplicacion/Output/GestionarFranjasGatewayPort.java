package co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

import java.time.LocalTime;
import java.util.List;

public interface GestionarFranjasGatewayPort {
    FranjaHoraria guardarFranjaOut(FranjaHoraria franja);
    List<FranjaHoraria> listarFranjasPorCursoOut(Integer idCurso);
    List<FranjaHoraria> listarFranjas();
    boolean espacioEstaOcupado(Integer idEspacio, String dia, LocalTime horaInicio, LocalTime horaFin);
    boolean docenteEstaOcupado(Integer idDocente, String dia, LocalTime horaInicio, LocalTime horaFin);
    EspacioFisico getEspacioFisicoById(Integer idEspacio);
    //Docente getDocenteById(Integer idDocente);
    Curso getCursoById(Integer idCurso);
}
