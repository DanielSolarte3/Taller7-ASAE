package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Repositorios;

import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades.PersonaEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Integer> {
}
