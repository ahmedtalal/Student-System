-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 09, 2018 at 07:13 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `teacher`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance_level1`
--

CREATE TABLE `attendance_level1` (
  `lec12` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec11` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec10` varchar(5) COLLATE utf8_bin DEFAULT 'غ',
  `lec9` varchar(5) COLLATE utf8_bin DEFAULT 'غ',
  `lec8` varchar(5) COLLATE utf8_bin DEFAULT 'غ',
  `lec7` varchar(5) COLLATE utf8_bin DEFAULT 'غ',
  `lec6` varchar(5) COLLATE utf8_bin DEFAULT 'غ',
  `lec5` varchar(5) COLLATE utf8_bin DEFAULT 'غ',
  `lec4` varchar(5) COLLATE utf8_bin DEFAULT 'غ',
  `lec3` varchar(5) COLLATE utf8_bin DEFAULT 'غ',
  `lec2` varchar(5) COLLATE utf8_bin DEFAULT 'غ',
  `lec1` varchar(5) COLLATE utf8_bin DEFAULT 'غ',
  `code` varchar(6) COLLATE utf8_bin NOT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `attendance_level1`
--

INSERT INTO `attendance_level1` (`lec12`, `lec11`, `lec10`, `lec9`, `lec8`, `lec7`, `lec6`, `lec5`, `lec4`, `lec3`, `lec2`, `lec1`, `code`, `name`) VALUES
('غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', '1000', 'احمد طلال خليل'),
('غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', '1001', 'محمد خميس علي');

-- --------------------------------------------------------

--
-- Table structure for table `attendance_level2`
--

CREATE TABLE `attendance_level2` (
  `name` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `code` varchar(6) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec1` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec2` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec3` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec4` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec5` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec6` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec7` varchar(5) COLLATE utf8_bin DEFAULT 'غ',
  `lec8` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec9` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec10` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec11` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec12` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `attendance_level2`
--

