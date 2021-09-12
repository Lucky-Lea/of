/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : orderingsystem

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2021-09-12 11:01:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES ('1', '热菜');
INSERT INTO `t_type` VALUES ('2', '凉菜');
INSERT INTO `t_type` VALUES ('3', '汤羹');
INSERT INTO `t_type` VALUES ('4', '主食');
INSERT INTO `t_type` VALUES ('5', '烘培');
