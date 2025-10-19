package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;


public interface ValidadorFranja {
    void setSiguiente(ValidadorFranja siguiente);
    boolean validar(FranjaHoraria franjaHoraria, SaveFranjaDTORespuesta respuesta);
}
