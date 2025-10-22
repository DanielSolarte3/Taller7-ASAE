-- Insertar Personas
INSERT INTO
    persona (nombre, apellido, correo)
VALUES (
        'Jimena',
        'Timaná',
        'jtimana@unicauca.edu.co'
    ),
    (
        'Daniel',
        'Paz',
        'dpaz@unicauca.edu.co'
    ),
    (
        'Pablo',
        'Majé',
        'pmage@unicauca.edu.co'
    ),
    (
        'Francisco',
        'Obando',
        'fobando@unicauca.edu.co'
    ),
    (
        'Vanessa',
        'Agredo',
        'vagredo@unicauca.edu.co'
    ),
    (
        'Sandra Milena',
        'Roa',
        'smroa@unicauca.edu.co'
    ),
    (
        'Cesar',
        'Pardo',
        'cpardo@unicauca.edu.co'
    ),
    (
        'Pablo',
        'Ruiz',
        'pruiz@unicauca.edu.co'
    ),
    (
        'Luz Marina',
        'Sierra',
        'lsierra@unicauca.edu.co'
    ),
    (
        'Wilson Libardo',
        'Pantoja',
        'wpantoja@unicauca.edu.co'
    ),
    (
        'Jorge Adrian',
        'Muñoz',
        'jamunoz@unicauca.edu.co'
    ),
    (
        'Carlos Alberto',
        'Ardila',
        'cardila@unicauca.edu.co'
    ),
    (
        'Carolina',
        'González',
        'cgonzals@unicauca.edu.co'
    ),
    (
        'Erwin',
        'Meza Vega',
        'emezav@unicauca.edu.co'
    ),
    (
        'Jorge',
        'Chaustre',
        'jjmoreno@unicauca.edu.co'
    ),
    (
        'Julio Ariel',
        'Hurtado',
        'ahurtado@unicauca.edu.co'
    ),
    (
        'Carlos Alberto',
        'Cobos',
        'ccobos@unicauca.edu.co'
    ),
    (
        'Francisco José',
        'Pino',
        'fjpino@unicauca.edu.co'
    ),
    (
        'Alejandro',
        'Toledo',
        'atoledo@unicauca.edu.co'
    ),
    (
        'Ricardo',
        'Zambrano',
        'rzambrano@unicauca.edu.co'
    );

-- Insertar Oficinas
INSERT INTO
    oficina (nombre, ubicacion)
VALUES (
        'Oficina 444',
        'Edificio FIET'
    ),
    (
        'Oficina 424',
        'Edificio FIET'
    ),
    (
        'Oficina 412',
        'Edificio FIET'
    ),
    (
        'Oficina 401',
        'Edificio FIET'
    ),
    (
        'Oficina 329',
        'Edificio FIET'
    ),
    (
        'Oficina 450',
        'Edificio FIET'
    ),
    (
        'Oficina 422',
        'Edificio FIET'
    );

-- Insertar Docentes
INSERT INTO
    docente (docenteId, oficinaId)
VALUES (1, 1), -- Jimena Timaná → 444
    (2, NULL), -- Daniel Paz (sin oficina)
    (3, 2), -- Pablo Majé → 424
    (4, NULL), -- Francisco Obando (sin oficina)
    (5, NULL), -- Vanessa Agredo (sin oficina)
    (6, 3), -- Sandra Milena Roa → 412
    (7, NULL), -- Cesar Pardo (sin oficina)
    (8, NULL), -- Pablo Ruiz (sin oficina)
    (9, 1), -- Luz Marina Sierra → 444
    (10, 4), -- Wilson Libardo Pantoja → 401
    (11, NULL), -- Jorge Adrian Muñoz (sin oficina) - ES DOCENTE Y ADMINISTRATIVO
    (12, 5), -- Carlos Alberto Ardila → 329
    (13, 2), -- Carolina González → 424
    (14, 6), -- Erwin Meza Vega → 450
    (15, 7), -- Jorge Chaustre → 422
    (20, NULL);
-- Ricardo Zambrano (nuevo profesor, sin oficina)

-- Insertar Administrativos
INSERT INTO
    administrativo (administrativoId, rol)
