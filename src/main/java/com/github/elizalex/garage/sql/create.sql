CREATE TABLE IF NOT EXISTS employees
(
    id SERIAL PRIMARY KEY,
    name  VARCHAR(50) NOT NULL,
    surname VARCHAR(50) NOT NULL,
    age int NOT NULL,
    specialization VARCHAR(50) NOT NULL

);

CREATE TABLE IF NOT EXISTS cars
(
    id SERIAL PRIMARY KEY,
    brand  VARCHAR(50) NOT NULL,
    color VARCHAR(50) NOT NULL,
    year int NOT NULL,
    mileage int NOT NULL

);

CREATE TABLE IF NOT EXISTS details
(
    id SERIAL PRIMARY KEY,
    name  VARCHAR(50) NOT NULL,
    installOn REFERENCES car(id),
    removeFrom REFERENCES car(id),
    usedBy REFERENCES employee(id)

);

SELECT * FROM cars;
SELECT * FROM employees;
SELECT * FROM details;

SELECT name FROM details WHERE installOn = bmv.get.Id;

SELECT name FROM details WHERE installOn = bmv.get.Id;