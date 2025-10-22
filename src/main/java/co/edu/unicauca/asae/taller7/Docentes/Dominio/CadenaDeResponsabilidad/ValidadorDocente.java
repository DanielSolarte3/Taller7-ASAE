package co.edu.unicauca.asae.taller7.Docentes.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;

public interface ValidadorDocente {
    void setSiguiente(ValidadorDocente siguiente);
    void validar(Docente docente);
}
