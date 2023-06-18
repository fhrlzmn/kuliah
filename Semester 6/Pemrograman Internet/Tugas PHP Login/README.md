# Tugas PHP Login

### Donlod Code
[didieu](https://drive.google.com/file/d/1TZHlFs0xI8rjbJRi03S-kFKZkoGgBm7A/view?usp=sharing) (styling sendiri)

### Create Database & Table

Copy query yang ada di dalam file [`mysql_query.sql`](mysql_query.sql)

atau

```sql
CREATE DATABASE `login_app`;

USE `login_app`;

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
```

### Jalankan Development Server

```bash
php -S localhost:8080
```

### Atau pindahkan ke htdocs (kalau XAMPP)
```bash
ngarti lah :D
```

### Default Account
- `username` = `asepslebew`
- `password` = `rahasia`
