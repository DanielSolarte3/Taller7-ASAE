package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.FranjasFormateadorResultadosPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ValidadorBase implements ValidadorFranja {

    protected ValidadorFranja siguienteValidador;

    protected FranjasFormateadorResultadosPort franjasFormateadorResultados;
    protected GestionarFranjasGatewayPort franjasGateway;

    protected ValidadorBase (FranjasFormateadorResultadosPort franjasFormateadorResultados,
                   GestionarFranjasGatewayPort franjasGateway) {
        this.franjasFormateadorResultados = franjasFormateadorResultados;
        this.franjasGateway = franjasGateway;
    }


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
