package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.Taller03.CapaAccesoADatos.Models.FranjaHorariaEntity;
import co.edu.unicauca.asae.Taller03.FachadaServicios.DTO.SaveFranjaDTORespuesta;

public interface ValidadorFranja {
    void setSiguiente(ValidadorFranja siguiente);
    boolean validar(FranjaHorariaEntity franjaHoraria, SaveFranjaDTORespuesta respuesta);
}
