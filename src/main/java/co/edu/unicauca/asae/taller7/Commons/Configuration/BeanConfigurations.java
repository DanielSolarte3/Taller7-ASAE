package co.edu.unicauca.asae.taller7.Commons.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Aplicacion.Output.GestionarEspaciosFisicosGatewayPort;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.CasosDeUso.GestionarEspaciosFisicosCU;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarCursosGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad.ValidadorDocenteLibre;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad.ValidadorEspacioActivo;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad.ValidadorEspacioLibre;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad.ValidadorHorarioPermitido;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CasosDeUso.GestionarCursosCU;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CasosDeUso.GestionarFranjasCU;

@Configuration
public class BeanConfigurations {

    @Bean
    public ValidadorHorarioPermitido ConfigChain(GestionarFranjasGatewayPort objGestionarFranjasGatewayPort) {
        ValidadorHorarioPermitido validadorHorarioPermitido = new ValidadorHorarioPermitido();
        ValidadorEspacioActivo validadorEspacioActivo = new ValidadorEspacioActivo();
        ValidadorEspacioLibre validadorEspacioLibre = new ValidadorEspacioLibre(objGestionarFranjasGatewayPort);
        ValidadorDocenteLibre validadorDocenteLibre = new ValidadorDocenteLibre(objGestionarFranjasGatewayPort);

        validadorHorarioPermitido.setSiguiente(validadorEspacioActivo);
        validadorEspacioActivo.setSiguiente(validadorEspacioLibre);
        validadorEspacioLibre.setSiguiente(validadorDocenteLibre);

        return validadorHorarioPermitido;
    }

    @Bean
    public GestionarEspaciosFisicosCU crearGestionarEspaciosFisicosCU(
            GestionarEspaciosFisicosGatewayPort objGestionarEspaciosFisicosGateway) {
        GestionarEspaciosFisicosCU objGestionarEspaciosFisicosCU = new GestionarEspaciosFisicosCU(
                objGestionarEspaciosFisicosGateway);
        return objGestionarEspaciosFisicosCU;
    }

    @Bean
    public GestionarCursosCU crearGestionarCursosCU(GestionarCursosGatewayPort objGestionarCursosGateway) {
        return new GestionarCursosCU(objGestionarCursosGateway);
    }

    @Bean
    public GestionarFranjasCU crearGestionarFranjasCU(GestionarFranjasGatewayPort objGestionarFranjasGatewayPort,
                                                      ValidadorHorarioPermitido validadorHorarioPermitido) {
        return new GestionarFranjasCU(objGestionarFranjasGatewayPort, validadorHorarioPermitido);
    }

}
