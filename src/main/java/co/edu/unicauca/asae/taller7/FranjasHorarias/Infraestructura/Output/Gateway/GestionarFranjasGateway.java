package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Gateway;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarFranjasGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.FranjaHoraria;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Mappers.FranjasHorariasMapper;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Repositorios.FranjaHorariaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GestionarFranjasGateway implements GestionarFranjasGatewayPort {

    private final FranjaHorariaRepository franjaHorariaRepository;
    private final FranjasHorariasMapper franjasHorariasMapper;

    @Override
    public FranjaHoraria guardarFranjaOut(FranjaHoraria franja) {
        return franjasHorariasMapper.toModel(franjaHorariaRepository.save(franjasHorariasMapper.toEntity(franja)));
    }

    @Override
    public List<FranjaHoraria> listarFranjasPorCursoOut(Integer idCurso) {
        return franjasHorariasMapper.toModelList(franjaHorariaRepository.findFranjaHorariaByCurso_CursoId(idCurso));
    }
}
