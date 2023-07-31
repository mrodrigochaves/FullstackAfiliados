-- Create DB
CREATE DATABASE IF NOT EXISTS transaction_db;

USE transaction_db;

-- Create table transaction_type
CREATE TABLE IF NOT EXISTS transaction_type (
    type_id CHAR(1) PRIMARY KEY,
    description VARCHAR(50),
    nature VARCHAR(10),
    sinal CHAR(1)
);

-- Insert data into transaction_type
INSERT INTO transaction_type (type_id, description, nature, sinal)
VALUES
    ('1', 'Venda produtor', 'Entrada', '+'),
    ('2', 'Venda afiliado', 'Entrada', '+'),
    ('3', 'Comissão paga', 'Saída', '-'),
    ('4', 'Comissão recebida', 'Entrada', '+');

-- Create table transaction
CREATE TABLE IF NOT EXISTS transaction (
    id INT AUTO_INCREMENT PRIMARY KEY,
    type CHAR(1),
    date DATETIME,
    product VARCHAR(30),
    price INT,
    seller VARCHAR(20),
    FOREIGN KEY (type) REFERENCES transaction_type(type_id)
);

-- Insert data into transaction
INSERT INTO transaction (type, date, product, price, seller)
VALUES
    ('1', '2022-01-15 19:20:30', 'CURSO DE BEM-ESTAR', 12750, 'JOSE CARLOS'),
    ('1', '2021-12-03 11:46:02', 'DOMINANDO INVESTIMENTOS', 50000, 'MARIA CANDIDA'),
    ('2', '2022-01-16 14:13:54', 'CURSO DE BEM-ESTAR', 12750, 'THIAGO OLIVEIRA'),
    ('3', '2022-01-16 14:13:54', 'CURSO DE BEM-ESTAR', 4500, 'THIAGO OLIVEIRA'),
    ('4', '2022-01-16 14:13:54', 'CURSO DE BEM-ESTAR', 4500, 'JOSE CARLOS'),
    ('1', '2022-01-22 08:59:13', 'DOMINANDO INVESTIMENTOS', 50000, 'MARIA CANDIDA'),
    ('1', '2022-02-01 23:35:43', 'DESENVOLVEDOR FULL STACK', 155000, 'ELIANA NOGUEIRA'),
    ('2', '2022-02-03 17:23:37', 'DESENVOLVEDOR FULL STACK', 155000, 'CARLOS BATISTA'),
    ('2', '2022-02-03 20:51:59', 'DESENVOLVEDOR FULL STACK', 155000, 'CAROLINA MACHADO'),
    ('2', '2022-02-04 07:42:12', 'DESENVOLVEDOR FULL STACK', 155000, 'CELSO DE MELO'),
    ('3', '2022-02-03 17:23:37', 'DESENVOLVEDOR FULL STACK', 50000, 'CARLOS BATISTA'),
    ('3', '2022-02-03 20:51:59', 'DESENVOLVEDOR FULL STACK', 50000, 'CAROLINA MACHADO'),
    ('3', '2022-02-04 07:42:12', 'DESENVOLVEDOR FULL STACK', 50000, 'CELSO DE MELO'),
    ('4', '2022-02-03 17:23:37', 'DESENVOLVEDOR FULL STACK', 50000, 'ELIANA NOGUEIRA'),
    ('4', '2022-02-03 20:51:59', 'DESENVOLVEDOR FULL STACK', 50000, 'ELIANA NOGUEIRA'),
    ('4', '2022-02-04 07:42:12', 'DESENVOLVEDOR FULL STACK', 50000, 'ELIANA NOGUEIRA'),
    ('1', '2022-02-19 05:33:07', 'DOMINANDO INVESTIMENTOS', 50000, 'MARIA CANDIDA'),
    ('1', '2022-03-01 02:09:54', 'CURSO DE BEM-ESTAR', 12750, 'JOSE CARLOS'),
    ('1', '2022-03-03 09:07:35', 'DESENVOLVEDOR FULL STACK', 155000, 'ELIANA NOGUEIRA'),
    ('1', '2022-03-03 13:12:16', 'DESENVOLVEDOR FULL STACK', 155000, 'ELIANA NOGUEIRA');


