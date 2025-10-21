package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Gateway;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

import co.edu.unicauca.asae.taller7.Docentes.Aplicacion.Output.GestionarDocentesGatewayPort;
import co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos.Docente;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Mappers.DocenteMapper;
import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Repositorios.DocenteRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GestionarDocentesGateway implements GestionarDocentesGatewayPort {
    private final DocenteRepository docenteRepository;
    private final DocenteMapper docenteMapper;

    @Override
    public Docente guardarDocenteOut(Docente docente) {
        return docenteMapper.toModel(docenteRepository.save(docenteMapper.toEntity(docente)));
    }

    @Override
    public boolean isDocenteOcupado(Integer docenteId, String dia, LocalTime horaInicio, LocalTime horaFin) {
        Integer result = docenteRepository.isDocenteOcupado(docenteId, dia, horaInicio, horaFin);
        return result > 0;
    }

    
    
}
