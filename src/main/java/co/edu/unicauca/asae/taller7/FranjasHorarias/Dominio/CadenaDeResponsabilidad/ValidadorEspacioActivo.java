package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.Taller03.CapaAccesoADatos.Models.EspacioFisicoEntity;
import co.edu.unicauca.asae.Taller03.CapaAccesoADatos.Models.FranjaHorariaEntity;
import co.edu.unicauca.asae.Taller03.FachadaServicios.DTO.SaveFranjaDTORespuesta;
import org.springframework.stereotype.Component;

@Component
public class ValidadorEspacioActivo extends ValidadorBase{
    @Override
    protected boolean manejarValidacion(FranjaHorariaEntity franjaHoraria, SaveFranjaDTORespuesta respuesta) {
        EspacioFisicoEntity espacioFisicoEntity = franjaHoraria.getEspacioFisico();
        if (!espacioFisicoEntity.isActive()){
            respuesta.setCodigoRespuesta("ERROR 102");
            respuesta.setMensaje("No se permite asignar una franja horaria a un espacio físico que está inactivo en el sistema.");
            return false;
        }
        return true;
    }
}
