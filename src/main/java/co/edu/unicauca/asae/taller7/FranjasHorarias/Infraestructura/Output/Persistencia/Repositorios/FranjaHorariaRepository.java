package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Repositorios;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.FranjaHorariaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FranjaHorariaRepository extends JpaRepository<FranjaHorariaEntity, Integer> {

    List<FranjaHorariaEntity> findFranjaHorariaByCurso_CursoId(Integer curso_id);

    // Listar franja horaria por docente. Este servicio debe mostrar las franjas
    // horarias, espacios físicos y cursos de un docente.
    @Query("SELECT f FROM FranjaHorariaEntity f " +
            "JOIN f.curso c " +
            "JOIN c.docentes d " +
            "WHERE d.personaId = :docenteId")
    List<FranjaHorariaEntity> findFranjaHorariaByCurso_Docentes_DocenteId(@Param("docenteId") Integer docente_id);
}
