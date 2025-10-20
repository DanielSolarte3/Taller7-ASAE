package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;


import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

public interface ValidadorFranja {
    void setSiguiente(ValidadorFranja siguiente);
    void validar(FranjaHoraria franjaHoraria);
}
