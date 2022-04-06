CREATE TABLE IF NOT EXISTS cars
(
    car_id SERIAL PRIMARY KEY,
    car_brand  VARCHAR(50) NOT NULL,
    car_color VARCHAR(50) NOT NULL,
    car_year int NOT NULL,
    car_mileage int NOT NULL

);

INSERT INTO cars (car_brand, car_color, car_year,car_mileage )  VALUES
('BMW', 'RED', 2019, 50000),
('BMW', 'BLACK', 2015, 120000),
('BMW', 'GREEN', 2019, 50000),
('BMW', 'BLUE', 2021, 50000),
('BMW', 'WHITE', 2022, 3000),
('MAZDA', 'RED', 2019, 50000),
('MAZDA', 'BLACK', 2017, 150000),
('MAZDA', 'GREEN', 2019, 40000),
('TOYOTA', 'GREEN', 2019, 53000),
('TOYOTA', 'BLUE', 2021, 30000);

SELECT * FROM cars;

CREATE TABLE IF NOT EXISTS employees
(
    employee_id SERIAL PRIMARY KEY,
    employee_name  VARCHAR(50) NOT NULL,
    employee_surname VARCHAR(50) NOT NULL,
    employee_age int NOT NULL,
    employee_specialization VARCHAR(50) NOT NULL

);

INSERT INTO employees (employee_name, employee_surname, employee_age,employee_specialization )  VALUES
('Ivan', 'Ivanov', 2001, 'electrik'),
('Petr', 'Petrov', 1990, 'shinomontage'),
('Alexey', 'Smirnov', 1979, 'mekhanik'),
('Sergey', 'Borov', 2000, 'electrik'),
('Danil', 'Belov', 1996, 'kuzovchik');

SELECT * FROM employees;

CREATE TABLE IF NOT EXISTS details
(
    detail_id SERIAL PRIMARY KEY,
    detail_name  VARCHAR(50) NOT NULL,
    detail_country VARCHAR(50) NOT NULL
);

INSERT INTO details (detail_name, detail_country)  VALUES
('Лобовое стекло', 'Россия'),
('Двигатель', 'Германия'),
('Дверь', 'Россия'),
('Колесо', 'Финляндия'),
('Аккумулятор', 'Япония');

SELECT * FROM details;