package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

public class ValidadorEspacioLibre extends ValidadorBase {

    @Override
    protected boolean manejarValidacion(FranjaHoraria franjaHoraria) {
        if (franjasGateway.espacioEstaOcupado(franjaHoraria.getEspacioFisico().getEspacioFisicoId(),
                                            franjaHoraria.getDia(), franjaHoraria.getHoraInicio(),
                                            franjaHoraria.getHoraFin())){
            franjasFormateadorResultados.retornarRespuestaErrorReglaDeNegocio(
                    "No se permite asignar una franja horaria a un espacio físico (Id espacio: "+ franjaHoraria.getEspacioFisico().getEspacioFisicoId()
                            +") que está ocupado en el día y hora de inicio y hora fin de la nueva franja.");
            return false;
        }
        return true;
    }
}
