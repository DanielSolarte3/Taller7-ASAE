package co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Repositorios;

import co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Entidades.EspacioFisicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalTime;
import java.util.List;

public interface EspacioFisicoRepository extends JpaRepository<EspacioFisicoEntity, Integer> {
        List<EspacioFisicoEntity> findByNombreStartingWithIgnoreCaseAndCapacidadGreaterThanEqualOrderByNombreAsc(String patron, Integer capacidad);

        @Query("SELECT CASE WHEN COUNT(fh) > 0 THEN true ELSE false END " +
                        "FROM FranjaHorariaEntity fh " +
                        "WHERE fh.espacioFisico.espacioFisicoId = :espacioFisicoId " +
                        "AND fh.dia = :dia " +
                        "AND ((fh.horaInicio < :horaFin AND fh.horaFin > :horaInicio))")
        boolean isEspacioOcupado(@Param("espacioFisicoId") Integer espacioFisicoId, @Param("dia") String dia,
                        @Param("horaInicio") LocalTime horaInicio, @Param("horaFin") LocalTime horaFin);

        @Modifying
        @Query("UPDATE EspacioFisicoEntity es set es.estado = :estado where es.espacioFisicoId= :id")
        void updateEstadoEspacioFisico(Integer id, Boolean estado);
}
