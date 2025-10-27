package co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones.EstructuraExcepciones.CodigoError;
import co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones.EstructuraExcepciones.Error;
import co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones.EstructuraExcepciones.ErrorUtils;
import co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones.ExcepcionesPropias.EntidadNoExisteException;
import co.edu.unicauca.asae.taller7.Commons.Infraestructura.Output.ControladorExcepciones.ExcepcionesPropias.ReglaNegocioException;

import java.util.Locale;
import java.util.stream.Collectors;

@ControllerAdvice
public class RestApiExceptionHandler {

        @ExceptionHandler(Exception.class)
        public ResponseEntity<Object> handleGenericException(final HttpServletRequest req,
                        final Exception exception,
                        final Locale locale) {
                final Error error = ErrorUtils.crearError(
                                CodigoError.ERROR_GENERICO.getCodigo(),
                                CodigoError.ERROR_GENERICO.getLlaveMensaje(),
                                HttpStatus.INTERNAL_SERVER_ERROR.value())
                                .setUrl(req.getRequestURL().toString());

                return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        @ExceptionHandler(ReglaNegocioException.class)
        public ResponseEntity<Error> handleGenericException(final HttpServletRequest req,
                        final ReglaNegocioException ex, final Locale locale) {
                final Error error = ErrorUtils.crearError(
                                CodigoError.VIOLACION_REGLA_DE_NEGOCIO.getCodigo(),
                                ex.formatException(),
                                HttpStatus.BAD_REQUEST.value())
                                .setUrl(req.getRequestURL().toString()).setMetodo(req.getMethod());

                return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }

        @ExceptionHandler(EntidadNoExisteException.class)
        public ResponseEntity<Error> handleGenericException(final HttpServletRequest req,
                        final EntidadNoExisteException ex, final Locale locale) {
                final Error error = ErrorUtils.crearError(
                                CodigoError.ENTIDAD_NO_ENCONTRADA.getCodigo(),
                                String.format("%s, %s", CodigoError.ENTIDAD_NO_ENCONTRADA.getLlaveMensaje(),
                                                ex.getMessage()),
                                HttpStatus.NOT_FOUND.value())
                                .setUrl(req.getRequestURL().toString()).setMetodo(req.getMethod());

                return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }

        @ResponseStatus(HttpStatus.BAD_REQUEST)
        @ExceptionHandler(ConstraintViolationException.class)
        public ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException e) {
                return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

        @ResponseStatus(HttpStatus.BAD_REQUEST)
        @ExceptionHandler(MethodArgumentNotValidException.class)
        public ResponseEntity<Error> handleMethodArgumentNotValidException(
                        final HttpServletRequest req,
                        final MethodArgumentNotValidException ex,
                        final Locale locale) {
                
                String errores = ex.getBindingResult()
                        .getFieldErrors()
                        .stream()
                        .map(error -> error.getField() + ": " + error.getDefaultMessage())
                        .collect(Collectors.joining(", "));

                final Error error = ErrorUtils.crearError(
                                CodigoError.VIOLACION_REGLA_DE_NEGOCIO.getCodigo(),
                                errores,
                                HttpStatus.BAD_REQUEST.value())
                                .setUrl(req.getRequestURL().toString())
                                .setMetodo(req.getMethod());

                return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
}
