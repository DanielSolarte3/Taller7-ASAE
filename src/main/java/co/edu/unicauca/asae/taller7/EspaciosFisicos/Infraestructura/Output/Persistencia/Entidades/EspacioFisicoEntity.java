package co.edu.unicauca.asae.taller7.EspaciosFisicos.Infraestructura.Output.Persistencia.Entidades;

import co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.Persistencia.Entidades.FranjaHorariaEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "espacio_fisico")
@Data
public class EspacioFisicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer espacioFisicoId;

    @Column(unique = true, nullable = false)
    private String nombre;

    private Integer capacidad;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "espacioFisico")
    private List<FranjaHorariaEntity> franjasHorarias;

    private Boolean estado;
}
