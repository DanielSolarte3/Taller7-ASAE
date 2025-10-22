-- Insertar Personas
INSERT INTO persona (nombre, apellido, correo) VALUES ('Jimena', 'Timaná', 'jtimana@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Daniel', 'Paz', 'dpaz@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Pablo', 'Majé', 'pmage@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Francisco', 'Obando', 'fobando@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Vanessa', 'Agredo', 'vagredo@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Sandra Milena', 'Roa', 'smroa@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Cesar', 'Pardo', 'cpardo@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Pablo', 'Ruiz', 'pruiz@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Luz Marina', 'Sierra', 'lsierra@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Wilson Libardo', 'Pantoja', 'wpantoja@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Jorge Adrian', 'Muñoz', 'jamunoz@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Carlos Alberto', 'Ardila', 'cardila@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Carolina', 'González', 'cgonzals@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Erwin', 'Meza Vega', 'emezav@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Jorge', 'Chaustre', 'jjmoreno@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Julio Ariel', 'Hurtado', 'ahurtado@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Carlos Alberto', 'Cobos', 'ccobos@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Francisco José', 'Pino', 'fjpino@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Alejandro', 'Toledo', 'atoledo@unicauca.edu.co');
INSERT INTO persona (nombre, apellido, correo) VALUES ('Ricardo', 'Zambrano', 'rzambrano@unicauca.edu.co');

-- Insertar Oficinas
INSERT INTO oficina (nombre, ubicacion) VALUES ('Oficina 444', 'Edificio FIET');
INSERT INTO oficina (nombre, ubicacion) VALUES ('Oficina 424', 'Edificio FIET');
INSERT INTO oficina (nombre, ubicacion) VALUES ('Oficina 412', 'Edificio FIET');
INSERT INTO oficina (nombre, ubicacion) VALUES ('Oficina 401', 'Edificio FIET');
INSERT INTO oficina (nombre, ubicacion) VALUES ('Oficina 329', 'Edificio FIET');
INSERT INTO oficina (nombre, ubicacion) VALUES ('Oficina 450', 'Edificio FIET');
INSERT INTO oficina (nombre, ubicacion) VALUES ('Oficina 422', 'Edificio FIET');

-- Insertar Docentes
INSERT INTO docente (docenteId, oficinaId) VALUES (1, 1);
INSERT INTO docente (docenteId, oficinaId) VALUES (2, NULL);
INSERT INTO docente (docenteId, oficinaId) VALUES (3, 2);
INSERT INTO docente (docenteId, oficinaId) VALUES (4, NULL);
INSERT INTO docente (docenteId, oficinaId) VALUES (5, NULL);
INSERT INTO docente (docenteId, oficinaId) VALUES (6, 3);
INSERT INTO docente (docenteId, oficinaId) VALUES (7, NULL);
INSERT INTO docente (docenteId, oficinaId) VALUES (8, NULL);
INSERT INTO docente (docenteId, oficinaId) VALUES (9, 1);
INSERT INTO docente (docenteId, oficinaId) VALUES (10, 4);
INSERT INTO docente (docenteId, oficinaId) VALUES (11, NULL);
INSERT INTO docente (docenteId, oficinaId) VALUES (12, 5);
INSERT INTO docente (docenteId, oficinaId) VALUES (13, 2);
INSERT INTO docente (docenteId, oficinaId) VALUES (14, 6);
INSERT INTO docente (docenteId, oficinaId) VALUES (15, 7);
INSERT INTO docente (docenteId, oficinaId) VALUES (20, NULL);

-- Insertar Administrativos
INSERT INTO administrativo (administrativoId, rol) VALUES (11, 'Coordinador de Proyectos');
INSERT INTO administrativo (administrativoId, rol) VALUES (16, 'Director de Programa');
INSERT INTO administrativo (administrativoId, rol) VALUES (17, 'Coordinador Académico');
INSERT INTO administrativo (administrativoId, rol) VALUES (18, 'Coordinador de Investigación');
INSERT INTO administrativo (administrativoId, rol) VALUES (19, 'Secretario de Departamento');

-- Insertar Asignaturas
INSERT INTO asignatura (nombre, codigo) VALUES ('Calidad de Software', 'CS-101');
INSERT INTO asignatura (nombre, codigo) VALUES ('Sistemas Distribuidos', 'SD-102');
INSERT INTO asignatura (nombre, codigo) VALUES ('Laboratorio de Sistemas Distribuidos', 'LSD-103');
INSERT INTO asignatura (nombre, codigo) VALUES ('Gestión de Proyectos Informáticos', 'GPI-104');
INSERT INTO asignatura (nombre, codigo) VALUES ('Arquitectura de la Información para Ambientes Digitales', 'AIAD-105');
INSERT INTO asignatura (nombre, codigo) VALUES ('Taller de Metodologías Ágiles', 'TMA-106');
INSERT INTO asignatura (nombre, codigo) VALUES ('Proyecto I', 'P1-107');
INSERT INTO asignatura (nombre, codigo) VALUES ('Proyecto II', 'P2-108');
INSERT INTO asignatura (nombre, codigo) VALUES ('Bases de Datos', 'BD-109');
INSERT INTO asignatura (nombre, codigo) VALUES ('Metodología de la Investigación', 'MI-110');
INSERT INTO asignatura (nombre, codigo) VALUES ('Ingeniería de Software 2', 'IS2-111');

