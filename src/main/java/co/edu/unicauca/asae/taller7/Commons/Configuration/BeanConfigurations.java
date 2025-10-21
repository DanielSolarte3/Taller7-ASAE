package co.edu.unicauca.asae.taller7.Commons.Configuration;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.FranjasFormateadorResultadosPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad.ValidadorExistenEntidades;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Aplicacion.Output.GestionarEspaciosFisicosGatewayPort;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.CasosDeUso.GestionarEspaciosFisicosCU;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarCursosGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad.ValidadorDocenteLibre;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad.ValidadorEspacioLibre;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CasosDeUso.GestionarCursosCU;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CasosDeUso.GestionarFranjasCU;

@Configuration
public class BeanConfigurations {

    @Bean
    public ValidadorExistenEntidades ConfigChain(FranjasFormateadorResultadosPort franjasFormateadorResultados,
                                                 GestionarFranjasGatewayPort gestionarFranjas) {
        ValidadorEspacioLibre validadorEspacioLibre = new ValidadorEspacioLibre(franjasFormateadorResultados, gestionarFranjas);
        ValidadorDocenteLibre validadorDocenteLibre = new ValidadorDocenteLibre(franjasFormateadorResultados, gestionarFranjas);
        ValidadorExistenEntidades validadorExistenEntidades = new ValidadorExistenEntidades(franjasFormateadorResultados, gestionarFranjas);

        validadorExistenEntidades.setSiguiente(validadorEspacioLibre);
        validadorEspacioLibre.setSiguiente(validadorDocenteLibre);

        return validadorExistenEntidades;
    }

    @Bean
    public GestionarEspaciosFisicosCU crearGestionarEspaciosFisicosCU(
            GestionarEspaciosFisicosGatewayPort objGestionarEspaciosFisicosGateway) {
        return new GestionarEspaciosFisicosCU(objGestionarEspaciosFisicosGateway);
    }

    @Bean
    public GestionarCursosCU crearGestionarCursosCU(GestionarCursosGatewayPort objGestionarCursosGateway) {
        return new GestionarCursosCU(objGestionarCursosGateway);
    }

    @Bean
    public GestionarFranjasCU crearGestionarFranjasCU(GestionarFranjasGatewayPort objGestionarFranjasGatewayPort,
                                                      ValidadorExistenEntidades validadorExistenEntidades) {
        return new GestionarFranjasCU(objGestionarFranjasGatewayPort, validadorExistenEntidades);
    }

}
