/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 8.0.13 : Database - videoplay
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`videoplay` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `videoplay`;

/*Table structure for table `adversize` */

DROP TABLE IF EXISTS `adversize`;

CREATE TABLE `adversize` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `url` varchar(100) NOT NULL,
  `type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `MediaType` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `adversize` */

insert  into `adversize`(`id`,`name`,`url`,`type`,`MediaType`) values (1,'酷狗宣传','D:\\壁纸\\3.mp4','宣传影视',NULL),(2,'西峡进排气管公司宣传片','D:\\壁纸\\西峡进排气管公司宣传片.mp4','',NULL);

/*Table structure for table `cartoon` */

DROP TABLE IF EXISTS `cartoon`;

CREATE TABLE `cartoon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `url` varchar(100) NOT NULL,
  `type` varchar(100) DEFAULT NULL,
  `MediaType` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `cartoon` */

insert  into `cartoon`(`id`,`name`,`url`,`type`,`MediaType`) values (1,'Bunny Trailer','http://media.w3.org/2010/05/bunny/trailer.mp4',NULL,NULL),(2,'Oceans','http://vjs.zencdn.net/v/oceans.mp4',NULL,NULL),(3,'Sintel Trailer','http://media.w3.org/2010/05/sintel/trailer.mp4',NULL,NULL),(4,'Bunny Movie','http://media.w3.org/2010/05/bunny/movie.mp4',NULL,NULL),(5,'Video Movie_300','http://media.w3.org/2010/05/video/movie_300.mp4',NULL,NULL),(6,'Big Buck Bunny','http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4',NULL,NULL);

/*Table structure for table `english` */

DROP TABLE IF EXISTS `english`;

CREATE TABLE `english` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `url` varchar(100) NOT NULL,
  `type` varchar(100) DEFAULT NULL,
  `MediaType` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `english` */

insert  into `english`(`id`,`name`,`url`,`type`,`MediaType`) values (1,'第1讲打招呼、问候语1','D:\\学习视频\\学而思\\第1讲打招呼、问候语1.mp4',NULL,NULL),(2,'第1讲打招呼、问候语2','D:\\学习视频\\学而思\\第1讲打招呼、问候语2.mp4',NULL,NULL);

/*Table structure for table `guns` */

DROP TABLE IF EXISTS `guns`;

CREATE TABLE `guns` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `url` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Data for the table `guns` */

insert  into `guns`(`id`,`name`,`url`) values (1,'1.课程介绍','D:\\学习视频\\Guns系列教程\\1.课程介绍\\1.课程介绍.mp4'),(2,'2.搭建项目','D:\\学习视频\\Guns系列教程\\2.搭建项目\\2.搭建项目.mp4'),(3,'3.项目介绍','D:\\学习视频\\Guns系列教程\\3.项目介绍\\3.项目介绍.mp4'),(4,'4.用Guns进行开发.mp4','D:\\学习视频\\Guns系列教程\\4.用Guns进行开发\\4.用Guns进行开发.mp4'),(5,'5.springboot精要.mp4','D:\\学习视频\\Guns系列教程\\5.springboot精要\\5.springboot精要.mp4'),(6,'6.springboot实战','D:\\学习视频\\Guns系列教程\\6.Spring Boot实战\\springboot实战.mp4'),(7,'7.多数据源配置和使用.mp4','D:\\学习视频\\Guns系列教程\\7.多数据源配置和使用\\多数据源配置和使用.mp4'),(8,'8.map+warpper介绍','D:\\学习视频\\Guns系列教程\\8.map+warpper介绍\\map+warpper介绍.mp4'),(9,'9.日志系统','D:\\学习视频\\Guns系列教程\\9.日志系统\\日志系统.mp4'),(10,'10.swagger讲解.mp4','D:\\学习视频\\Guns系列教程\\10.swagger讲解\\swagger讲解.mp4'),(11,'11. 3.0项目介绍与项目拆分','D:\\学习视频\\Guns系列教程\\11. 3.0项目介绍与项目拆分\\11. 3.0项目介绍与项目拆分.mp4'),(12,'12.shiro与权限系统','D:\\学习视频\\Guns系列教程\\12.shiro与权限系统\\12.shiro与权限系统.mp4'),(13,'13.全局异常拦截','D:\\学习视频\\Guns系列教程\\13.全局异常拦截\\13.全局异常拦截.mp4'),(14,'14.代码生成器','D:\\学习视频\\Guns系列教程\\14.代码生成器\\14.代码生成器.mp4'),(15,'15.数据范围使用和原理','D:\\学习视频\\Guns系列教程\\15.数据范围使用和原理\\15.数据范围使用和原理.mp4'),(16,'16.缓存讲解','D:\\学习视频\\Guns系列教程\\16.缓存讲解\\16.缓存讲解.mp4'),(17,'17.分页讲解','D:\\学习视频\\Guns系列教程\\17.分页讲解\\17.分页讲解.mp4'),(18,'18.事务讲解','D:\\学习视频\\Guns系列教程\\18.事务讲解\\18.事务讲解.mp4'),(19,'19.jwt与签名机制讲解','D:\\学习视频\\Guns系列教程\\19.jwt与签名机制讲解\\jwt与签名机制讲解.mp4'),(20,'20.课程总结','D:\\学习视频\\Guns系列教程\\20.课程总结\\课程总结.mp4');

/*Table structure for table `movies` */

DROP TABLE IF EXISTS `movies`;

CREATE TABLE `movies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `url` varchar(100) NOT NULL,
  `type` varchar(100) DEFAULT NULL,
  `MediaType` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `movies` */

insert  into `movies`(`id`,`name`,`url`,`type`,`MediaType`) values (1,'V字仇杀队','D:\\电影\\V字仇杀队.mp4','电影','video/mp4'),(2,'星际穿越.IMAX版','D:\\电影\\星际穿越.IMAX版.mp4',NULL,'video/mp4');

/*Table structure for table `music` */

DROP TABLE IF EXISTS `music`;

CREATE TABLE `music` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `MediaType` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `music` */

insert  into `music`(`id`,`name`,`url`,`type`,`MediaType`) values (1,'当真','http://sf.sycdn.kuwo.cn/resource/n2/35/0/169146886.mp3','音乐','audio/mpeg'),(2,'大冰的小屋·陈硕子 - 离开这吧','D:\\CloudMusic\\大冰的小屋·陈硕子 - 离开这吧.mp3','音乐','audio/mpeg'),(3,'戴尔基,王圣夫 - 喜欢你，但害怕','D:\\CloudMusic\\戴尔基,王圣夫 - 喜欢你，但害怕.mp3','音乐','audio/mpeg'),(4,'果子 - 大男孩','D:\\CloudMusic\\果子 - 大男孩.mp3','音乐','audio/mpeg'),(5,'焦 - 左岸','D:\\CloudMusic\\焦 - 左岸.mp3','音乐','audio/mpeg'),(6,'王一鸣Iris - 那个人','D:\\CloudMusic\\王一鸣Iris - 那个人.mp3','音乐','audio/mpeg');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
