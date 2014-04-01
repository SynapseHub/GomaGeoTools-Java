CREATE DATABASE IF NOT EXISTS `gomageotoolsdb`;
USE `gomageotoolsdb`;
-- MySQL
-- Host : localhost 	Database: gomageotoolsdb
-- -------------------------------------------------------

--
-- Table structure for table `poi`
--

DROP TABLE IF EXISTS `poi`;
CREATE TABLE `poi`(
	`id_poi` varchar(20) NOT NULL,
	`name_poi` varchar(100) NOT NULL,
	`adresse` text,
	 PRIMARY KEY (`id_poi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT=`enregistre les differents poi de la ville`;

