package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

public class ValidadorHorarioPermitido extends ValidadorBase {

    @Override
    protected boolean manejarValidacion(FranjaHoraria franjaHoraria) {
        int horaInicio = franjaHoraria.getHoraInicio().getHour();
        int horaFin = franjaHoraria.getHoraFin().getHour();
        String dia = franjaHoraria.getDia();

        if ((horaInicio < 6 || horaInicio > 22) || (horaFin < 6 || horaFin > 22) || dia.equalsIgnoreCase("domingo")) {
            respuesta.setCodigoRespuesta("ERROR 101");
            respuesta.setMensaje("No se permite crear una franja horaria en horarios diferentes a 6 am a 10 pm y de lunes a sábado.");
            return false;
        }
        return true;
    }
}
