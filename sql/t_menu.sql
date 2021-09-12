/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : orderingsystem

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2021-09-12 11:01:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(108) NOT NULL,
  `price` double(10,2) DEFAULT NULL,
  `flavor` varchar(108) NOT NULL,
  `tid` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tid` (`tid`),
  CONSTRAINT `tid` FOREIGN KEY (`tid`) REFERENCES `t_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('1', '香酥鸡', '38.00', '五香', '1');
INSERT INTO `t_menu` VALUES ('2', '辣椒扣肉', '46.00', '微辣', '1');
INSERT INTO `t_menu` VALUES ('3', '三杯鸡', '56.00', '五香', '1');
INSERT INTO `t_menu` VALUES ('4', '毛血旺', '39.00', '麻辣', '1');
INSERT INTO `t_menu` VALUES ('5', '菠菜拌粉丝', '22.00', '五香', '2');
INSERT INTO `t_menu` VALUES ('6', '凉拌豆腐皮', '19.00', '微辣', '2');
INSERT INTO `t_menu` VALUES ('7', '酱牛肉', '36.00', '麻辣', '2');
INSERT INTO `t_menu` VALUES ('8', '鱼头豆腐汤', '32.00', '五香', '3');
INSERT INTO `t_menu` VALUES ('9', '皮蛋瘦肉粥', '30.00', '五香', '3');
INSERT INTO `t_menu` VALUES ('10', '西葫芦虾仁粥', '26.00', '五香', '4');
INSERT INTO `t_menu` VALUES ('11', '蛋炒饭', '26.00', '五香', '4');
INSERT INTO `t_menu` VALUES ('12', '椰蓉面包', '12.00', '香甜', '5');
INSERT INTO `t_menu` VALUES ('13', '啵啵啵啵啵啵啵啵啵', '9999.00', '嘿嘿', '1');
INSERT INTO `t_menu` VALUES ('16', '麻婆豆腐', '16.00', '麻辣', '2');
INSERT INTO `t_menu` VALUES ('17', '麻婆豆腐', '16.00', '麻辣', '2');
INSERT INTO `t_menu` VALUES ('18', '麻婆豆腐', '16.00', '麻辣', '2');
INSERT INTO `t_menu` VALUES ('21', '糖醋里脊', '50.00', '好吃', '1');
INSERT INTO `t_menu` VALUES ('22', '蚂蚁上树', '20.00', '迟迟', '2');
INSERT INTO `t_menu` VALUES ('23', '糖醋里脊', '887.00', '牛逼', '1');
INSERT INTO `t_menu` VALUES ('24', '22', '22.00', '22', '5');
INSERT INTO `t_menu` VALUES ('26', '佳佳啵啵', '60.00', '好吃', '1');
INSERT INTO `t_menu` VALUES ('29', '臭臭佳佳', '999.00', '佳佳臭臭', '3');
INSERT INTO `t_menu` VALUES ('36', '臭臭佳佳', '888.00', '佳佳臭臭', '1');
