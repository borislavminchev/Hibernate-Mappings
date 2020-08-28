-- ----------------------------------------------------------------------------
-- MySQL Workbench Migration
-- Migrated Schemata: hb-05-many-to-many
-- Source Schemata: hb-05-many-to-many
-- Created: Fri Aug 28 18:26:26 2020
-- Workbench Version: 8.0.15
-- ----------------------------------------------------------------------------

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------------------------------------------------------
-- Schema hb-05-many-to-many
-- ----------------------------------------------------------------------------
DROP SCHEMA IF EXISTS `hb-05-many-to-many` ;
CREATE SCHEMA IF NOT EXISTS `hb-05-many-to-many` ;

-- ----------------------------------------------------------------------------
-- Table hb-05-many-to-many.course
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `hb-05-many-to-many`.`course` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(128) NULL DEFAULT NULL,
  `instructor_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `TITLE_UNIQUE` (`title` ASC) VISIBLE,
  INDEX `FK_INSTRUCTOR_idx` (`instructor_id` ASC) VISIBLE,
  CONSTRAINT `FK_INSTRUCTOR`
    FOREIGN KEY (`instructor_id`)
    REFERENCES `hb-05-many-to-many`.`instructor` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table hb-05-many-to-many.course_student
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `hb-05-many-to-many`.`course_student` (
  `course_id` INT(11) NOT NULL,
  `student_id` INT(11) NOT NULL,
  PRIMARY KEY (`course_id`, `student_id`),
  INDEX `FK_STUDENT_idx` (`student_id` ASC) VISIBLE,
  CONSTRAINT `FK_COURSE_05`
    FOREIGN KEY (`course_id`)
    REFERENCES `hb-05-many-to-many`.`course` (`id`),
  CONSTRAINT `FK_STUDENT`
    FOREIGN KEY (`student_id`)
    REFERENCES `hb-05-many-to-many`.`student` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table hb-05-many-to-many.hibernate_sequence
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `hb-05-many-to-many`.`hibernate_sequence` (
  `next_val` BIGINT(20) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

-- ----------------------------------------------------------------------------
-- Table hb-05-many-to-many.instructor
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `hb-05-many-to-many`.`instructor` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL DEFAULT NULL,
  `last_name` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `instructor_detail_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK_DETAIL_idx` (`instructor_detail_id` ASC) VISIBLE,
  CONSTRAINT `FK_DETAIL`
    FOREIGN KEY (`instructor_detail_id`)
    REFERENCES `hb-05-many-to-many`.`instructor_detail` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table hb-05-many-to-many.instructor_detail
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `hb-05-many-to-many`.`instructor_detail` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `youtube_channel` VARCHAR(128) NULL DEFAULT NULL,
  `hobby` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table hb-05-many-to-many.review
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `hb-05-many-to-many`.`review` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `comment` VARCHAR(256) NULL DEFAULT NULL,
  `course_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK_COURSE_ID_idx` (`course_id` ASC) VISIBLE,
  CONSTRAINT `FK_COURSE`
    FOREIGN KEY (`course_id`)
    REFERENCES `hb-05-many-to-many`.`course` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;

-- ----------------------------------------------------------------------------
-- Table hb-05-many-to-many.student
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `hb-05-many-to-many`.`student` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL DEFAULT NULL,
  `last_name` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;
SET FOREIGN_KEY_CHECKS = 1;
