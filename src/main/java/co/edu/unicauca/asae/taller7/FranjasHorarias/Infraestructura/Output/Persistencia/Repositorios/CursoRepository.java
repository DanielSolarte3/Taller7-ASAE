package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Repositorios;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.CursoEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<CursoEntity, Integer> {
    List<CursoEntity> findCursoByAsignatura_Nombre(String nombre);

    @Query("SELECT c FROM CursoEntity c " +
            "LEFT JOIN FETCH c.franjas fh " +
            "LEFT JOIN FETCH fh.espacioFisico ef " +
            "WHERE c.cursoId = :cursoId")
    List<CursoEntity> findCursoCompletoConFranjasYEspacios(@Param("cursoId") Integer cursoId);

    @Modifying
    @Query("DELETE FROM FranjaHorariaEntity fh WHERE fh.curso.cursoId = :cursoId")
    int deleteFranjasByCursoId(@Param("cursoId") Integer cursoId);
}
