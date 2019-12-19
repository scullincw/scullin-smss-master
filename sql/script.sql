ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';

use smss;
select * FROM smss.system;