package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@PrimaryKeyJoinColumn(name = "administrativoId")
@Data
@EqualsAndHashCode(callSuper = true)
public class AdministrativoEntity extends PersonaEntity {
    private String rol;
}
