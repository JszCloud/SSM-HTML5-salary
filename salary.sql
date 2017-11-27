/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : salary

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-27 19:37:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `admin_name` varchar(20) NOT NULL,
  `admin_password` varchar(20) NOT NULL,
  PRIMARY KEY (`admin_id`),
  UNIQUE KEY `admin_name` (`admin_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('13', 'admin', '123456');
INSERT INTO `admin` VALUES ('454', '656', '545');
INSERT INTO `admin` VALUES ('45454787', '124788', '8787');
INSERT INTO `admin` VALUES ('454545454', '545', '4545');

-- ----------------------------
-- Table structure for callnames
-- ----------------------------
DROP TABLE IF EXISTS `callnames`;
CREATE TABLE `callnames` (
  `admin_id` int(11) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `student_NO` varchar(15) DEFAULT NULL,
  `student_name` varchar(20) DEFAULT NULL,
  `teacherCourse_year` varchar(10) DEFAULT NULL,
  `teacherCourse_term` int(11) DEFAULT NULL,
  `student_sex` varchar(4) DEFAULT NULL,
  `salary_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `salary_time` int(11) DEFAULT NULL,
  `salary_data` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of callnames
-- ----------------------------

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `class_id` int(11) DEFAULT NULL,
  `class_NO` varchar(10) DEFAULT NULL,
  `class_name` varchar(20) DEFAULT NULL,
  `class_grade` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_id` int(11) NOT NULL,
  `course_NO` varchar(15) DEFAULT NULL,
  `course_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for leave
-- ----------------------------
DROP TABLE IF EXISTS `leave`;
CREATE TABLE `leave` (
  `leave_start_time` date DEFAULT NULL,
  `leave _end_time` date DEFAULT NULL,
  `leave_cause` varchar(1000) DEFAULT NULL,
  `student_name` varchar(20) DEFAULT NULL,
  `teacher_name` varchar(20) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `leave _flag` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leave
-- ----------------------------

-- ----------------------------
-- Table structure for salaryview
-- ----------------------------
DROP TABLE IF EXISTS `salaryview`;
CREATE TABLE `salaryview` (
  `class_id` int(11) DEFAULT NULL,
  `class_name` varchar(20) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `course_NO` varchar(15) DEFAULT NULL,
  `course_name` varchar(30) DEFAULT NULL,
  `student_name` varchar(20) DEFAULT NULL,
  `student_sex` varchar(4) DEFAULT NULL,
  `salary_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `salary_time` int(11) DEFAULT NULL,
  `salary_data` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salaryview
-- ----------------------------

-- ----------------------------
-- Table structure for selectcourse
-- ----------------------------
DROP TABLE IF EXISTS `selectcourse`;
CREATE TABLE `selectcourse` (
  `selectCourse_id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `selectCourse_year` varchar(15) DEFAULT NULL,
  `selectCourse_term` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of selectcourse
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `student_NO` varchar(15) NOT NULL,
  `student_name` varchar(20) NOT NULL,
  `student_sex` varchar(4) NOT NULL,
  `student_room` varchar(20) NOT NULL,
  `student_phone` varchar(15) NOT NULL,
  `student_qq` varchar(15) NOT NULL,
  `student_email` varchar(30) NOT NULL,
  `student_password` varchar(20) NOT NULL,
  `student_image` varchar(500) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '1', '15', '李四', '男', '501', '15052120001', '102555634', 'lls@qq.com', '123456', '');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` int(11) NOT NULL,
  `teacher_NO` varchar(15) NOT NULL,
  `teacher_name` varchar(20) NOT NULL,
  `teacher_sex` varchar(4) DEFAULT NULL,
  `teacher_office` varchar(50) DEFAULT NULL,
  `teacher_phone` varchar(15) NOT NULL,
  `teacher_qq` varchar(15) NOT NULL,
  `teacher_email` varchar(30) NOT NULL,
  `teacher_password` varchar(20) NOT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('121', '151', '张三', '男', '******', '15502125553', '555546666', '2121@qq.com', '123456');

-- ----------------------------
-- Table structure for teachercourse
-- ----------------------------
DROP TABLE IF EXISTS `teachercourse`;
CREATE TABLE `teachercourse` (
  `teacherCourse_id` int(11) NOT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `teacherCourse_year` varchar(10) DEFAULT NULL,
  `teacherCourse_term` int(11) DEFAULT NULL,
  PRIMARY KEY (`teacherCourse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teachercourse
-- ----------------------------
