-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 18, 2018 at 09:15 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `juansapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_mensajes`
--

CREATE TABLE `t_mensajes` (
  `ID` int(3) NOT NULL,
  `EMAIL` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `MENSAJE` varchar(500) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Dumping data for table `t_mensajes`
--

INSERT INTO `t_mensajes` (`ID`, `EMAIL`, `MENSAJE`) VALUES
(1, 'Pepe', 'HOLA'),
(2, 'Christopher', 'Hola a todos'),
(3, 'Fernando', '¿Qué tal van los hilos de los webs?');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_mensajes`
--
ALTER TABLE `t_mensajes`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t_mensajes`
--
ALTER TABLE `t_mensajes`
  MODIFY `ID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
