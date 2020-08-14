--ADDRESSES TABLE CONSTRUCTOR------------------------------	
DROP TABLE IF EXISTS address CASCADE;
CREATE TABLE address(
	id serial PRIMARY KEY,
	street varchar(255),
	city varchar(255),
	state varchar(255),
	zip_code varchar(255)
);
-----------------------------------------------------------
--ADDRESS TABLE POPULATOR----------------------------------
TRUNCATE address;
INSERT INTO address(street,city,state,zip_code)
VALUES
	('666 One Piece Ave.', 'Reno','NV','89512'),
	('120 Grand Line St.','Reno','NV','89503');
-----------------------------------------------------------