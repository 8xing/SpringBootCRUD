/*
 Navicat Premium Data Transfer

 Source Server         : main
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost:3306
 Source Schema         : WebSite

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 17/01/2021 18:33:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for AccountInfo
-- ----------------------------
DROP TABLE IF EXISTS `AccountInfo`;
CREATE TABLE `AccountInfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gitee` varchar(255) DEFAULT NULL,
  `github` varchar(255) DEFAULT NULL,
  `uid` int(11) NOT NULL,
  `User` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `uid` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of AccountInfo
-- ----------------------------
BEGIN;
INSERT INTO `AccountInfo` VALUES (1, 'admin', '12345', '12fwe', '1@qq.comwe', '444444@qq.com', '22222@qq.com', 1, NULL);
INSERT INTO `AccountInfo` VALUES (4, 'lfx ', 'lfx', 'dew', 'ewd', 'dew', 'e', 5, NULL);
COMMIT;

-- ----------------------------
-- Table structure for UserInfo
-- ----------------------------
DROP TABLE IF EXISTS `UserInfo`;
CREATE TABLE `UserInfo` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  CONSTRAINT `uid` FOREIGN KEY (`id`) REFERENCES `AccountInfo` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of UserInfo
-- ----------------------------
BEGIN;
INSERT INTO `UserInfo` VALUES (1, 'xin55315155', '男wsaxef', 2555, '贵州sax');
INSERT INTO `UserInfo` VALUES (5, 'cews ', 'ds', 542, 'wef');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