VALUES (
        11,
        'Coordinador de Proyectos'
    ), -- Jorge Adrian Muñoz (DOCENTE Y ADMINISTRATIVO)
    (16, 'Director de Programa'), -- Julio Ariel Hurtado
    (17, 'Coordinador Académico'), -- Carlos Alberto Cobos
    (
        18,
        'Coordinador de Investigación'
    ), -- Francisco José Pino
    (
        19,
        'Secretario de Departamento'
    );
-- Alejandro Toledo

-- Insertar Asignaturas (según listado real)
INSERT INTO
    asignatura (nombre, codigo)
VALUES (
        'Calidad de Software',
        'CS-101'
    ),
    (
        'Sistemas Distribuidos',
        'SD-102'
    ),
    (
        'Laboratorio de Sistemas Distribuidos',
        'LSD-103'
    ),
    (
        'Gestión de Proyectos Informáticos',
        'GPI-104'
    ),
    (
        'Arquitectura de la Información para Ambientes Digitales',
        'AIAD-105'
    ),
    (
        'Taller de Metodologías Ágiles',
        'TMA-106'
    ),
    ('Proyecto I', 'P1-107'),
    ('Proyecto II', 'P2-108'),
    ('Bases de Datos', 'BD-109'),
    (
        'Metodología de la Investigación',
        'MI-110'
    ),
    (
        'Ingeniería de Software 2',
        'IS2-111'
    );

-- Insertar Espacios Físicos
INSERT INTO
    espacio_fisico (nombre, capacidad, estado)
VALUES ('Aula 101', 30, true),
    ('Aula 102', 35, true),
    ('Aula 103', 30, true),
    ('Aula 201', 40, true),
    ('Aula 202', 25, true),
    ('Aula 203', 35, true),
    ('Aula 301', 30, true),
    ('Aula 302', 40, true),
    ('Laboratorio 301', 20, true),
    ('Laboratorio 302', 25, true),
    ('Laboratorio 303', 20, true),
    ('Laboratorio 401', 30, true),
    ('Laboratorio 402', 25, true),
    (
        'Auditorio Principal',
        100,
        true
    ),
    ('Auditorio Menor', 60, true),
    (
        'Sala de Conferencias',
        50,
        true
    ),
    (
        'Sala de Reuniones 1',
        15,
        false
    ),
    (
        'Sala de Reuniones 2',
        20,
        true
    );

-- Insertar Cursos
INSERT INTO
    curso (
        nombre,
        asignaturaId,
        capacidadMatricula
    )
VALUES
    -- Calidad de Software
    (
        'Calidad de Software Grupo A',
        1,
        30
    ),
    -- Sistemas Distribuidos
    (
        'Sistemas Distribuidos Grupo A',
        2,
        35
    ),
    (
        'Sistemas Distribuidos Grupo B',
        2,
        30
    ),
    -- Laboratorio de Sistemas Distribuidos
    (
        'Lab Sistemas Distribuidos Grupo A',
        3,
        20
    ),
    (
        'Lab Sistemas Distribuidos Grupo B',
        3,
        20
    ),
    -- Gestión de Proyectos Informáticos
    (
        'Gestión de Proyectos Grupo A',
        4,
        30
    ),
    -- Electivas
    (
        'Arquitectura de la Información Grupo A',
        5,
        25
    ),
    (
        'Taller de Metodologías Ágiles Grupo A',
        6,
        25
    ),
    -- Proyectos
    ('Proyecto I Grupo A', 7, 20),
    ('Proyecto I Grupo B', 7, 20),
    ('Proyecto II Grupo A', 8, 15),
    ('Proyecto II Grupo B', 8, 15),
    -- Bases de Datos
    (
        'Bases de Datos Grupo A',
        9,
        35
    ),
    (
        'Bases de Datos Grupo B',
        9,
        35
    ),
    -- Metodología de la Investigación
    (
        'Metodología de la Investigación Grupo A',
        10,
        30
    ),
    -- Ingeniería de Software 2
    (
        'Ingeniería de Software 2 Grupo A',
        11,
        35
    ),
    (
        'Ingeniería de Software 2 Grupo B',
        11,
        35
    ),
    (
        'Ingeniería de Software 2 Grupo C',
        11,
        30
    ),
    (
        'Ingeniería de Software 2 Grupo D',
        11,
        30
    );

-- Insertar relaciones Curso-Docente
INSERT INTO
    curso_docente (cursoId, docenteId)
