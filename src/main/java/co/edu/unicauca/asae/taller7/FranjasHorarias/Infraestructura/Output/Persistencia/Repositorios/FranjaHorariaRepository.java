package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Repositorios;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.FranjaHorariaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FranjaHorariaRepository extends JpaRepository<FranjaHorariaEntity, Integer> {
    List<FranjaHorariaEntity> findFranjaHorariaByCurso_CursoId(Integer curso_id);
}