CREATE DATABASE `login_app`;

CREATE TABLE `login_app`.`users` (
    `id` INT NOT NULL AUTO_INCREMENT ,  
    `name` VARCHAR(64) NOT NULL,  
    `address` VARCHAR(255) NOT NULL,  
    `gender` CHAR(1) NOT NULL,
    `username` VARCHAR(64) NOT NULL,
    `email` VARCHAR(64) NOT NULL,
    `password` VARCHAR(64) NOT NULL,
    PRIMARY KEY  (`id`)
) ENGINE = InnoDB;

INSERT INTO `users` (
    `id`,
    `name`,
    `address`,
    `gender`,
    `username`,
    `email`,
    `password`
) VALUES (
    NULL,
    'Asep Bagja',
    'Jl. Raya Cipadung No. 9',
    'L',
    'asepslebew',
    'asebslebew@gmail.com',
    'rahasia'
);
