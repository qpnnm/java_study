package homework;

public class UserSql {

}
//CREATE TABLE user(
num INT,
NAME VARCHAR(5),
id VARCHAR(10)
);


INSERT INTO user
VALUES(1,'아무거나','anything'),
(2,'무무무','nothing');

SELECT * FROM user
WHERE num=1;

DELETE FROM user
WHERE num=2;

UPDATE user 
SET NAME='하하';

SELECT * FROM user
WHERE num=1;

SELECT * FROM user
WHERE num=2;
