package co.edu.unicauca.asae.taller7.Docentes.Infraestructura.Output.Persistencia.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity
@PrimaryKeyJoinColumn(name = "administrativoId")
@Data
public class AdministrativoEntity extends PersonaEntity {
    private String rol;
}
