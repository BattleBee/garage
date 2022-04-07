

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


INSERT INTO employees (employee_name, employee_surname, employee_age,employee_specialization )  VALUES
('Ivan', 'Ivanov', 2001, 'electrik'),
('Petr', 'Petrov', 1990, 'shinomontage'),
('Alexey', 'Smirnov', 1979, 'mekhanik'),
('Sergey', 'Borov', 2000, 'electrik'),
('Danil', 'Belov', 1996, 'kuzovchik');

SELECT * FROM employees;


INSERT INTO details (detail_name, detail_country)  VALUES
('Лобовое стекло', 'Россия'),
('Двигатель', 'Германия'),
('Дверь', 'Россия'),
('Колесо', 'Финляндия'),
('Аккумулятор', 'Япония');

SELECT * FROM details;