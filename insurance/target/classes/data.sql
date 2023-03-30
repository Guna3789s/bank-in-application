DROP TABLE IF EXISTS insurance;

CREATE TABLE `insurance` (
`insurance_number` int AUTO_INCREMENT PRIMARY KEY,
`customer_id` int NOT NULL,
`insurance_type` varchar(100) NOT NULL,
`insurance_amount` varchar(100) NOT NULL,
`due_date` date DEFAULT NULL
);

INSERT INTO `insurance` (`insurance_number`,`customer_id`, `insurance_type`, `insurance_amount`,`due_date`)
VALUES (98765,1,'LIFE INSURANCE',100000,CURDATE());

INSERT INTO `insurance` (`insurance_number`,`customer_id`, `insurance_type`, `insurance_amount`,`due_date`)
VALUES (98875,2,'HEALTH INSURANCE',200000,CURDATE());

INSERT INTO `insurance` (`insurance_number`,`customer_id`, `insurance_type`, `insurance_amount`,`due_date`)
VALUES (43785,3,'LIFE INSURANCE',15000,CURDATE());

INSERT INTO `insurance` (`insurance_number`,`customer_id`, `insurance_type`, `insurance_amount`,`due_date`)
VALUES (98834,4,'HEALTH INSURANCE',120000,CURDATE());
