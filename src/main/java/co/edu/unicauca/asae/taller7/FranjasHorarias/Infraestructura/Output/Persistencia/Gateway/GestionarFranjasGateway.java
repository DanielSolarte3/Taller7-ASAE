package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Gateway;

import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Repositorios.DocenteRepository;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Repositorios.EspacioFisicoRepository;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Mappers.FranjasHorariasMapper;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Repositorios.FranjaHorariaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GestionarFranjasGateway implements GestionarFranjasGatewayPort {

    private final FranjaHorariaRepository franjaHorariaRepository;
    private final FranjasHorariasMapper franjasHorariasMapper;
    private final EspacioFisicoRepository espacioFisicoRepository;
    private final DocenteRepository docenteRepository;

    @Override
    public FranjaHoraria guardarFranjaOut(FranjaHoraria franja) {
        return franjasHorariasMapper.toModel(franjaHorariaRepository.save(franjasHorariasMapper.toEntity(franja)));
    }

    @Override
    public List<FranjaHoraria> listarFranjasPorCursoOut(Integer idCurso) {
        return franjasHorariasMapper.toModelList(franjaHorariaRepository.findFranjaHorariaByCurso_CursoId(idCurso));
    }

    @Override
    public List<FranjaHoraria> listarFranjas() {
        return franjasHorariasMapper.toModelList(franjaHorariaRepository.findAll());
    }

    @Override
    public boolean espacioEstaOcupado(Integer idEspacio, String dia, LocalTime horaInicio, LocalTime horaFin) {
        return espacioFisicoRepository.isEspacioOcupado(idEspacio, dia, horaInicio, horaFin) > 0;
    }

    @Override
    public boolean docenteEstaOcupado(Integer idDocente, String dia, LocalTime horaInicio, LocalTime horaFin) {
        return docenteRepository.isDocenteOcupado(idDocente, dia, horaInicio, horaFin) > 0;
    }
}
