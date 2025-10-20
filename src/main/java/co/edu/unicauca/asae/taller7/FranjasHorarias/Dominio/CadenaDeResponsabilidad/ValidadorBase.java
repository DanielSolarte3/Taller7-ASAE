package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

public abstract class ValidadorBase implements ValidadorFranja {

    protected ValidadorFranja siguienteValidador;

    @Override
    public void setSiguiente(ValidadorFranja siguiente) {
        this.siguienteValidador = siguiente;
    }

    @Override
    public void validar(FranjaHoraria franjaHoraria) {
        if(manejarValidacion(franjaHoraria)){
            if(siguienteValidador!=null) {
                siguienteValidador.validar(franjaHoraria);
            }
        }
    }

    protected abstract boolean manejarValidacion(FranjaHoraria franjaHoraria);
}
