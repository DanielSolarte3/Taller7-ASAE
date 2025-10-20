package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Gateway;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Aplicacion.Output.GestionarCursosGatewayPort;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Dominio.Modelos.Curso;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.CursoEntity;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Mappers.CursoMapper;
import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Repositorios.CursoRepository;

@Service
@RequiredArgsConstructor
public class GestionarCursoGatewayImplAdapter implements GestionarCursosGatewayPort {

    private final CursoRepository cursoRepository;
    private final CursoMapper cursosEntityMapper;

    @Override
    public List<Curso> buscarCursosPorNombreAsignaturaOut(String nombreAsignatura) {
        List<CursoEntity> lista = this.cursoRepository.findCursoByAsignatura_Nombre(nombreAsignatura);
        return cursosEntityMapper.toModel(lista);
    }
    
}
