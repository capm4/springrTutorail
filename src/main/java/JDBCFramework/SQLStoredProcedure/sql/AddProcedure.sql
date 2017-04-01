DELIMITER $$
DROP PROCEDURE IF EXISTS `springtest`.`getRecord` $$
CREATE PROCEDURE `springtest`.`getRecord` (
  IN in_id INTEGER,
  OUT out_name VARCHAR(20),
  OUT out_age  INTEGER)
  BEGIN
    SELECT name, age
    INTO out_name, out_age
    FROM student where id = in_id;
  END $$
DELIMITER ;