VALUES
    -- Calidad de Software - Carlos Ardila
    (1, 12),
    -- Sistemas Distribuidos Grupo A - Erwin Meza
    (2, 14),
    -- Sistemas Distribuidos Grupo B - Daniel Paz y Pablo Majé (JUNTOS)
    (3, 2),
    (3, 3),
    -- Lab SD Grupo A - Daniel Paz y Pablo Majé (JUNTOS)
    (4, 2),
    (4, 3),
    -- Lab SD Grupo B - Pablo Ruiz (SOLO)
    (5, 8),
    -- Gestión de Proyectos Grupo A - Ricardo Zambrano y Luz Marina Sierra (JUNTOS)
    (6, 20),
    (6, 9),
    -- Arquitectura de la Información - Sandra Roa
    (7, 6),
    -- Taller de Metodologías Ágiles - Cesar Pardo
    (8, 7),
    -- Proyecto I Grupo A - Francisco Obando
    (9, 4),
    -- Proyecto I Grupo B - Francisco Obando
    (10, 4),
    -- Proyecto II Grupo A - Jorge Adrian Muñoz
    (11, 11),
    -- Proyecto II Grupo B - Jorge Adrian Muñoz
    (12, 11),
    -- Bases de Datos Grupo A - Jimena Timaná
    (13, 1),
    -- Bases de Datos Grupo B - Jimena Timaná
    (14, 1),
    -- Metodología Grupo A - Vanessa Agredo y Carolina González (JUNTOS)
    (15, 5),
    (15, 13),
    -- IS2 Grupo A - Pablo Ruiz (SOLO)
    (16, 8),
    -- IS2 Grupo B - Ricardo Zambrano (SOLO)
    (17, 20),
    -- IS2 Grupo C - Jorge Chaustre (SOLO)
    (18, 15),
    -- IS2 Grupo D - Wilson Pantoja (SOLO)
    (19, 10);

-- Insertar Franjas Horarias
INSERT INTO
    franja_horaria (
        dia,
        horaInicio,
        horaFin,
        cursoId,
        espacioFisicoId
    )
VALUES
    -- === LUNES ===
    (
        'Lunes',
        '06:00:00',
        '08:00:00',
        1,
        1
    ), -- Calidad Software → Aula 101
    (
        'Lunes',
        '08:00:00',
        '10:00:00',
        2,
        2
    ), -- SD Grupo A (Erwin) → Aula 102
    (
        'Lunes',
        '10:00:00',
        '12:00:00',
        4,
        9
    ), -- Lab SD A (Daniel+Pablo M) → Lab 301
    (
        'Lunes',
        '12:00:00',
        '14:00:00',
        6,
        3
    ), -- Gestión Proyectos (Ricardo+Luz) → Aula 103
    (
        'Lunes',
        '14:00:00',
        '16:00:00',
        7,
        5
    ), -- Arquitectura Info → Aula 202
    (
        'Lunes',
        '16:00:00',
        '18:00:00',
        9,
        6
    ), -- Proyecto I A → Aula 203
    (
        'Lunes',
        '18:00:00',
        '20:00:00',
        13,
        2
    ), -- BD A (Jimena) → Aula 102

-- === MARTES ===
(
    'Martes',
    '06:00:00',
    '08:00:00',
    3,
    7
), -- SD Grupo B (Daniel+Pablo M) → Aula 301
(
    'Martes',
    '08:00:00',
    '10:00:00',
    5,
    10
), -- Lab SD B (Pablo R) → Lab 302
(
    'Martes',
    '10:00:00',
    '12:00:00',
    8,
    5
), -- Taller Metodologías → Aula 202
(
    'Martes',
    '12:00:00',
    '14:00:00',
    11,
    4
), -- Proyecto II A → Aula 201
(
    'Martes',
    '14:00:00',
    '16:00:00',
    15,
    7
), -- Metodología (Vanessa+Carolina) → Aula 301
(
    'Martes',
    '16:00:00',
    '18:00:00',
    16,
    2
), -- IS2 A (Pablo R) → Aula 102
(
    'Martes',
    '18:00:00',
    '20:00:00',
    17,
    3
), -- IS2 B (Ricardo) → Aula 103

