/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : orderingsystem

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2021-09-12 11:01:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `uid` int(10) DEFAULT NULL,
  `mid` int(10) DEFAULT NULL,
  `aid` int(10) DEFAULT NULL,
  `date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `state` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `aid` (`aid`),
  KEY `mid` (`mid`),
  KEY `uid` (`uid`),
  CONSTRAINT `aid` FOREIGN KEY (`aid`) REFERENCES `t_admin` (`id`),
  CONSTRAINT `mid` FOREIGN KEY (`mid`) REFERENCES `t_menu` (`id`),
  CONSTRAINT `uid` FOREIGN KEY (`uid`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('1', '1', '7', '1', '2021-09-04 19:59:19', '1');
INSERT INTO `t_order` VALUES ('2', '1', '2', null, '2021-09-04 20:05:01', '1');
INSERT INTO `t_order` VALUES ('3', '1', '5', null, '2021-09-04 20:06:03', '1');
INSERT INTO `t_order` VALUES ('4', '1', '9', null, '2021-09-04 20:06:03', '1');
INSERT INTO `t_order` VALUES ('5', '1', '10', null, '2021-09-04 20:06:03', '1');
INSERT INTO `t_order` VALUES ('6', '1', '10', null, '2021-09-04 20:06:04', '1');
INSERT INTO `t_order` VALUES ('7', '1', '10', null, '2021-09-04 20:06:04', '1');
INSERT INTO `t_order` VALUES ('8', '1', '6', null, '2021-09-04 20:06:04', '1');
INSERT INTO `t_order` VALUES ('9', '1', '10', null, '2021-09-04 20:06:04', '1');
INSERT INTO `t_order` VALUES ('10', '1', '7', null, '2021-09-04 20:06:05', '1');
INSERT INTO `t_order` VALUES ('11', '2', '8', null, '2021-09-04 20:06:05', '1');
INSERT INTO `t_order` VALUES ('12', '2', '12', null, '2021-09-04 20:06:05', '1');
INSERT INTO `t_order` VALUES ('13', '1', '1', null, '2021-09-04 20:06:06', '1');
INSERT INTO `t_order` VALUES ('14', '2', '26', null, '2021-09-04 20:06:06', '1');
INSERT INTO `t_order` VALUES ('15', '1', '26', null, '2021-09-04 20:06:06', '1');
INSERT INTO `t_order` VALUES ('16', '1', '1', null, '2021-09-04 20:06:07', '1');
