package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Repositorios;

import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades.DocenteEntity;

import java.time.LocalTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DocenteRepository extends JpaRepository<DocenteEntity, Integer> {
        @Query(value = "SELECT COUNT(fh.franjaId) " +
                        "FROM franja_horaria fh " +
                        "INNER JOIN curso c ON fh.cursoId = c.cursoId " +
                        "INNER JOIN curso_docente cd ON c.cursoId = cd.cursoId " +
                        "INNER JOIN docente d ON cd.docenteId = d.docenteId " +
                        "WHERE d.docenteId = :docenteId " +
                        "AND fh.dia = :dia " +
                        "AND (fh.horaInicio < :horaFin AND fh.horaFin > :horaInicio)", nativeQuery = true)
        Integer isDocenteOcupado(@Param("docenteId") int docenteId,
                        @Param("dia") String dia,
                        @Param("horaInicio") LocalTime horaInicio,
                        @Param("horaFin") LocalTime horaFin);

}
