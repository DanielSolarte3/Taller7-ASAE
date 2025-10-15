package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personaId;

    @Column(nullable = false)
    private String nombre;
    private String apellido;
    @Column(unique=true)
    private String correo;
}