-- Insertar Espacios Físicos
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Aula 101', 30, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Aula 102', 35, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Aula 103', 30, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Aula 201', 40, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Aula 202', 25, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Aula 203', 35, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Aula 301', 30, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Aula 302', 40, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Laboratorio 301', 20, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Laboratorio 302', 25, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Laboratorio 303', 20, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Laboratorio 401', 30, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Laboratorio 402', 25, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Auditorio Principal', 100, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Auditorio Menor', 60, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Sala de Conferencias', 50, true);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Sala de Reuniones 1', 15, false);
INSERT INTO espacio_fisico (nombre, capacidad, estado) VALUES ('Sala de Reuniones 2', 20, true);

-- Insertar Cursos
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Calidad de Software Grupo A', 1, 30);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Sistemas Distribuidos Grupo A', 2, 35);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Sistemas Distribuidos Grupo B', 2, 30);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Lab Sistemas Distribuidos Grupo A', 3, 20);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Lab Sistemas Distribuidos Grupo B', 3, 20);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Gestión de Proyectos Grupo A', 4, 30);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Arquitectura de la Información Grupo A', 5, 25);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Taller de Metodologías Ágiles Grupo A', 6, 25);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Proyecto I Grupo A', 7, 20);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Proyecto I Grupo B', 7, 20);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Proyecto II Grupo A', 8, 15);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Proyecto II Grupo B', 8, 15);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Bases de Datos Grupo A', 9, 35);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Bases de Datos Grupo B', 9, 35);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Metodología de la Investigación Grupo A', 10, 30);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Ingeniería de Software 2 Grupo A', 11, 35);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Ingeniería de Software 2 Grupo B', 11, 35);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Ingeniería de Software 2 Grupo C', 11, 30);
INSERT INTO curso (nombre, asignaturaId, capacidadMatricula) VALUES ('Ingeniería de Software 2 Grupo D', 11, 30);

-- Insertar relaciones Curso-Docente
INSERT INTO curso_docente (cursoId, docenteId) VALUES (1, 12);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (2, 14);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (3, 2);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (3, 3);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (4, 2);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (4, 3);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (5, 8);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (6, 20);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (6, 9);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (7, 6);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (8, 7);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (9, 4);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (10, 4);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (11, 11);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (12, 11);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (13, 1);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (14, 1);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (15, 5);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (15, 13);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (16, 8);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (17, 20);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (18, 15);
INSERT INTO curso_docente (cursoId, docenteId) VALUES (19, 10);

-- Insertar Franjas Horarias
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Lunes', '06:00:00', '08:00:00', 1, 1);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Lunes', '08:00:00', '10:00:00', 2, 2);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Lunes', '10:00:00', '12:00:00', 4, 9);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Lunes', '12:00:00', '14:00:00', 6, 3);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Lunes', '14:00:00', '16:00:00', 7, 5);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Lunes', '16:00:00', '18:00:00', 9, 6);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Lunes', '18:00:00', '20:00:00', 13, 2);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Martes', '06:00:00', '08:00:00', 3, 7);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Martes', '08:00:00', '10:00:00', 5, 10);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Martes', '10:00:00', '12:00:00', 8, 5);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Martes', '12:00:00', '14:00:00', 11, 4);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Martes', '14:00:00', '16:00:00', 15, 7);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Martes', '16:00:00', '18:00:00', 16, 2);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Martes', '18:00:00', '20:00:00', 17, 3);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Miércoles', '06:00:00', '08:00:00', 1, 1);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Miércoles', '08:00:00', '10:00:00', 2, 4);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Miércoles', '10:00:00', '12:00:00', 4, 9);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Miércoles', '12:00:00', '14:00:00', 10, 6);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Miércoles', '14:00:00', '16:00:00', 14, 8);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Miércoles', '16:00:00', '18:00:00', 18, 7);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Miércoles', '18:00:00', '20:00:00', 19, 3);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Jueves', '06:00:00', '08:00:00', 3, 3);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Jueves', '08:00:00', '10:00:00', 5, 10);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Jueves', '10:00:00', '12:00:00', 6, 12);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Jueves', '12:00:00', '14:00:00', 7, 5);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Jueves', '14:00:00', '16:00:00', 12, 4);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Jueves', '16:00:00', '18:00:00', 16, 2);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Jueves', '18:00:00', '20:00:00', 13, 8);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Viernes', '06:00:00', '08:00:00', 8, 5);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Viernes', '08:00:00', '10:00:00', 9, 6);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Viernes', '10:00:00', '12:00:00', 11, 1);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Viernes', '12:00:00', '14:00:00', 14, 8);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Viernes', '14:00:00', '16:00:00', 15, 7);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Viernes', '16:00:00', '18:00:00', 17, 3);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Viernes', '18:00:00', '20:00:00', 19, 7);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Sábado', '08:00:00', '10:00:00', 10, 6);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Sábado', '10:00:00', '12:00:00', 12, 4);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Sábado', '12:00:00', '14:00:00', 18, 7);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Sábado', '14:00:00', '16:00:00', 2, 14);
INSERT INTO franja_horaria (dia, horaInicio, horaFin, cursoId, espacioFisicoId) VALUES ('Sábado', '16:00:00', '18:00:00', 6, 15);
