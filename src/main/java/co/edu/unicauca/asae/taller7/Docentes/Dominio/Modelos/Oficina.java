package co.edu.unicauca.asae.taller7.Docentes.Dominio.Modelos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Oficina {
    private Integer oficinaId;
    private String nombre;
    private String ubicacion;
}