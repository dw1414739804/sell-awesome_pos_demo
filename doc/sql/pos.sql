/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : pos

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 21/10/2019 15:18:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `goods_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `price` decimal(10, 2) DEFAULT NULL,
  `is_often` tinyint(2) DEFAULT NULL COMMENT '是否是常用商品 0非 1是',
  `type` tinyint(2) DEFAULT NULL COMMENT '类型1主食 2小食 3饮料 4套餐',
  PRIMARY KEY (`goods_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, '香辣鸡腿堡', 'https://i04piccdn.sogoucdn.com/f33a0de52f64e4db', 18.00, 1, 1);
INSERT INTO `goods` VALUES (2, '田园鸡腿堡', 'https://i04piccdn.sogoucdn.com/f33a0de52f64e4db', 15.00, 1, 1);
INSERT INTO `goods` VALUES (3, '和风汉堡', 'https://i04piccdn.sogoucdn.com/f33a0de52f64e4db', 15.00, 1, 1);
INSERT INTO `goods` VALUES (4, '快乐全家桶', 'https://i02piccdn.sogoucdn.com/871efc26ac2776fa', 80.00, 1, 4);
INSERT INTO `goods` VALUES (5, '脆皮炸鸡腿', 'https://i03piccdn.sogoucdn.com/5136b7192b825d48', 10.00, 1, 2);
INSERT INTO `goods` VALUES (6, '魔法鸡块', 'https://i03piccdn.sogoucdn.com/5136b7192b825d48', 20.00, 1, 2);
INSERT INTO `goods` VALUES (7, '可乐大杯', 'https://i02piccdn.sogoucdn.com/42172f5392944e5b', 10.00, 1, 3);
INSERT INTO `goods` VALUES (8, '雪顶咖啡', 'https://i03piccdn.sogoucdn.com/848ed5e9567e084a', 19.00, 1, 3);
INSERT INTO `goods` VALUES (9, '大块鸡米花', 'https://i02piccdn.sogoucdn.com/5df060e8327dbcdc', 15.00, 1, 2);
INSERT INTO `goods` VALUES (10, '香脆鸡柳', 'https://i03piccdn.sogoucdn.com/5136b7192b825d48', 17.00, 1, 2);

SET FOREIGN_KEY_CHECKS = 1;
