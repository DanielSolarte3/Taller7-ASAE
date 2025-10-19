package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.Taller03.CapaAccesoADatos.Models.FranjaHorariaEntity;
import co.edu.unicauca.asae.Taller03.FachadaServicios.DTO.SaveFranjaDTORespuesta;

public abstract class ValidadorBase implements ValidadorFranja {

    protected ValidadorFranja siguienteValidador;

    @Override
    public void setSiguiente(ValidadorFranja siguiente) {
        this.siguienteValidador = siguiente;
    }

    @Override
    public boolean validar(FranjaHorariaEntity franjaHoraria, SaveFranjaDTORespuesta respuesta) {
        if(manejarValidacion(franjaHoraria, respuesta)){
            if(siguienteValidador!=null){
                return siguienteValidador.validar(franjaHoraria, respuesta);
            }
            return true;
        }
        return false;
    }

    protected abstract boolean manejarValidacion(FranjaHorariaEntity franjaHoraria, SaveFranjaDTORespuesta respuesta);
}
