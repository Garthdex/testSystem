DROP DATABASE `test_system` ;


CREATE SCHEMA `test_system` ;

CREATE TABLE `test_system`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `iduser_UNIQUE` (`id` ASC));

CREATE TABLE `test_system`.`test` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idtest_UNIQUE` (`id` ASC));

CREATE TABLE `test_system`.`question` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_test` INT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idquestion_UNIQUE` (`id` ASC),
  INDEX `id_test_idx` (`id_test` ASC),
  CONSTRAINT `id_test`
  FOREIGN KEY (`id_test`)
  REFERENCES `test_system`.`test` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `test_system`.`answer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_question` INT NULL,
  `name` VARCHAR(45) NULL,
  `is_correct` TINYINT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idanswer_UNIQUE` (`id` ASC),
  INDEX `id_question_idx` (`id_question` ASC),
  CONSTRAINT `id_question`
  FOREIGN KEY (`id_question`)
  REFERENCES `test_system`.`question` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
