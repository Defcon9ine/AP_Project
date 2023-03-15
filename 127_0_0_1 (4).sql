-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 15, 2023 at 04:34 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectdb`
--
CREATE DATABASE IF NOT EXISTS `projectdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `projectdb`;

-- --------------------------------------------------------

--
-- Table structure for table `complainhistory`
--

CREATE TABLE `complainhistory` (
  `ComplainId` int(11) NOT NULL,
  `Complain` text NOT NULL,
  `Response` text DEFAULT NULL,
  `ComplainDate` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `status` varchar(100) NOT NULL,
  `type` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `complainhistory`
--

INSERT INTO `complainhistory` (`ComplainId`, `Complain`, `Response`, `ComplainDate`, `status`, `type`) VALUES
(4, 'id issues', NULL, '2023-03-15 07:41:22', 'unresolved', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `complain_has_student`
--

CREATE TABLE `complain_has_student` (
  `StudentId` varchar(10) NOT NULL,
  `StaffId` varchar(10) DEFAULT NULL,
  `ComplainId` int(11) NOT NULL,
  `complain` text NOT NULL,
  `response` text DEFAULT NULL,
  `status` varchar(64) NOT NULL,
  `type` varchar(64) DEFAULT NULL,
  `complainDate` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `complain_has_student`
--

INSERT INTO `complain_has_student` (`StudentId`, `StaffId`, `ComplainId`, `complain`, `response`, `status`, `type`, `complainDate`) VALUES
('1908765', '', 12, 'issues login on moodle', '', 'unresolved', '', '2023-03-15 08:14:08'),
('1908765', '', 13, 'what is letter grade', '', 'unresolved', '', '2023-03-15 08:24:09'),
('1908765', NULL, 14, 'ID ISSUES', NULL, 'UNRESOLVED', NULL, '2023-03-15 08:30:53'),
('null', NULL, 15, 'What does each letter grade mean', NULL, 'UNRESOLVED', NULL, '2023-03-15 08:34:05');

-- --------------------------------------------------------

--
-- Table structure for table `query`
--

CREATE TABLE `query` (
  `StudentId` varchar(10) NOT NULL,
  `StaffId` varchar(10) NOT NULL,
  `QueryId` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `queryhistory`
--

CREATE TABLE `queryhistory` (
  `QueryId` varchar(10) NOT NULL,
  `Query` text NOT NULL,
  `Response` text NOT NULL,
  `Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `IdNumber` varchar(10) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `catergory` varchar(100) NOT NULL,
  `password` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `staffcontact`
--

CREATE TABLE `staffcontact` (
  `IdNumber` varchar(10) NOT NULL,
  `TelephoneNumber` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `studentcontact`
--

CREATE TABLE `studentcontact` (
  `IdNumber` varchar(10) NOT NULL,
  `TelephoneNumber` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentcontact`
--

INSERT INTO `studentcontact` (`IdNumber`, `TelephoneNumber`) VALUES
('1908765', '876-835-1216'),
('mmm', 'mmm');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `IdNumber` varchar(10) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `EmailAddress` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`IdNumber`, `FirstName`, `LastName`, `EmailAddress`, `password`) VALUES
('000', 'chad', 'nel', 'chad@gmail.com', 'alien'),
('00000000', 'John', 'Doe', 'johndoe@yahoo.com', '0000'),
('1800001', 'Alias', 'Aliass', 'alias@gmail.com', 'alias'),
('1908765', 'Chadane', 'Nelson', 'chadanenelson@gmail.com', 'codex9'),
('mmm', 'mm', 'mmm', 'mmm', 'mmm'),
('random12', 'Alias', 'Alien', 'alias@yahoo', 'codex'),
('vvv', 'vvv', 'vvv', 'vvv', 'vvv');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `complain_has_student`
--
ALTER TABLE `complain_has_student`
  ADD UNIQUE KEY `ComplainId` (`ComplainId`);

--
-- Indexes for table `query`
--
ALTER TABLE `query`
  ADD UNIQUE KEY `StaffId` (`StaffId`),
  ADD UNIQUE KEY `QueryId` (`QueryId`),
  ADD UNIQUE KEY `StudentId` (`StudentId`);

--
-- Indexes for table `queryhistory`
--
ALTER TABLE `queryhistory`
  ADD PRIMARY KEY (`QueryId`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`IdNumber`);

--
-- Indexes for table `staffcontact`
--
ALTER TABLE `staffcontact`
  ADD PRIMARY KEY (`IdNumber`);

--
-- Indexes for table `studentcontact`
--
ALTER TABLE `studentcontact`
  ADD PRIMARY KEY (`IdNumber`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`IdNumber`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `complain_has_student`
--
ALTER TABLE `complain_has_student`
  MODIFY `ComplainId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `query`
--
ALTER TABLE `query`
  ADD CONSTRAINT `query_ibfk_1` FOREIGN KEY (`StaffId`) REFERENCES `staff` (`IdNumber`),
  ADD CONSTRAINT `query_ibfk_2` FOREIGN KEY (`StudentId`) REFERENCES `students` (`IdNumber`);

--
-- Constraints for table `queryhistory`
--
ALTER TABLE `queryhistory`
  ADD CONSTRAINT `queryhistory_ibfk_1` FOREIGN KEY (`QueryId`) REFERENCES `query` (`QueryId`);

--
-- Constraints for table `staff`
--
ALTER TABLE `staff`
  ADD CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`IdNumber`) REFERENCES `complain_has_student` (`StaffId`);

--
-- Constraints for table `staffcontact`
--
ALTER TABLE `staffcontact`
  ADD CONSTRAINT `staffcontact_ibfk_1` FOREIGN KEY (`IdNumber`) REFERENCES `staff` (`IdNumber`);

--
-- Constraints for table `studentcontact`
--
ALTER TABLE `studentcontact`
  ADD CONSTRAINT `studentcontact_ibfk_1` FOREIGN KEY (`IdNumber`) REFERENCES `students` (`IdNumber`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
