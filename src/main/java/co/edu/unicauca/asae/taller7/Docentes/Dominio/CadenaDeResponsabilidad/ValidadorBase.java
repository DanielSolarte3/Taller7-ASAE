package co.edu.unicauca.asae.taller7.Docentes.Dominio.CadenaDeResponsabilidad;

import co.edu.unicauca.asae.taller7.Commons.Aplicacion.Output.FormateadorResultadosPort;
import co.edu.unicauca.asae.taller7.Docentes.Aplicacion.Output.GestionarDocentesGatewayPort;
import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;

public abstract class ValidadorBase implements ValidadorDocente {

    protected ValidadorDocente siguienteValidador;

    protected FormateadorResultadosPort formateadorResultados;
    protected GestionarDocentesGatewayPort docentesGateway;

    protected ValidadorBase (FormateadorResultadosPort formateadorResultados,
                   GestionarDocentesGatewayPort docentesGateway) {
        this.formateadorResultados = formateadorResultados;
        this.docentesGateway = docentesGateway;
    }

    @Override
    public void setSiguiente(ValidadorDocente siguiente) {
        this.siguienteValidador = siguiente;
    }

    @Override
    public void validar(Docente docente) {
        if(manejarValidacion(docente)){
            if(siguienteValidador!=null) {
                siguienteValidador.validar(docente);
            }
        }
    }

    protected abstract boolean manejarValidacion(Docente docente);
}
