--
-- Database: `spring-cloud`
--

DROP TABLE IF EXISTS `sc_user`;
CREATE TABLE `sc_user` (
    `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '用户',
    `name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '姓名',
    `age` tinyint NOT NULL DEFAULT '0' COMMENT '年龄',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



