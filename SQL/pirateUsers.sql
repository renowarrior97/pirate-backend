--USERS TABLE CONSTRUCTOR----------------------------------
DROP TABLE IF EXISTS users CASCADE;
CREATE TABLE users(
	id serial PRIMARY KEY,
	username varchar(255) UNIQUE,
	email varchar(255) UNIQUE,
	first_name varchar(255),
	last_name varchar(255),
	password varchar(255)
);
-----------------------------------------------------------
--USER VALUES----------------------------------------------
TRUNCATE users;
INSERT INTO users(username,email,first_name,last_name,password)
VALUES
	('goldroger','goldroger@gmail.com','Gol D.','Roger','king'),
	('blackbeard','blackbeard@gmail.com','Marshall D.','Teach','void'),
	('strawhat','strawhat@gmail.com','Monkey D.','Luffy','gum');
-----------------------------------------------------------