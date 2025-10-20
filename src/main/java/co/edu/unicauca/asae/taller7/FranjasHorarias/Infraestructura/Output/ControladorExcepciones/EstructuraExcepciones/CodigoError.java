package co.edu.unicauca.asae.taller7.FranjasHorarias.Infraestructura.Output.ControladorExcepciones.EstructuraExcepciones;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum CodigoError {

        ERROR_GENERICO("ERR001", "ERROR GENERICO"),
        ENTIDAD_YA_EXISTE("ERR002", "ERROR ENTIDAD YA EXISTE"),
        ENTIDAD_NO_ENCONTRADA("ERR003", "Entidad no encontrada"),
        VIOLACION_REGLA_DE_NEGOCIO("ERR004", "Regla de negocio violada"),
        CREDENCIALES_INVALIDAS("ERR005", "Error al iniciar sesión, compruebe sus credenciales y vuelva a intentarlo"),
        USUARIO_DESHABILITADO("ERR006",
                        "El usuario no ha sido verificado, por favor revise su correo para verificar su cuenta");

        private final String codigo;
        private final String llaveMensaje;
}
