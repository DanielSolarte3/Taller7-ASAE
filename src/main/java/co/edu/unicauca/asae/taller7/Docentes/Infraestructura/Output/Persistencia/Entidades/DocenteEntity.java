package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.CursoEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(name = "docenteId")
@Data
@EqualsAndHashCode(callSuper = true)
public class DocenteEntity extends PersonaEntity {
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "oficinaId")
    private OficinaEntity oficina;

    @ManyToMany(mappedBy = "docentes")
    private List<CursoEntity> cursos;
    

}
