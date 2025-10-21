package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Repositorios;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.FranjaHorariaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FranjaHorariaRepository extends JpaRepository<FranjaHorariaEntity, Integer> {
    List<FranjaHorariaEntity> findFranjaHorariaByCurso_CursoId(Integer curso_id);

    //Listar franja horaria por docente. Este servicio debe mostrar las franjas horarias, espacios físicos y cursos de un docente.
    List<FranjaHorariaEntity> findFranjaHorariaByCurso_Docente_DocenteId(Integer docente_id);
}