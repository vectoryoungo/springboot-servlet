DROP TABLE IF EXISTS tbb_user;

CREATE TABLE tbb_user(
  id BIGINT AUTO_INCREMENT,
  name VARCHAR(32),
  age int(3),
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='测试用户表';