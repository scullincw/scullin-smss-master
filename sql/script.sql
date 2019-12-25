ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';

CREATE DATABASE smss;

use smss;
select * FROM smss.system;

SHOW TABLES;

SELECT * FROM teacher;

DELETE FROM teacher
WHERE id = 1;

SELECT * FROM `system`;