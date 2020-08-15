--RELATIONSHIP TABLE CONSTRUCTOR---------------------------
DROP TABLE IF EXISTS friend CASCADE;
CREATE TABLE friend(
	user_one_id int,
	user_two_id int,
	CONSTRAINT friend_id PRIMARY KEY(user_one_id,user_two_id),
	CONSTRAINT users_not_equal CHECK(user_one_id != user_two_id),
	CONSTRAINT user_one_is_smaller CHECK(user_one_id < user_two_id)
);
-----------------------------------------------------------
--STATUS CODES---------------------------------------------
--0 = Pending
--1 = Accepted
--2 = Declined/Deleted
--3 = Blocked
--RELATIONSHIP VALUES--------------------------------------
TRUNCATE friend;
INSERT INTO friend(user_one_id,user_two_id)
VALUES
	(1,2),
	(2,3);
-----------------------------------------------------------
--MODEL FROM <https://www.codedodle.com/2014/12/social-network-friends-database.html>--