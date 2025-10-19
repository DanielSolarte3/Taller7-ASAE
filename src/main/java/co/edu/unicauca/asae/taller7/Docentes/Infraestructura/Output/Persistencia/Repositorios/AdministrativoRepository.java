package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Repositorios;

import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades.AdministrativoEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrativoRepository extends JpaRepository<AdministrativoEntity, Integer> {
}
