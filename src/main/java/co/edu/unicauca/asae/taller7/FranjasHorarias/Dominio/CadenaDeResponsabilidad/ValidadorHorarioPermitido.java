package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.Taller03.CapaAccesoADatos.Models.DiaEnum;
import co.edu.unicauca.asae.Taller03.CapaAccesoADatos.Models.FranjaHorariaEntity;
import co.edu.unicauca.asae.Taller03.FachadaServicios.DTO.SaveFranjaDTORespuesta;
import org.springframework.stereotype.Component;

@Component
public class ValidadorHorarioPermitido extends ValidadorBase {

    @Override
    protected boolean manejarValidacion(FranjaHorariaEntity franjaHoraria, SaveFranjaDTORespuesta respuesta) {
        int horaInicio = franjaHoraria.getHoraInicio().getHour();
        int horaFin = franjaHoraria.getHoraFin().getHour();
        DiaEnum dia = franjaHoraria.getDia();

        if ((horaInicio < 6 || horaInicio > 22) || (horaFin < 6 || horaFin > 22) || dia == DiaEnum.DOMINGO) {
            respuesta.setCodigoRespuesta("ERROR 101");
            respuesta.setMensaje("No se permite crear una franja horaria en horarios diferentes a 6 am a 10 pm y de lunes a sábado.");
            return false;
        }
        return true;
    }
}