INSERT INTO `attendance_level2` (`name`, `code`, `lec1`, `lec2`, `lec3`, `lec4`, `lec5`, `lec6`, `lec7`, `lec8`, `lec9`, `lec10`, `lec11`, `lec12`) VALUES
('محمد خليل قاسم', '2000', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ');

-- --------------------------------------------------------

--
-- Table structure for table `attendance_level3`
--

CREATE TABLE `attendance_level3` (
  `name` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `code` varchar(6) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec1` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec2` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec3` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec4` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec5` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec6` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec7` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec8` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec9` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec10` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec11` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ',
  `lec12` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT 'غ'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `attendance_level3`
--

INSERT INTO `attendance_level3` (`name`, `code`, `lec1`, `lec2`, `lec3`, `lec4`, `lec5`, `lec6`, `lec7`, `lec8`, `lec9`, `lec10`, `lec11`, `lec12`) VALUES
('احمد محمود عبد المنعم', '3000', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ', 'غ');

-- --------------------------------------------------------

--
-- Table structure for table `counting`
--

CREATE TABLE `counting` (
  `type` varchar(5) COLLATE utf8_bin NOT NULL,
  `count` varchar(5) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `counting`
--

INSERT INTO `counting` (`type`, `count`) VALUES
('1000', '');

-- --------------------------------------------------------

--
-- Table structure for table `exam_level1`
--

CREATE TABLE `exam_level1` (
  `ex12` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex11` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex10` varchar(20) COLLATE utf8_bin DEFAULT '0',
  `ex9` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex8` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex7` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex6` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex5` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex4` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex3` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex2` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex1` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `code` varchar(6) COLLATE utf8_bin NOT NULL,
  `name` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `exam_level1`
--

INSERT INTO `exam_level1` (`ex12`, `ex11`, `ex10`, `ex9`, `ex8`, `ex7`, `ex6`, `ex5`, `ex4`, `ex3`, `ex2`, `ex1`, `code`, `name`) VALUES
('0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '8/10', '1000', 'احمد طلال خليل'),
('0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1001', 'محمد خميس علي');

-- --------------------------------------------------------

--
-- Table structure for table `exam_level2`
--

CREATE TABLE `exam_level2` (
  `ex12` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex11` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex10` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex9` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex8` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex7` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex6` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex5` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex4` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex3` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex2` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex1` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `code` varchar(6) COLLATE utf8_bin NOT NULL,
  `name` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `exam_level2`
--

INSERT INTO `exam_level2` (`ex12`, `ex11`, `ex10`, `ex9`, `ex8`, `ex7`, `ex6`, `ex5`, `ex4`, `ex3`, `ex2`, `ex1`, `code`, `name`) VALUES
('0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '2000', 'محمد خليل قاسم');

-- --------------------------------------------------------

--
-- Table structure for table `exam_level3`
--

CREATE TABLE `exam_level3` (
  `ex12` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex11` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex10` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex9` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex8` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex7` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex6` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex5` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex4` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex3` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex2` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `ex1` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '0',
  `code` varchar(6) COLLATE utf8_bin NOT NULL,
  `name` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `exam_level3`
--

INSERT INTO `exam_level3` (`ex12`, `ex11`, `ex10`, `ex9`, `ex8`, `ex7`, `ex6`, `ex5`, `ex4`, `ex3`, `ex2`, `ex1`, `code`, `name`) VALUES
('0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '3000', 'احمد محمود عبد المنعم');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `password` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`name`, `password`) VALUES
('العظماء', 1978);

-- --------------------------------------------------------

--
-- Table structure for table `money_level1`
--

CREATE TABLE `money_level1` (
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `code` varchar(6) COLLATE utf8_bin NOT NULL,
  `class` varchar(200) COLLATE utf8_bin NOT NULL,
  `paymet_type` varchar(10) COLLATE utf8_bin NOT NULL DEFAULT 'لم يتم'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `money_level1`
--

INSERT INTO `money_level1` (`name`, `code`, `class`, `paymet_type`) VALUES
('احمد طلال خليل', '1000', 'اولي ثانوي ', 'تم'),
('محمد خميس علي', '1001', 'اولي ثانوي ', 'لم يتم');

-- --------------------------------------------------------

--
-- Table structure for table `money_level2`
--

CREATE TABLE `money_level2` (
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `code` varchar(6) COLLATE utf8_bin NOT NULL,
  `class` varchar(200) COLLATE utf8_bin NOT NULL,
  `paymet_type` varchar(10) COLLATE utf8_bin NOT NULL DEFAULT 'لم بتم'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `money_level2`
--

INSERT INTO `money_level2` (`name`, `code`, `class`, `paymet_type`) VALUES
('محمد خليل قاسم', '2000', 'تانيه ثانوي', 'لم بتم');

-- --------------------------------------------------------

--
-- Table structure for table `money_level3`
--

CREATE TABLE `money_level3` (
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `code` varchar(6) COLLATE utf8_bin NOT NULL,
  `class` varchar(200) COLLATE utf8_bin NOT NULL,
  `paymet_type` varchar(10) COLLATE utf8_bin NOT NULL DEFAULT 'لم يتم'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `money_level3`
--

INSERT INTO `money_level3` (`name`, `code`, `class`, `paymet_type`) VALUES
('احمد محمود عبد المنعم', '3000', 'تالته ثانوي', 'لم يتم');

-- --------------------------------------------------------

--
-- Table structure for table `name_level1`
--

CREATE TABLE `name_level1` (
  `name` varchar(100) COLLATE utf8_bin NOT NULL,
  `code` int(10) NOT NULL,
  `phone` varchar(11) COLLATE utf8_bin NOT NULL,
  `class` varchar(50) COLLATE utf8_bin NOT NULL,
  `group` varchar(200) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `name_level1`
--

INSERT INTO `name_level1` (`name`, `code`, `phone`, `class`, `group`) VALUES
('احمد طلال خليل', 1000, '01065418129', 'اولي ثانوي ', 'السبت-الاتنين-الاربعاء -> 10.5 : 12'),
('محمد خميس علي', 1001, '01236987126', 'اولي ثانوي ', 'السبت-الاتنين-الاربعاء -> 10.5 : 12');

-- --------------------------------------------------------

--
-- Table structure for table `name_level2`
--

CREATE TABLE `name_level2` (
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `code` int(10) NOT NULL,
  `phone` varchar(11) COLLATE utf8_bin NOT NULL,
  `class` varchar(50) COLLATE utf8_bin NOT NULL,
  `group` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `name_level2`
--

INSERT INTO `name_level2` (`name`, `code`, `phone`, `class`, `group`) VALUES
('محمد خليل قاسم', 2000, '01111077944', 'تانيه ثانوي', 'السبت-الاتنين-الاربعاء -> 3.5 : 5');

-- --------------------------------------------------------

--
-- Table structure for table `name_level3`
--

CREATE TABLE `name_level3` (
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `code` int(10) NOT NULL,
  `phone` varchar(11) COLLATE utf8_bin NOT NULL,
  `class` varchar(50) COLLATE utf8_bin NOT NULL,
  `group` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `name_level3`
--

INSERT INTO `name_level3` (`name`, `code`, `phone`, `class`, `group`) VALUES
('احمد محمود عبد المنعم', 3000, '01265417123', 'تالته ثانوي', 'السبت-الاتنين-الاربعاء -> 2 : 3.5');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance_level1`
--
ALTER TABLE `attendance_level1`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `attendance_level2`
--
ALTER TABLE `attendance_level2`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `attendance_level3`
--
ALTER TABLE `attendance_level3`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `counting`
--
ALTER TABLE `counting`
  ADD PRIMARY KEY (`type`);

--
-- Indexes for table `exam_level1`
--
ALTER TABLE `exam_level1`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `exam_level2`
--
ALTER TABLE `exam_level2`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `exam_level3`
--
ALTER TABLE `exam_level3`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`password`);

--
-- Indexes for table `money_level1`
--
ALTER TABLE `money_level1`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `money_level2`
--
ALTER TABLE `money_level2`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `money_level3`
--
ALTER TABLE `money_level3`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `name_level1`
--
ALTER TABLE `name_level1`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `name_level2`
--
ALTER TABLE `name_level2`
  ADD PRIMARY KEY (`code`);

--
-- Indexes for table `name_level3`
--
ALTER TABLE `name_level3`
  ADD PRIMARY KEY (`code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
