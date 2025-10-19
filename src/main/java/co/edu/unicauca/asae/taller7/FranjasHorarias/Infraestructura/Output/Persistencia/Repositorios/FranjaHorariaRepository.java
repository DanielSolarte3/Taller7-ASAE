package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Repositorios;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.FranjaHorariaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FranjaHorariaRepository extends JpaRepository<FranjaHorariaEntity, Integer> {
    List<FranjaHorariaEntity> findFranjaHorariaByCurso_CursoId(Integer curso_id);
}