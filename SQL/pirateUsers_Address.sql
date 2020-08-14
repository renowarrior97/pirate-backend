--USERS_ADDRESSES TABLE CONSTRUCTOR------------------------
DROP TABLE IF EXISTS users_address CASCADE;
CREATE TABLE users_address(
	users_id int,
	address_id int,
	CONSTRAINT users_address_id PRIMARY KEY(users_id,address_id)
);
-----------------------------------------------------------
--USERS_ADDRESS VALUES-------------------------------------
TRUNCATE users_address;
INSERT INTO users_address(users_id,address_id)
VALUES
	(1,1),
	(1,2),
	(2,2),
	(3,2);
-----------------------------------------------------------