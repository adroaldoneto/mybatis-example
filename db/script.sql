SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS users;
CREATE TABLE test (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  userName varchar(32) DEFAULT NULL,
  passWord varchar(32) DEFAULT NULL,
  user_sex varchar(32) DEFAULT NULL,
  nick_name varchar(32) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;