
--INSERT DAYS OF WEEK
INSERT INTO tb06_day (tb06_day_id, tb06_name)
VALUES (1, 'SEGUNDA');
INSERT INTO tb06_day (tb06_day_id, tb06_name)
VALUES (2, 'TERÇA');
INSERT INTO tb06_day (tb06_day_id, tb06_name)
VALUES (3, 'QUARTA');
INSERT INTO tb06_day (tb06_day_id, tb06_name)
VALUES (4, 'QUINTA');
INSERT INTO tb06_day (tb06_day_id, tb06_name)
VALUES (5, 'SEXTA');

-- INSERT ROOM
INSERT INTO tb03_room(tb03_room_id, tb03_description, tb03_name)
VALUES (1, 'Sala de exames', 'Sala-1');
INSERT INTO tb03_room(tb03_room_id, tb03_description, tb03_name)
VALUES (2, 'Sala de exames cardiacos', 'Sala-2');

-- INSERT PATIENT
INSERT INTO tb02_patient(tb02_patient_id, tb02_document_identification, tb02_name)
VALUES (1, '60626882344', 'Ruan Carlos');
INSERT INTO tb02_patient(tb02_patient_id, tb02_document_identification, tb02_name)
VALUES (2, '60626882156', 'Carlos Rubem');

-- INSERT EXAM
INSERT INTO tb01_exam(tb01_exam_id, tb01_description, tb01_name, tb01_price)
VALUES (1, 'Exame de sangue', 'Colesterol', 20);
INSERT INTO tb01_exam(tb01_exam_id, tb01_description, tb01_name, tb01_price)
VALUES (2, 'Exame de vista', 'Oftalmologista', 25);
INSERT INTO tb01_exam(tb01_exam_id, tb01_description, tb01_name, tb01_price)
VALUES (3, 'Exame de sangue', 'Hemograma', 10);
INSERT INTO tb01_exam(tb01_exam_id, tb01_description, tb01_name, tb01_price)
VALUES (4, 'Exame de sangue', 'Glicemia', 10);


-- INSERT SCHEDULE SEGUNDA-FEIRA - SALA 1
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (1, to_timestamp('08:00', 'HH24:MI'), true, to_timestamp('09:00', 'HH24:MI'), 1, 1);

INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (2, to_timestamp('10:00', 'HH24:MI'), true, to_timestamp('11:00', 'HH24:MI'), 1, 1);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (3, to_timestamp('12:00', 'HH24:MI'), true, to_timestamp('13:00', 'HH24:MI'), 1, 1);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (4, to_timestamp('14:00', 'HH24:MI'), true, to_timestamp('15:00', 'HH24:MI'), 1, 1);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (5, to_timestamp('16:00', 'HH24:MI'), true, to_timestamp('17:00', 'HH24:MI'), 1, 1);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (6, to_timestamp('17:00', 'HH24:MI'), true, to_timestamp('18:00', 'HH24:MI'), 1, 1);
--INSERT TERÇA-FEIRA - SALA 1
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (7, to_timestamp('08:00', 'HH24:MI'), true, to_timestamp('09:00', 'HH24:MI'), 2, 1);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (8, to_timestamp('10:00', 'HH24:MI'), true, to_timestamp('11:00', 'HH24:MI'), 2, 1);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (9, to_timestamp('12:00', 'HH24:MI'), true, to_timestamp('13:00', 'HH24:MI'), 2, 1);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (10, to_timestamp('14:00', 'HH24:MI'), true, to_timestamp('15:00', 'HH24:MI'), 2, 1);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (11, to_timestamp('16:00', 'HH24:MI'), true, to_timestamp('17:00', 'HH24:MI'), 2, 1);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (12, to_timestamp('17:00', 'HH24:MI'), true, to_timestamp('18:00', 'HH24:MI'), 2, 1);

--INSERT SEGUNDA-FEIRA - SALA 2
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (13, to_timestamp('08:00', 'HH24:MI'), true, to_timestamp('09:00', 'HH24:MI'), 1, 2);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (14, to_timestamp('10:00', 'HH24:MI'), true, to_timestamp('11:00', 'HH24:MI'), 1, 2);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (15, to_timestamp('12:00', 'HH24:MI'), true, to_timestamp('13:00', 'HH24:MI'), 1, 2);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (16, to_timestamp('14:00', 'HH24:MI'), true, to_timestamp('15:00', 'HH24:MI'), 1, 2);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (17, to_timestamp('16:00', 'HH24:MI'), true, to_timestamp('17:00', 'HH24:MI'), 1, 2);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (18, to_timestamp('17:00', 'HH24:MI'), true, to_timestamp('18:00', 'HH24:MI'), 1, 2);
--INSERT TERÇA-FEIRA - SALA 2
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (19, to_timestamp('08:00', 'HH24:MI'), true, to_timestamp('09:00', 'HH24:MI'), 2, 2);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (20, to_timestamp('10:00', 'HH24:MI'), true, to_timestamp('11:00', 'HH24:MI'), 2, 2);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (21, to_timestamp('12:00', 'HH24:MI'), true, to_timestamp('13:00', 'HH24:MI'), 2, 2);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (22, to_timestamp('14:00', 'HH24:MI'), true, to_timestamp('15:00', 'HH24:MI'), 2, 2);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (24, to_timestamp('16:00', 'HH24:MI'), true, to_timestamp('17:00', 'HH24:MI'), 2, 2);
INSERT INTO tb05_schedule(tb05_schedule_id, tb05_from_hour, tb05_active, tb05_to_hour, tb06_day_id, tb03_room_id)
VALUES (25, to_timestamp('17:00', 'HH24:MI'), true, to_timestamp('18:00', 'HH24:MI'), 2, 2);

COMMIT;