package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades;

import co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades.DocenteEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "curso")
@Data
public class CursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cursoId;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "asignaturaId")
    private AsignaturaEntity asignatura;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "curso_docente",
            joinColumns = @JoinColumn(name = "cursoId"),
            inverseJoinColumns = @JoinColumn(name = "docenteId")
    )
    private List<DocenteEntity> docentes = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "curso")
    private List<FranjaHorariaEntity> franjasHorarias = new ArrayList<>();
}
