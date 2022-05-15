CREATE DATABASE `Taboola`;

CREATE TABLE `price_history` (
  `id` int NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `price` decimal(19,4) NOT NULL,
  PRIMARY KEY (`id`,`start_date`,`end_date`),
  CONSTRAINT `fk1` FOREIGN KEY (`id`) REFERENCES `products` (`id`)
);

CREATE TABLE `products` (
  `id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `category` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);

SELECT *
FROM products AS p
JOIN price_history AS ph
ON p.id = ph.id;


