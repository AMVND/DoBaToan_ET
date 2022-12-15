/*CREATE DATABASE*/
CREATE DATABASE `dobatoan_et` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
/*CREATE TABLE article*/
CREATE TABLE `article` (
  `documentcode` int NOT NULL,
  `publishername` varchar(45) DEFAULT NULL,
  `issuenumber` varchar(45) DEFAULT NULL,
  `content` varchar(45) DEFAULT NULL,
  `publicDate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`documentcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*CREATE TABLE books*/
CREATE TABLE `books` (
  `documentcode` int NOT NULL,
  `publishername` varchar(45) DEFAULT NULL,
  `issuenumber` varchar(45) DEFAULT NULL,
  `authorname` varchar(45) DEFAULT NULL,
  `number` int DEFAULT NULL,
  PRIMARY KEY (`documentcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*CREATE TABLE magazine*/
CREATE TABLE `magazine` (
  `documentcode` int NOT NULL,
  `publishername` varchar(45) DEFAULT NULL,
  `issuenumber` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `number` int DEFAULT NULL,
  `month` int DEFAULT NULL,
  PRIMARY KEY (`documentcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
