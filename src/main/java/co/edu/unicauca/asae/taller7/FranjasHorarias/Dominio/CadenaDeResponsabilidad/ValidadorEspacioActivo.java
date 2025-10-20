package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

public class ValidadorEspacioActivo extends ValidadorBase{
    @Override
    protected boolean manejarValidacion(FranjaHoraria franjaHoraria) {
        EspacioFisico espacioFisico = franjaHoraria.getEspacioFisico();
        if (!espacioFisico.getEstado()){
            respuesta.setCodigoRespuesta("ERROR 102");
            respuesta.setMensaje("No se permite asignar una franja horaria a un espacio físico que está inactivo en el sistema.");
            return false;
        }
        return true;
    }
}
