package co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.CadenaDeResponsabilidad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChainConfig {
    @Bean
    public ValidadorHorarioPermitido ConfigChain(ValidadorHorarioPermitido validadorHorarioPermitido,
                       ValidadorEspacioActivo validadorEspacioActivo,
                       ValidadorEspacioLibre validadorEspacioLibre,
                       ValidadorDocenteLibre validadorDocenteLibre) {
        validadorHorarioPermitido.setSiguiente(validadorEspacioActivo);
        validadorEspacioActivo.setSiguiente(validadorEspacioLibre);
        validadorEspacioLibre.setSiguiente(validadorDocenteLibre);
        return validadorHorarioPermitido;
    }
}
