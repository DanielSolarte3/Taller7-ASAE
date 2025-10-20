package co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Gateway;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Aplicacion.Output.GestionarEspaciosFisicosGatewayPort;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Dominio.Modelos.EspacioFisico;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Mappers.EspacioFisicoMapper;
import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Repositorios.EspacioFisicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GestionarEspaciosFisicosGateway implements GestionarEspaciosFisicosGatewayPort {
    private final EspacioFisicoRepository espacioFisicoRepository;
    private final EspacioFisicoMapper espacioFisicoMapper;

    @Override
    public EspacioFisico guardarEspacioFisicoOut(EspacioFisico espacioFisico) {
        return espacioFisicoMapper.toModel(espacioFisicoRepository.save(espacioFisicoMapper.toEntity(espacioFisico)));
    }

    @Override
    public List<EspacioFisico> buscarEspaciosFisicosPorPatronYCapacidadOut(String patron, Integer capacidadMinima) {
        return espacioFisicoMapper.toModelList(espacioFisicoRepository.findByNombreStartingWithIgnoreCaseAndCapacidadGreaterThanEqualOrderByNombreAsc(patron, capacidadMinima));
    }
}
