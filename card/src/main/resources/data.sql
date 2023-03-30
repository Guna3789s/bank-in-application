DROP TABLE IF EXISTS cards;

CREATE TABLE `cards` (
`card_id` int NOT NULL,
`customer_id` int AUTO_INCREMENT PRIMARY KEY,
`card_number` varchar(100) NOT NULL,
`card_type` varchar(100) NOT NULL,
`expir_date` date DEFAULT NULL
);

INSERT INTO `cards` (`card_id`,`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (11,1,'12345','CREDIT_CARD',CURDATE());

INSERT INTO `cards` (`card_id`,`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (11,2,'4321','DEBT_CARD',CURDATE());

INSERT INTO `cards` (`card_id`,`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (22,3,'3455','CREDIT_CARD',CURDATE());

INSERT INTO `cards` (`card_id`,`customer_id`,`card_number`, `card_type`, `expir_date`)
VALUES (22,4,'1234','DEBT_CARD',CURDATE());
