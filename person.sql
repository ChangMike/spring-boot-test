/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : spring-boot-pagehelper-test

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-04-10 20:37:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '张一', '1', '女');
INSERT INTO `person` VALUES ('2', '张二', '2', '女');
INSERT INTO `person` VALUES ('3', '张三', '3', '女');
INSERT INTO `person` VALUES ('4', '张四', '4', '女');
INSERT INTO `person` VALUES ('5', '张五', '5', '女');
INSERT INTO `person` VALUES ('6', '张六', '6', '女');
INSERT INTO `person` VALUES ('7', '张七', '7', '女');
INSERT INTO `person` VALUES ('8', '张八', '8', '女');
INSERT INTO `person` VALUES ('9', '张九', '9', '女');
INSERT INTO `person` VALUES ('10', '张十', '10', '女');
INSERT INTO `person` VALUES ('11', '张十一', '11', '男');
INSERT INTO `person` VALUES ('12', '张十二', '12', '男');
INSERT INTO `person` VALUES ('13', '张十三', '13', '男');
INSERT INTO `person` VALUES ('14', '张十四', '14', '男');
INSERT INTO `person` VALUES ('15', '张十五', '15', '男');
INSERT INTO `person` VALUES ('16', '张十六', '16', '男');
INSERT INTO `person` VALUES ('17', '张十七', '17', '男');
INSERT INTO `person` VALUES ('18', '张十八', '18', '男');
INSERT INTO `person` VALUES ('19', '张十九', '19', '男');
INSERT INTO `person` VALUES ('20', '张二十', '20', '男');
