-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               5.5.28 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for sms
CREATE DATABASE IF NOT EXISTS `sms` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `sms`;


-- Dumping structure for table sms.address
DROP TABLE IF EXISTS `address`;
CREATE TABLE IF NOT EXISTS `address` (
  `from_date` date DEFAULT NULL,
  `to_date` date DEFAULT NULL,
  `country_id` decimal(11,0) DEFAULT NULL,
  `address_id` decimal(9,0) NOT NULL,
  `state_id` decimal(9,0) DEFAULT NULL,
  `city_id` decimal(9,0) DEFAULT NULL,
  `zip_code_id` decimal(9,0) DEFAULT NULL,
  `address_line_one` varchar(255) DEFAULT NULL,
  `address_line_two` varchar(255) DEFAULT NULL,
  `full_address` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.address: ~0 rows (approximately)
DELETE FROM `address`;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;


-- Dumping structure for table sms.address_type
DROP TABLE IF EXISTS `address_type`;
CREATE TABLE IF NOT EXISTS `address_type` (
  `address_type_id` decimal(9,0) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`address_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.address_type: ~0 rows (approximately)
DELETE FROM `address_type`;
/*!40000 ALTER TABLE `address_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `address_type` ENABLE KEYS */;


-- Dumping structure for table sms.app_user
DROP TABLE IF EXISTS `app_user`;
CREATE TABLE IF NOT EXISTS `app_user` (
  `person_id` decimal(9,0) DEFAULT NULL,
  `app_user_id` decimal(9,0) NOT NULL,
  `primary_user_type` decimal(9,0) DEFAULT NULL,
  `person_detail_id` decimal(9,0) DEFAULT NULL,
  `user_date` date DEFAULT NULL,
  `app_user_no` varchar(32) DEFAULT NULL,
  `registration_date` varchar(18) DEFAULT NULL,
  `user_no` varchar(32) DEFAULT NULL,
  `family_no` varchar(32) DEFAULT NULL,
  `user_status` decimal(9,0) DEFAULT NULL,
  `is_activated` varchar(1) DEFAULT NULL,
  `family_unit_id` decimal(9,0) DEFAULT NULL,
  `relation_type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`app_user_id`),
  KEY `R_1` (`person_id`),
  KEY `R_2` (`primary_user_type`),
  KEY `R_4` (`person_detail_id`),
  KEY `R_76` (`family_unit_id`),
  KEY `R_78` (`relation_type_id`),
  CONSTRAINT `app_user_ibfk_1` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`),
  CONSTRAINT `app_user_ibfk_2` FOREIGN KEY (`primary_user_type`) REFERENCES `app_user_type` (`app_user_type_id`),
  CONSTRAINT `app_user_ibfk_3` FOREIGN KEY (`person_detail_id`) REFERENCES `person_detail` (`person_detail_id`),
  CONSTRAINT `app_user_ibfk_4` FOREIGN KEY (`family_unit_id`) REFERENCES `family_unit` (`family_unit_id`),
  CONSTRAINT `app_user_ibfk_5` FOREIGN KEY (`relation_type_id`) REFERENCES `relation_type` (`relation_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.app_user: ~0 rows (approximately)
DELETE FROM `app_user`;
/*!40000 ALTER TABLE `app_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `app_user` ENABLE KEYS */;


-- Dumping structure for table sms.app_user_biometric
DROP TABLE IF EXISTS `app_user_biometric`;
CREATE TABLE IF NOT EXISTS `app_user_biometric` (
  `app_user_biometric_id` decimal(9,0) NOT NULL,
  `path` varchar(200) DEFAULT NULL,
  `is_active` char(1) DEFAULT NULL,
  `provided_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `biometric_type_id` decimal(9,0) DEFAULT NULL,
  `biometric_category_id` decimal(9,0) DEFAULT NULL,
  `person_id` decimal(9,0) DEFAULT NULL,
  `app_user_id` decimal(9,0) DEFAULT NULL,
  PRIMARY KEY (`app_user_biometric_id`),
  KEY `R_32` (`biometric_type_id`),
  KEY `R_33` (`biometric_category_id`),
  KEY `R_34` (`person_id`),
  KEY `R_35` (`app_user_id`),
  CONSTRAINT `app_user_biometric_ibfk_1` FOREIGN KEY (`biometric_type_id`) REFERENCES `biometric_type` (`biometric_type_id`),
  CONSTRAINT `app_user_biometric_ibfk_2` FOREIGN KEY (`biometric_category_id`) REFERENCES `biometric_category` (`biometric_category_id`),
  CONSTRAINT `app_user_biometric_ibfk_3` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`),
  CONSTRAINT `app_user_biometric_ibfk_4` FOREIGN KEY (`app_user_id`) REFERENCES `app_user` (`app_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.app_user_biometric: ~0 rows (approximately)
DELETE FROM `app_user_biometric`;
/*!40000 ALTER TABLE `app_user_biometric` DISABLE KEYS */;
/*!40000 ALTER TABLE `app_user_biometric` ENABLE KEYS */;


-- Dumping structure for table sms.app_user_biometric_history
DROP TABLE IF EXISTS `app_user_biometric_history`;
CREATE TABLE IF NOT EXISTS `app_user_biometric_history` (
  `app_user_biometric_history_id` int(11) NOT NULL,
  `path` varchar(150) DEFAULT NULL,
  `app_user_biometric_id` decimal(9,0) DEFAULT NULL,
  `change_date` date DEFAULT NULL,
  PRIMARY KEY (`app_user_biometric_history_id`),
  KEY `R_260` (`app_user_biometric_id`),
  CONSTRAINT `app_user_biometric_history_ibfk_1` FOREIGN KEY (`app_user_biometric_id`) REFERENCES `app_user_biometric` (`app_user_biometric_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.app_user_biometric_history: ~0 rows (approximately)
DELETE FROM `app_user_biometric_history`;
/*!40000 ALTER TABLE `app_user_biometric_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `app_user_biometric_history` ENABLE KEYS */;


-- Dumping structure for table sms.app_user_file
DROP TABLE IF EXISTS `app_user_file`;
CREATE TABLE IF NOT EXISTS `app_user_file` (
  `app_user_file_id` decimal(9,0) NOT NULL,
  `path` varchar(200) DEFAULT NULL,
  `is_active` char(1) DEFAULT NULL,
  `provide_date` date DEFAULT NULL,
  `end_date` varchar(20) DEFAULT NULL,
  `app_user_id` decimal(9,0) DEFAULT NULL,
  `person_id` decimal(9,0) DEFAULT NULL,
  PRIMARY KEY (`app_user_file_id`),
  KEY `R_36` (`app_user_id`),
  KEY `R_37` (`person_id`),
  CONSTRAINT `app_user_file_ibfk_1` FOREIGN KEY (`app_user_id`) REFERENCES `app_user` (`app_user_id`),
  CONSTRAINT `app_user_file_ibfk_2` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.app_user_file: ~0 rows (approximately)
DELETE FROM `app_user_file`;
/*!40000 ALTER TABLE `app_user_file` DISABLE KEYS */;
/*!40000 ALTER TABLE `app_user_file` ENABLE KEYS */;


-- Dumping structure for table sms.app_user_file_history
DROP TABLE IF EXISTS `app_user_file_history`;
CREATE TABLE IF NOT EXISTS `app_user_file_history` (
  `path` varchar(200) DEFAULT NULL,
  `change_date` date DEFAULT NULL,
  `is_active` char(1) DEFAULT NULL,
  `app_user_file_history` int(11) NOT NULL,
  `app_user_file_id` decimal(9,0) DEFAULT NULL,
  PRIMARY KEY (`app_user_file_history`),
  KEY `R_264` (`app_user_file_id`),
  CONSTRAINT `app_user_file_history_ibfk_1` FOREIGN KEY (`app_user_file_id`) REFERENCES `app_user_file` (`app_user_file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.app_user_file_history: ~0 rows (approximately)
DELETE FROM `app_user_file_history`;
/*!40000 ALTER TABLE `app_user_file_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `app_user_file_history` ENABLE KEYS */;


-- Dumping structure for table sms.app_user_history
DROP TABLE IF EXISTS `app_user_history`;
CREATE TABLE IF NOT EXISTS `app_user_history` (
  `app_user_id` decimal(9,0) DEFAULT NULL,
  `app_user_history_id` int(11) NOT NULL,
  `change_date` date DEFAULT NULL,
  PRIMARY KEY (`app_user_history_id`),
  KEY `R_265` (`app_user_id`),
  CONSTRAINT `app_user_history_ibfk_1` FOREIGN KEY (`app_user_id`) REFERENCES `app_user` (`app_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.app_user_history: ~0 rows (approximately)
DELETE FROM `app_user_history`;
/*!40000 ALTER TABLE `app_user_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `app_user_history` ENABLE KEYS */;


-- Dumping structure for table sms.app_user_type
DROP TABLE IF EXISTS `app_user_type`;
CREATE TABLE IF NOT EXISTS `app_user_type` (
  `app_user_type_id` decimal(9,0) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`app_user_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.app_user_type: ~0 rows (approximately)
DELETE FROM `app_user_type`;
/*!40000 ALTER TABLE `app_user_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `app_user_type` ENABLE KEYS */;


-- Dumping structure for table sms.attendance
DROP TABLE IF EXISTS `attendance`;
CREATE TABLE IF NOT EXISTS `attendance` (
  `attendance_id` int(11) NOT NULL,
  `remarks` varchar(20) DEFAULT NULL,
  `reason` varchar(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `cycle_id` int(11) DEFAULT NULL,
  `app_user_id` decimal(9,0) DEFAULT NULL,
  `attendance_type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`attendance_id`),
  KEY `R_97` (`cycle_id`),
  KEY `R_98` (`app_user_id`),
  KEY `R_99` (`attendance_type_id`),
  CONSTRAINT `attendance_ibfk_6` FOREIGN KEY (`attendance_type_id`) REFERENCES `attendance_type` (`attendance_type_id`),
  CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`cycle_id`) REFERENCES `ms_cycle` (`cycle_id`),
  CONSTRAINT `attendance_ibfk_2` FOREIGN KEY (`app_user_id`) REFERENCES `app_user` (`app_user_id`),
  CONSTRAINT `attendance_ibfk_3` FOREIGN KEY (`attendance_type_id`) REFERENCES `attendance_type` (`attendance_type_id`),
  CONSTRAINT `attendance_ibfk_4` FOREIGN KEY (`cycle_id`) REFERENCES `ms_cycle` (`cycle_id`),
  CONSTRAINT `attendance_ibfk_5` FOREIGN KEY (`app_user_id`) REFERENCES `app_user` (`app_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.attendance: ~0 rows (approximately)
DELETE FROM `attendance`;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;


-- Dumping structure for table sms.attendance_type
DROP TABLE IF EXISTS `attendance_type`;
CREATE TABLE IF NOT EXISTS `attendance_type` (
  `attendance_type_id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`attendance_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.attendance_type: ~0 rows (approximately)
DELETE FROM `attendance_type`;
/*!40000 ALTER TABLE `attendance_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendance_type` ENABLE KEYS */;


-- Dumping structure for table sms.biometric_category
DROP TABLE IF EXISTS `biometric_category`;
CREATE TABLE IF NOT EXISTS `biometric_category` (
  `biometric_category_id` decimal(9,0) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`biometric_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.biometric_category: ~0 rows (approximately)
DELETE FROM `biometric_category`;
/*!40000 ALTER TABLE `biometric_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `biometric_category` ENABLE KEYS */;


-- Dumping structure for table sms.biometric_type
DROP TABLE IF EXISTS `biometric_type`;
CREATE TABLE IF NOT EXISTS `biometric_type` (
  `biometric_type_id` decimal(9,0) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`biometric_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.biometric_type: ~0 rows (approximately)
DELETE FROM `biometric_type`;
/*!40000 ALTER TABLE `biometric_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `biometric_type` ENABLE KEYS */;


-- Dumping structure for table sms.class
DROP TABLE IF EXISTS `class`;
CREATE TABLE IF NOT EXISTS `class` (
  `class_id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `class_section_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`class_id`),
  KEY `R_88` (`class_section_id`),
  CONSTRAINT `class_ibfk_4` FOREIGN KEY (`class_section_id`) REFERENCES `class_section` (`class_section_id`),
  CONSTRAINT `class_ibfk_1` FOREIGN KEY (`class_section_id`) REFERENCES `class_section` (`class_section_id`),
  CONSTRAINT `class_ibfk_2` FOREIGN KEY (`class_section_id`) REFERENCES `class_section` (`class_section_id`),
  CONSTRAINT `class_ibfk_3` FOREIGN KEY (`class_section_id`) REFERENCES `class_section` (`class_section_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.class: ~0 rows (approximately)
DELETE FROM `class`;
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
/*!40000 ALTER TABLE `class` ENABLE KEYS */;


-- Dumping structure for table sms.class_section
DROP TABLE IF EXISTS `class_section`;
CREATE TABLE IF NOT EXISTS `class_section` (
  `class_section_id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `strength` int(11) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`class_section_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.class_section: ~0 rows (approximately)
DELETE FROM `class_section`;
/*!40000 ALTER TABLE `class_section` DISABLE KEYS */;
/*!40000 ALTER TABLE `class_section` ENABLE KEYS */;


-- Dumping structure for table sms.enrollment_process
DROP TABLE IF EXISTS `enrollment_process`;
CREATE TABLE IF NOT EXISTS `enrollment_process` (
  `student_id` decimal(9,0) DEFAULT NULL,
  `session_class_id` int(11) DEFAULT NULL,
  `enrolment_type_id` int(11) DEFAULT NULL,
  `enrolment_status_id` int(11) DEFAULT NULL,
  `enrolment_id` int(11) NOT NULL,
  `enrollment_no` varchar(20) DEFAULT NULL,
  `approved_by` decimal(9,0) DEFAULT NULL,
  PRIMARY KEY (`enrolment_id`),
  KEY `R_93` (`session_class_id`),
  KEY `R_94` (`enrolment_type_id`),
  KEY `R_95` (`enrolment_status_id`),
  KEY `R_96` (`approved_by`),
  KEY `FK_enrollment_process_app_user` (`student_id`),
  CONSTRAINT `FK_enrollment_process_app_user` FOREIGN KEY (`student_id`) REFERENCES `app_user` (`app_user_id`),
  CONSTRAINT `enrollment_process_ibfk_1` FOREIGN KEY (`session_class_id`) REFERENCES `session_class` (`session_class_id`),
  CONSTRAINT `enrollment_process_ibfk_2` FOREIGN KEY (`enrolment_type_id`) REFERENCES `enrollment_type` (`enrolment_type_id`),
  CONSTRAINT `enrollment_process_ibfk_3` FOREIGN KEY (`enrolment_status_id`) REFERENCES `enrolment_status` (`enrolment_status_id`),
  CONSTRAINT `enrollment_process_ibfk_4` FOREIGN KEY (`approved_by`) REFERENCES `app_user` (`app_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.enrollment_process: ~0 rows (approximately)
DELETE FROM `enrollment_process`;
/*!40000 ALTER TABLE `enrollment_process` DISABLE KEYS */;
/*!40000 ALTER TABLE `enrollment_process` ENABLE KEYS */;


-- Dumping structure for table sms.enrollment_type
DROP TABLE IF EXISTS `enrollment_type`;
CREATE TABLE IF NOT EXISTS `enrollment_type` (
  `enrolment_type_id` int(11) NOT NULL,
  `name` varchar(18) DEFAULT NULL,
  PRIMARY KEY (`enrolment_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.enrollment_type: ~0 rows (approximately)
DELETE FROM `enrollment_type`;
/*!40000 ALTER TABLE `enrollment_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `enrollment_type` ENABLE KEYS */;


-- Dumping structure for table sms.enrolment_session
DROP TABLE IF EXISTS `enrolment_session`;
CREATE TABLE IF NOT EXISTS `enrolment_session` (
  `session_id` int(11) NOT NULL,
  `title` varchar(20) DEFAULT NULL,
  `from_date` date DEFAULT NULL,
  `to_date` varchar(18) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`session_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.enrolment_session: ~0 rows (approximately)
DELETE FROM `enrolment_session`;
/*!40000 ALTER TABLE `enrolment_session` DISABLE KEYS */;
/*!40000 ALTER TABLE `enrolment_session` ENABLE KEYS */;


-- Dumping structure for table sms.enrolment_status
DROP TABLE IF EXISTS `enrolment_status`;
CREATE TABLE IF NOT EXISTS `enrolment_status` (
  `enrolment_status_id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`enrolment_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.enrolment_status: ~0 rows (approximately)
DELETE FROM `enrolment_status`;
/*!40000 ALTER TABLE `enrolment_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `enrolment_status` ENABLE KEYS */;


-- Dumping structure for table sms.family_unit
DROP TABLE IF EXISTS `family_unit`;
CREATE TABLE IF NOT EXISTS `family_unit` (
  `family_unit_id` decimal(9,0) NOT NULL,
  `family_no` varchar(32) DEFAULT NULL,
  `reg_date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`family_unit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.family_unit: ~0 rows (approximately)
DELETE FROM `family_unit`;
/*!40000 ALTER TABLE `family_unit` DISABLE KEYS */;
/*!40000 ALTER TABLE `family_unit` ENABLE KEYS */;


-- Dumping structure for table sms.ms_cycle
DROP TABLE IF EXISTS `ms_cycle`;
CREATE TABLE IF NOT EXISTS `ms_cycle` (
  `cycle_id` int(11) NOT NULL,
  `name` int(11) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  `date_from` date DEFAULT NULL,
  `date_to` date DEFAULT NULL,
  `month` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cycle_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.ms_cycle: ~0 rows (approximately)
DELETE FROM `ms_cycle`;
/*!40000 ALTER TABLE `ms_cycle` DISABLE KEYS */;
/*!40000 ALTER TABLE `ms_cycle` ENABLE KEYS */;


-- Dumping structure for table sms.person
DROP TABLE IF EXISTS `person`;
CREATE TABLE IF NOT EXISTS `person` (
  `person_id` decimal(9,0) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `dob` datetime DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `is_blocked` char(1) DEFAULT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.person: ~0 rows (approximately)
DELETE FROM `person`;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
/*!40000 ALTER TABLE `person` ENABLE KEYS */;


-- Dumping structure for table sms.person_address
DROP TABLE IF EXISTS `person_address`;
CREATE TABLE IF NOT EXISTS `person_address` (
  `person_address_id` decimal(9,0) NOT NULL,
  `address_type_id` decimal(9,0) DEFAULT NULL,
  `address_id` decimal(9,0) DEFAULT NULL,
  `is_active` char(1) DEFAULT NULL,
  `person_id` decimal(9,0) NOT NULL,
  `person_detail_id` decimal(9,0) NOT NULL,
  `from_date` date DEFAULT NULL,
  PRIMARY KEY (`person_address_id`),
  KEY `R_24` (`address_type_id`),
  KEY `R_73` (`person_id`),
  KEY `R_25` (`address_id`),
  KEY `R_72` (`person_detail_id`),
  CONSTRAINT `person_address_ibfk_1` FOREIGN KEY (`address_type_id`) REFERENCES `address_type` (`address_type_id`),
  CONSTRAINT `person_address_ibfk_2` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`),
  CONSTRAINT `person_address_ibfk_3` FOREIGN KEY (`person_detail_id`) REFERENCES `person_detail` (`person_detail_id`),
  CONSTRAINT `person_address_ibfk_4` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`),
  CONSTRAINT `person_address_ibfk_5` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`),
  CONSTRAINT `person_address_ibfk_6` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`),
  CONSTRAINT `person_address_ibfk_7` FOREIGN KEY (`person_detail_id`) REFERENCES `person_detail` (`person_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.person_address: ~0 rows (approximately)
DELETE FROM `person_address`;
/*!40000 ALTER TABLE `person_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `person_address` ENABLE KEYS */;


-- Dumping structure for table sms.person_address_history
DROP TABLE IF EXISTS `person_address_history`;
CREATE TABLE IF NOT EXISTS `person_address_history` (
  `from_date` date DEFAULT NULL,
  `to_date` date DEFAULT NULL,
  `country_id` decimal(11,0) DEFAULT NULL,
  `state_id` decimal(9,0) DEFAULT NULL,
  `city_id` decimal(9,0) DEFAULT NULL,
  `zip_code_id` decimal(9,0) DEFAULT NULL,
  `address_line_one` varchar(255) DEFAULT NULL,
  `address_line_two` varchar(255) DEFAULT NULL,
  `person_address_history_id` decimal(9,0) NOT NULL,
  `address_type_id` decimal(9,0) DEFAULT NULL,
  `is_current` char(1) DEFAULT NULL,
  `person_id` decimal(9,0) DEFAULT NULL,
  `person_address_id` decimal(9,0) DEFAULT NULL,
  PRIMARY KEY (`person_address_history_id`),
  KEY `R_75` (`person_address_id`),
  KEY `R_31` (`person_id`),
  KEY `R_29` (`address_type_id`),
  CONSTRAINT `person_address_history_ibfk_1` FOREIGN KEY (`address_type_id`) REFERENCES `address_type` (`address_type_id`),
  CONSTRAINT `person_address_history_ibfk_2` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`),
  CONSTRAINT `person_address_history_ibfk_3` FOREIGN KEY (`person_address_id`) REFERENCES `person_address` (`person_address_id`),
  CONSTRAINT `person_address_history_ibfk_4` FOREIGN KEY (`person_address_id`) REFERENCES `person_address` (`person_address_id`),
  CONSTRAINT `person_address_history_ibfk_5` FOREIGN KEY (`person_address_id`) REFERENCES `person_address` (`person_address_id`),
  CONSTRAINT `person_address_history_ibfk_6` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`),
  CONSTRAINT `person_address_history_ibfk_7` FOREIGN KEY (`address_type_id`) REFERENCES `address_type` (`address_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.person_address_history: ~0 rows (approximately)
DELETE FROM `person_address_history`;
/*!40000 ALTER TABLE `person_address_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `person_address_history` ENABLE KEYS */;


-- Dumping structure for table sms.person_detail
DROP TABLE IF EXISTS `person_detail`;
CREATE TABLE IF NOT EXISTS `person_detail` (
  `person_detail_id` decimal(9,0) NOT NULL,
  `person_id` decimal(9,0) DEFAULT NULL,
  `primary_email` varchar(20) DEFAULT NULL,
  `secondary_email` varchar(20) DEFAULT NULL,
  `primary_cell` varchar(20) DEFAULT NULL,
  `secondary_cell` varchar(20) DEFAULT NULL,
  `res_phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`person_detail_id`),
  KEY `R_5` (`person_id`),
  CONSTRAINT `person_detail_ibfk_1` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`),
  CONSTRAINT `person_detail_ibfk_2` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`),
  CONSTRAINT `person_detail_ibfk_3` FOREIGN KEY (`person_id`) REFERENCES `person` (`person_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.person_detail: ~0 rows (approximately)
DELETE FROM `person_detail`;
/*!40000 ALTER TABLE `person_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `person_detail` ENABLE KEYS */;


-- Dumping structure for table sms.person_detail_history
DROP TABLE IF EXISTS `person_detail_history`;
CREATE TABLE IF NOT EXISTS `person_detail_history` (
  `primary_email` varchar(20) DEFAULT NULL,
  `secondary_email` varchar(20) DEFAULT NULL,
  `primary_cell` varchar(20) DEFAULT NULL,
  `secondary_cell` varchar(20) DEFAULT NULL,
  `res_phone` varchar(20) DEFAULT NULL,
  `person_detail_history` decimal(9,0) NOT NULL,
  `person_detail_id` decimal(9,0) DEFAULT NULL,
  `change_date` date DEFAULT NULL,
  PRIMARY KEY (`person_detail_history`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.person_detail_history: ~0 rows (approximately)
DELETE FROM `person_detail_history`;
/*!40000 ALTER TABLE `person_detail_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `person_detail_history` ENABLE KEYS */;


-- Dumping structure for table sms.person_history
DROP TABLE IF EXISTS `person_history`;
CREATE TABLE IF NOT EXISTS `person_history` (
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `dob` varchar(25) DEFAULT NULL,
  `sex` varchar(15) DEFAULT NULL,
  `person_history_id` int(11) NOT NULL,
  `person_id` decimal(9,0) DEFAULT NULL,
  `change_date` date DEFAULT NULL,
  PRIMARY KEY (`person_history_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.person_history: ~0 rows (approximately)
DELETE FROM `person_history`;
/*!40000 ALTER TABLE `person_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `person_history` ENABLE KEYS */;


-- Dumping structure for table sms.relation_type
DROP TABLE IF EXISTS `relation_type`;
CREATE TABLE IF NOT EXISTS `relation_type` (
  `relation_type_id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`relation_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.relation_type: ~0 rows (approximately)
DELETE FROM `relation_type`;
/*!40000 ALTER TABLE `relation_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `relation_type` ENABLE KEYS */;


-- Dumping structure for table sms.session_class
DROP TABLE IF EXISTS `session_class`;
CREATE TABLE IF NOT EXISTS `session_class` (
  `session_class_id` int(11) NOT NULL,
  `no_of_periods` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `session_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`session_class_id`),
  KEY `R_90` (`class_id`),
  KEY `R_91` (`session_id`),
  CONSTRAINT `session_class_ibfk_2` FOREIGN KEY (`session_id`) REFERENCES `enrolment_session` (`session_id`),
  CONSTRAINT `session_class_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table sms.session_class: ~0 rows (approximately)
DELETE FROM `session_class`;
/*!40000 ALTER TABLE `session_class` DISABLE KEYS */;
/*!40000 ALTER TABLE `session_class` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
