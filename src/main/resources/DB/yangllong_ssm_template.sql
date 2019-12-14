/*
 Date: 14/12/2019 10:32:45
 需要在jdbc.properties文件中修改数据库密码
 在mysql中创建名为yangllong_ssm_template的数据库，然后执行此sql文件
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for usr
-- ----------------------------
DROP TABLE IF EXISTS `usr`;
CREATE TABLE `usr`  (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of usr
-- ----------------------------
INSERT INTO `usr` VALUES (1, 'yll', '123456');
INSERT INTO `usr` VALUES (2, 'test', '123');
INSERT INTO `usr` VALUES (3, '测试', '123');

SET FOREIGN_KEY_CHECKS = 1;
