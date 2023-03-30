DROP TABLE IF EXISTS loans;

CREATE TABLE `loans` (
`loan_number` int AUTO_INCREMENT PRIMARY KEY,
`customer_id` int NOT NULL,
`loan_type` varchar(100) NOT NULL,
`loan_amount` int NOT NULL,
`due_date` date DEFAULT NULL
);

INSERT INTO `loans` (`loan_number`,`customer_id`,`loan_type`,`loan_amount`,`due_date`)
VALUES (98765,1,'Home Loan',100000,CURDATE());

INSERT INTO `loans` (`loan_number`,`customer_id`,`loan_type`,`loan_amount`,`due_date`)
VALUES (98875,2,'Car Loan',200000,CURDATE());

INSERT INTO `loans` (`loan_number`,`customer_id`,`loan_type`,`loan_amount`,`due_date`)
VALUES (43785,3,'Persional Loan',15000,CURDATE());

INSERT INTO `loans` (`loan_number`,`customer_id`,`loan_type`,`loan_amount`,`due_date`)
VALUES (98834,4,'Bike Loan',120000,CURDATE());
