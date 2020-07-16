--USERS TABLE CONSTRUCTOR----------------------------------
DROP TABLE IF EXISTS users CASCADE;
CREATE TABLE users(
user_id serial PRIMARY KEY,
user_email varchar(255) UNIQUE,
first_name varchar(255),
last_name varchar(255),
password varchar(255)
);

INSERT INTO users(user_email,first_name,last_name,password)
VALUES
	('jollyroger@gmail.com','Jolly','Roger','argh42');
-----------------------------------------------------------
--ADDRESSES TABLE CONSTRUCTOR------------------------------	
DROP TABLE IF EXISTS addresses;
CREATE TABLE addresses(
address_id serial PRIMARY KEY,
street varchar(255),
city varchar(255),
state varchar(255),
zip_code varchar(255),
user_id int REFERENCES users(user_id)
);
ALTER TABLE addresses
	ADD FOREIGN KEY (user_id) REFERENCES users(user_id);

INSERT INTO addresses(street,city,state,zip_code,user_id)
VALUES
	('666 Booty Ave.', 'Reno','NV','89512',1);
-----------------------------------------------------------
--SELECT JOIN TABLE----------------------------------------
SELECT users.last_name, users.first_name, addresses.street,addresses.city,addresses.state,addresses.zip_code
FROM users
INNER JOIN addresses ON users.user_id = addresses.user_id;
-----------------------------------------------------------