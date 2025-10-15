package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "asignatura")
@Data
public class AsignaturaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer asignaturaId;

    private String nombre;
    @Column(unique=true)
    private String codigo;
}
