package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.Commons.Aplicacion.Output.FormateadorResultadosPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;

public class ValidadorEspacioLibre extends ValidadorBase {

    public ValidadorEspacioLibre(FormateadorResultadosPort franjasFormateadorResultados, GestionarFranjasGatewayPort franjasGateway) {
        super(franjasFormateadorResultados, franjasGateway);
    }

    @Override
    protected boolean manejarValidacion(FranjaHoraria franjaHoraria) {
        if (franjasGateway.espacioEstaOcupado(franjaHoraria.getEspacioFisico().getEspacioFisicoId(),
                                            franjaHoraria.getDia(), franjaHoraria.getHoraInicio(),
                                            franjaHoraria.getHoraFin())){
            formateadorResultados.retornarRespuestaErrorReglaDeNegocio(
                    "franjaHoraria.espacio.ocupado");
            return false;
        }
        return true;
    }
}

