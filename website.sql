/*
 Navicat Premium Data Transfer

 Source Server         : aliyun
 Source Server Type    : MySQL
 Source Server Version : 100038
 Source Host           : 47.112.120.25:3306
 Source Schema         : website

 Target Server Type    : MySQL
 Target Server Version : 100038
 File Encoding         : 65001

 Date: 04/11/2020 09:02:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for main
-- ----------------------------
DROP TABLE IF EXISTS `main`;
CREATE TABLE `main`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `nick` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `photo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of main
-- ----------------------------
INSERT INTO `main` VALUES (1, 'UR光和热IPrpghrppo耦鸡皮仍将末根据题日日列个', 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1616927866,2567945831&fm=26&gp=0.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1604460670614&di=d28d6a6e7ada545c02dc317767b06270&imgtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2F201303%2F16%2F173710lvx470i4348z6i6z.jpg', '夜过借园见主人坐月下吹笛', '秋夜访秋士，先闻水上音。\r\n半天凉月色，一笛酒人心。\r\n响遏碧云近，香传红藕深。\r\n相逢清露下，流影湿衣襟。');
INSERT INTO `main` VALUES (2, '我问他4月44额', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1606624058,1978790763&fm=26&gp=0.jpg', 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3063447858,1557676199&fm=26&gp=0.jpg', '减字木兰花·天涯旧恨', '天涯旧恨，独自凄凉人不问。欲见回肠，断尽金炉小篆香。\r\n黛蛾长敛，任是春风吹不展。困倚危楼，过尽飞鸿字字愁。');
INSERT INTO `main` VALUES (3, '退4儿童区hot4 ', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3315455031,784134284&fm=26&gp=0.jpg', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2093282485,1868965017&fm=26&gp=0.jpg', '夜泊水村', '腰间羽箭久凋零，太息燕然未勒铭。\r\n老子犹堪绝大漠，诸君何至泣新亭。\r\n一身报国有万死，双鬓向人无再青。\r\n记取江湖泊船处，卧闻新雁落寒汀。');
INSERT INTO `main` VALUES (4, '共同柔和天虹突然哦 他如果', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1604460629061&di=bcb06220df44fa024cb7009fea96472d&imgtype=0&src=http%3A%2F%2Fg.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fcb8065380cd791230191756fad345982b2b780bc.jpg', 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3485183293,847227336&fm=26&gp=0.jpg', '鲁中送二从弟赴举之西京', '鲁客向西笑，君门若梦中。\r\n霜凋逐臣发，日忆明光宫。\r\n复羡二龙去，才华冠世雄。\r\n平衢骋高足，逸翰凌长风。\r\n舞袖拂秋月，歌筵闻早鸿。\r\n送君日千里，良会何由同。');
INSERT INTO `main` VALUES (5, '个人统计王荣国家人的感觉额共计', 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2337710131,1554869010&fm=26&gp=0.jpg', 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2454919280,4176373113&fm=26&gp=0.jpg', '湖湘以竹车激水粳稻如云书此能仁院壁', '象龙唤不应，竹龙起行雨。\r\n联绵十车辐，伊轧百舟橹。\r\n转此大法轮，救汝旱岁苦。\r\n横江锁巨石，溅瀑叠城鼓。\r\n神机日夜运，甘泽高下普。\r\n老农用不知，瞬息了千亩。\r\n抱孙带黄犊，但看翠浪舞。\r\n余波及井臼，春玉饮酡乳。\r\n江吴夸七蹋，足茧腰背偻。\r\n此乐殊未知，吾归当教汝。');

SET FOREIGN_KEY_CHECKS = 1;
