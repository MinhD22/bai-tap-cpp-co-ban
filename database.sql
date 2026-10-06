CREATE DATABASE IF NOT EXISTS product_management;
USE product_management;

CREATE TABLE IF NOT EXISTS products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    quantity INT NOT NULL
);

INSERT INTO products (name, price, quantity) VALUES 
('Laptop Dell Inspiron', 15000000, 10),
('Chuột không dây Logitech', 350000, 50),
('Bàn phím cơ Keychron', 1800000, 25);