-- === MIÉRCOLES ===
(
    'Miércoles',
    '06:00:00',
    '08:00:00',
    1,
    1
), -- Calidad Software → Aula 101
(
    'Miércoles',
    '08:00:00',
    '10:00:00',
    2,
    4
), -- SD Grupo A (Erwin) → Aula 201
(
    'Miércoles',
    '10:00:00',
    '12:00:00',
    4,
    9
), -- Lab SD A (Daniel+Pablo M) → Lab 301
(
    'Miércoles',
    '12:00:00',
    '14:00:00',
    10,
    6
), -- Proyecto I B → Aula 203
(
    'Miércoles',
    '14:00:00',
    '16:00:00',
    14,
    8
), -- BD B (Jimena) → Aula 302
(
    'Miércoles',
    '16:00:00',
    '18:00:00',
    18,
    7
), -- IS2 C (Jorge C) → Aula 301
(
    'Miércoles',
    '18:00:00',
    '20:00:00',
    19,
    3
), -- IS2 D (Wilson) → Aula 103

-- === JUEVES ===
(
    'Jueves',
    '06:00:00',
    '08:00:00',
    3,
    3
), -- SD Grupo B (Daniel+Pablo M) → Aula 103
(
    'Jueves',
    '08:00:00',
    '10:00:00',
    5,
    10
), -- Lab SD B (Pablo R) → Lab 302
(
    'Jueves',
    '10:00:00',
    '12:00:00',
    6,
    12
), -- Gestión Proyectos (Ricardo+Luz) → Lab 401
(
    'Jueves',
    '12:00:00',
    '14:00:00',
    7,
    5
), -- Arquitectura Info → Aula 202
(
    'Jueves',
    '14:00:00',
    '16:00:00',
    12,
    4
), -- Proyecto II B → Aula 201
(
    'Jueves',
    '16:00:00',
    '18:00:00',
    16,
    2
), -- IS2 A (Pablo R) → Aula 102
(
    'Jueves',
    '18:00:00',
    '20:00:00',
    13,
    8
), -- BD A (Jimena) → Aula 302

-- === VIERNES ===
(
    'Viernes',
    '06:00:00',
    '08:00:00',
    8,
    5
), -- Taller Metodologías → Aula 202
(
    'Viernes',
    '08:00:00',
    '10:00:00',
    9,
    6
), -- Proyecto I A → Aula 203
(
    'Viernes',
    '10:00:00',
    '12:00:00',
    11,
    1
), -- Proyecto II A → Aula 101
(
    'Viernes',
    '12:00:00',
    '14:00:00',
    14,
    8
), -- BD B (Jimena) → Aula 302
(
    'Viernes',
    '14:00:00',
    '16:00:00',
    15,
    7
), -- Metodología (Vanessa+Carolina) → Aula 301
(
    'Viernes',
    '16:00:00',
    '18:00:00',
    17,
    3
), -- IS2 B (Ricardo) → Aula 103
(
    'Viernes',
    '18:00:00',
    '20:00:00',
    19,
    7
), -- IS2 D (Wilson) → Aula 301

-- === SÁBADO ===
(
    'Sábado',
    '08:00:00',
    '10:00:00',
    10,
    6
), -- Proyecto I B → Aula 203
(
    'Sábado',
    '10:00:00',
    '12:00:00',
    12,
    4
), -- Proyecto II B → Aula 201
(
    'Sábado',
    '12:00:00',
    '14:00:00',
    18,
    7
), -- IS2 C (Jorge C) → Aula 301
(
    'Sábado',
    '14:00:00',
    '16:00:00',
    2,
    14
), -- SD Grupo A (Erwin) → Auditorio Menor
(
    'Sábado',
    '16:00:00',
    '18:00:00',
    6,
    15
);
-- Gestión Proyectos (Ricardo+Luz) → Sala Conferencias

-- ====================================================
-- RESUMEN DE DATOS:
-- ====================================================
-- 20 Personas (16 Docentes, 5 Administrativos)
-- NOTA: Jorge Adrian Muñoz (ID 11) es DOCENTE Y ADMINISTRATIVO
-- 7 Oficinas en Edificio FIET
-- 11 Asignaturas del programa
-- 18 Espacios Físicos (17 activos, 1 inactivo)
-- 19 Cursos
-- 40 Franjas Horarias (Lunes a Sábado)
-- ====================================================
