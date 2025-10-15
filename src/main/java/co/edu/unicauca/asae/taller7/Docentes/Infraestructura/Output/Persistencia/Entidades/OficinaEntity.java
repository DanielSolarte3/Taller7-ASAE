package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "oficina")
@Data
public class OficinaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer oficinaId;

    @Column(unique = true, nullable = false)
    private String nombre;
    private String ubicacion;
}
