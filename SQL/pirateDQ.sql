--USERS DATA-------------------------
SELECT *
	FROM users;
-------------------------------------
--ADDRESS DATA-----------------------
SELECT *
	FROM address;
-------------------------------------
--USERS_ADDRESS DATA-----------------
SELECT u.first_name,u.last_name, a.street
	FROM users_address AS ua
LEFT JOIN users AS u
	ON u.id=ua.users_id
LEFT JOIN address AS a
	ON a.id=ua.address_id; 