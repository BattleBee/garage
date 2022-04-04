CREATE TABLE IF NOT EXISTS employee
(
    id SERIAL PRIMARY KEY,
    name  VARCHAR(50) NOT NULL,
    surname VARCHAR(50) NOT NULL,
    age int NOT NULL,
    specialization VARCHAR(50) NOT NULL

);

CREATE TABLE IF NOT EXISTS car
(
    id SERIAL PRIMARY KEY,
    brand  VARCHAR(50) NOT NULL,
    color VARCHAR(50) NOT NULL,
    year int NOT NULL,
    mileage int NOT NULL

);

CREATE TABLE IF NOT EXISTS detail
(
    id SERIAL PRIMARY KEY,
    name  VARCHAR(50) NOT NULL,
    madeIn VARCHAR(50) NOT NULL,
    price int NOT NULL,
    warranty int NOT NULL

);