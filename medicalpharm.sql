-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 12-Maio-2020 às 17:23
-- Versão do servidor: 10.1.36-MariaDB
-- versão do PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `medicalpharm`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `ajusteestoque`
--

CREATE TABLE `ajusteestoque` (
  `idMovimento` int(11) NOT NULL,
  `dataMovimento` date DEFAULT NULL,
  `numNota` varchar(18) DEFAULT NULL,
  `tipoMovimento` varchar(10) DEFAULT NULL,
  `serieNota` varchar(15) DEFAULT NULL,
  `dataEmissao` date DEFAULT NULL,
  `fornecedor_idfornecedor` int(11) NOT NULL,
  `produto_idproduto` int(11) NOT NULL,
  `lote` varchar(20) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  `dataVencimento` date DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `observacao` varchar(200) DEFAULT NULL,
  `idUsuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `destino`
--

CREATE TABLE `destino` (
  `idDestino` int(10) NOT NULL,
  `descDestino` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `destino`
--

INSERT INTO `destino` (`idDestino`, `descDestino`) VALUES
(1, 'EMERGÊNCIA'),
(2, 'CENTRO CIRURGICO'),
(3, 'POSTO DE ENFERMAGEM'),
(4, 'RECEPÇÃO'),
(5, 'AMOSTRA GRATIS');

-- --------------------------------------------------------

--
-- Estrutura da tabela `entrada`
--

CREATE TABLE `entrada` (
  `identrada` int(10) NOT NULL,
  `dataLancamento` date DEFAULT NULL,
  `dataEmissaoNota` date DEFAULT NULL,
  `numNota` varchar(10) DEFAULT NULL,
  `serieNota` varchar(10) DEFAULT NULL,
  `fornecedor_idfornecedor` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `entrada`
--

INSERT INTO `entrada` (`identrada`, `dataLancamento`, `dataEmissaoNota`, `numNota`, `serieNota`, `fornecedor_idfornecedor`) VALUES
(1, '2011-11-06', '2011-12-06', '2011', '1', 1),
(2, '2011-11-06', '2011-12-06', '2011', '2', 1),
(3, '2011-11-06', '2011-12-06', '2011', '3', 1),
(4, '2011-11-06', '2011-12-06', '2011', '4', 1),
(5, '2011-11-06', '2011-12-06', '2011', '5', 1),
(6, '2011-11-06', '2011-12-06', '2011', '6', 1),
(7, '2011-11-06', '2011-12-06', '2011', '7', 1),
(8, '2011-11-06', '2011-12-06', '2011', '8', 1),
(9, '2011-11-06', '2011-12-06', '2011', '9', 1),
(10, '2011-11-06', '2011-12-06', '2011', '10', 1),
(11, '2011-11-06', '2011-12-06', '2011', '11', 1),
(12, '2011-11-06', '2011-12-06', '2011', '12', 1),
(13, '2011-11-06', '2011-12-06', '2011', '13', 1),
(14, '2011-11-06', '2011-12-06', '2011', '14', 1),
(15, '2011-11-06', '2011-12-06', '2011', '15', 1),
(16, '2011-11-06', '2011-12-06', '2011', '16', 1),
(17, '2011-11-06', '2011-12-06', '2011', '17', 1),
(18, '2011-11-06', '2011-12-06', '2011', '18', 1),
(19, '2011-11-06', '2011-12-06', '2011', '19', 1),
(20, '2011-11-06', '2011-12-06', '2011', '20', 1),
(21, '2011-11-06', '2011-12-06', '2011', '21', 1),
(22, '2011-11-06', '2011-12-06', '2012', '1', 1),
(23, '2011-11-06', '2011-12-06', '2012', '2', 1),
(24, '2011-11-06', '2011-12-06', '2012', '3', 1),
(25, '2011-11-06', '2011-12-06', '2012', '4', 1),
(26, '2011-11-06', '2011-12-06', '2012', '6', 1),
(27, '2011-11-06', '2011-12-06', '2012', '5', 1),
(28, '2011-11-06', '2011-12-06', '2012', '7', 1),
(29, '2011-11-06', '2011-12-06', '2012', '8', 1),
(30, '2011-11-06', '2011-12-06', '2012', '9', 1),
(31, '2011-11-14', '2011-12-13', '81915', '001', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `idfornecedor` int(10) NOT NULL,
  `razaoSocial` varchar(70) DEFAULT NULL,
  `nomeFantasia` varchar(70) DEFAULT NULL,
  `cnpj` varchar(18) DEFAULT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `fax` varchar(14) DEFAULT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `inscricaoEstadual` varchar(20) DEFAULT NULL,
  `inscricaoMunicipal` varchar(20) DEFAULT NULL,
  `nomeVendedor` varchar(50) DEFAULT NULL,
  `telefoneVendedor` varchar(14) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `cidade` varchar(25) DEFAULT NULL,
  `estado` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`idfornecedor`, `razaoSocial`, `nomeFantasia`, `cnpj`, `telefone`, `fax`, `endereco`, `inscricaoEstadual`, `inscricaoMunicipal`, `nomeVendedor`, `telefoneVendedor`, `cep`, `cidade`, `estado`) VALUES
(1, 'RM HOSPITALAR TA ERRADO', 'RM HOSPITALAR', '02.836.799/0001.86', '(62)3335-3456', '(54)6545-6456', 'RUA', '546.546.546.', '165.465.465.', 'NETO', '(62)3353-2201', '76.380-000', 'GOIANESIA', 'GO');

-- --------------------------------------------------------

--
-- Estrutura da tabela `grupo`
--

CREATE TABLE `grupo` (
  `idgrupo` int(10) NOT NULL,
  `descGrupo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `grupo`
--

INSERT INTO `grupo` (`idgrupo`, `descGrupo`) VALUES
(1, 'MATERIAL'),
(2, 'MEDICAMENTO');

-- --------------------------------------------------------

--
-- Estrutura da tabela `itemnota`
--

CREATE TABLE `itemnota` (
  `idItem` int(10) NOT NULL,
  `preco` double DEFAULT NULL,
  `lote` varchar(20) DEFAULT NULL,
  `vencimento` date DEFAULT NULL,
  `produto_idproduto` int(10) NOT NULL,
  `entrada_identrada` int(10) NOT NULL,
  `quantidade` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `itemnota`
--

INSERT INTO `itemnota` (`idItem`, `preco`, `lote`, `vencimento`, `produto_idproduto`, `entrada_identrada`, `quantidade`) VALUES
(1, 1, '1019405', '2012-09-01', 1, 1, 18),
(2, 1, '100950', '2012-10-01', 2, 1, 820),
(3, 1, '1375388', '2012-08-01', 3, 1, 400),
(4, 1, 'BZLIDO052', '2012-08-01', 4, 1, 50),
(5, 1, 'BZLIDO022', '2012-05-01', 4, 1, 8),
(6, 1, '103685C', '2013-01-01', 5, 1, 50),
(7, 1, '2544092', '2013-08-01', 7, 1, 85),
(8, 1, 'FR1007503AP1002153', '2012-10-01', 9, 2, 13),
(9, 1, '20090413', '2013-06-01', 9, 2, 6),
(10, 1, '0190238', '2013-09-01', 10, 2, 6),
(11, 1, '2505115', '2012-09-01', 14, 2, 67),
(12, 1, '0910158', '2012-05-01', 15, 3, 20),
(13, 1, '052-03', '2012-03-01', 16, 3, 63),
(14, 1, '105.14.94', '2012-11-01', 16, 3, 200),
(15, 1, '1130270', '2012-12-01', 16, 3, 200),
(16, 1, '1130253', '2013-02-01', 17, 4, 150),
(17, 1, 'LKL', '2012-06-01', 18, 4, 200),
(18, 1, '1131365', '2013-08-01', 19, 4, 120),
(19, 1, '2160103', '2012-07-01', 20, 4, 72),
(20, 1, '1106405', '2014-06-01', 21, 5, 5),
(21, 1, 'BKX', '2013-06-01', 22, 5, 220),
(22, 1, 'AI009-10', '2012-12-01', 23, 5, 164),
(23, 1, '1112035', '2013-05-01', 24, 5, 23),
(24, 1, '10075271', '2012-07-01', 25, 5, 4),
(25, 1, 'LL161-10', '2012-09-01', 26, 5, 25),
(26, 1, '3578055', '2012-12-01', 26, 5, 18),
(27, 1, '11053582', '2014-05-01', 27, 5, 10),
(28, 1, '11042476', '2012-10-01', 28, 5, 10),
(29, 1, '10128969', '2012-12-01', 29, 5, 120),
(30, 1, '10096477', '2012-03-01', 30, 5, 100),
(31, 1, 'F27155', '2012-09-16', 31, 6, 1),
(32, 1, '11D11I', '2013-04-01', 32, 6, 1),
(33, 1, '2433059', '2012-06-01', 33, 6, 8),
(34, 1, 'ED11B001-2', '2013-02-01', 34, 7, 5),
(35, 1, '10L515', '2012-12-01', 34, 7, 8),
(36, 1, 'D511H056-2', '2013-08-01', 35, 7, 7),
(37, 1, '101749', '2012-11-01', 35, 7, 2),
(38, 1, 'L47625', '2013-07-01', 36, 7, 40),
(39, 1, '10100888', '2012-10-01', 37, 7, 20),
(40, 1, '10060539', '2012-06-01', 37, 7, 30),
(41, 1, '031315', '2013-03-01', 38, 7, 70),
(42, 1, '10040266', '2013-04-01', 39, 7, 80),
(43, 1, '2653', '2012-12-01', 40, 7, 10),
(44, 1, '11040341', '2013-03-01', 41, 7, 15),
(45, 1, '101494', '2012-03-01', 42, 7, 510),
(46, 1, 'AD012/10', '2012-06-01', 43, 7, 90),
(47, 1, '1107470', '2013-04-01', 44, 7, 40),
(48, 1, '1110470', '2013-06-01', 44, 7, 50),
(49, 1, '1008839', '2012-11-01', 45, 7, 60),
(50, 1, '101176', '2012-08-01', 46, 8, 120),
(51, 1, '10C690', '2012-02-01', 47, 8, 50),
(52, 1, '10C24B', '2012-03-01', 47, 8, 320),
(53, 1, '20179102F', '2012-04-01', 48, 8, 94),
(54, 1, '2661097', '2012-09-01', 49, 8, 18),
(55, 1, '1860312', '2013-02-01', 50, 9, 290),
(56, 1, '2660154', '2012-03-01', 51, 9, 72),
(57, 1, '0719636', '2013-01-01', 52, 9, 125),
(58, 1, '10050379B', '2012-05-01', 53, 9, 18),
(59, 1, '2662199', '2013-06-01', 54, 9, 102),
(60, 1, '0540309', '2013-06-01', 55, 9, 25),
(61, 1, '1170285', '2013-06-01', 56, 9, 15),
(62, 1, '1104233', '2013-03-01', 57, 9, 35),
(63, 1, '1113346', '2013-07-01', 57, 9, 100),
(64, 1, '177705', '2012-07-01', 58, 9, 20),
(65, 1, '1008053', '2012-10-01', 58, 9, 100),
(66, 1, '10060684B', '2012-06-01', 59, 9, 66),
(67, 1, '10070801B', '2012-07-01', 60, 10, 85),
(68, 1, '0480567', '2013-07-01', 61, 10, 73),
(69, 1, '0297339', '2013-07-01', 62, 10, 30),
(70, 1, '0297346', '2013-07-01', 62, 10, 200),
(71, 1, '2658811', '2013-09-01', 63, 10, 72),
(72, 1, '501139TC', '2016-09-01', 64, 11, 50),
(73, 1, 'CP10085', '2013-03-01', 65, 11, 50),
(74, 1, '301108', '2016-02-01', 66, 11, 500),
(75, 1, '062', '2014-09-01', 64, 11, 50),
(76, 1, '1810', '2016-07-20', 67, 12, 2),
(77, 1, '36', '2014-12-01', 68, 12, 96),
(78, 1, 'BE30/11E02', '2016-05-01', 69, 12, 42),
(79, 1, 'BE30/10F02', '2015-06-01', 70, 12, 73),
(80, 1, 'BE30/10D01', '2015-04-01', 71, 12, 74),
(81, 1, 'CS11C02', '2016-03-01', 72, 12, 60),
(82, 1, 'CS10C02', '2015-03-01', 73, 12, 400),
(83, 1, '990211', '2014-02-01', 74, 12, 3),
(84, 1, '880942', '2013-10-01', 75, 12, 13),
(85, 1, '09A002', '2012-12-01', 76, 12, 7),
(86, 1, 'WF2011032', '2014-01-01', 74, 12, 23),
(87, 1, '201034', '2015-09-01', 77, 12, 136),
(88, 1, '2011', '2013-01-01', 78, 13, 5),
(89, 1, '2011', '2013-01-01', 79, 13, 5),
(90, 1, '2012', '2013-01-01', 79, 13, 3),
(91, 1, '0169', '2014-09-01', 80, 13, 12),
(92, 1, '0093', '2014-06-01', 80, 13, 3),
(93, 1, 'PR445', '2013-12-01', 81, 13, 100),
(94, 1, '2012', '2014-01-01', 82, 13, 45),
(95, 1, '4919/10', '2012-09-01', 83, 13, 26),
(96, 1, '2011', '2013-01-01', 84, 13, 19),
(97, 1, 'BE20A-08F021', '2013-06-01', 85, 14, 1),
(98, 1, 'BE20A08C01', '2013-03-01', 86, 14, 1),
(99, 1, 'BE20A', '2013-12-01', 87, 14, 7),
(100, 1, 'GA1500', '2012-10-01', 88, 14, 12),
(101, 1, '02999458', '2015-10-01', 89, 14, 5),
(102, 1, '1110A', '2015-12-01', 90, 14, 7),
(103, 1, '7649', '2014-08-01', 92, 15, 60),
(104, 1, '2004P03004', '2014-08-01', 91, 15, 68),
(105, 1, '2004P02234', '2013-08-01', 91, 15, 5),
(106, 1, '4734', '2012-10-01', 94, 15, 4),
(107, 1, '2011', '2013-01-01', 93, 16, 9),
(108, 1, '74', '2014-12-01', 95, 16, 14),
(109, 1, '73', '2015-11-01', 95, 16, 24),
(110, 1, '15', '2016-02-01', 95, 16, 24),
(111, 1, '82', '2016-08-01', 96, 16, 19),
(112, 1, '02', '2015-01-01', 97, 16, 48),
(113, 1, '17', '2016-02-01', 97, 16, 24),
(114, 1, '20', '2015-03-01', 97, 16, 48),
(115, 1, '111287', '2016-04-01', 98, 16, 48),
(116, 1, '110151', '2016-01-01', 99, 16, 24),
(117, 1, '83546', '2013-09-01', 99, 16, 12),
(118, 1, '83', '2014-08-01', 100, 16, 24),
(119, 1, '74', '2014-07-01', 101, 16, 74),
(120, 1, '22', '2012-04-01', 103, 16, 48),
(121, 1, '31', '2012-06-01', 103, 16, 48),
(122, 1, '54', '2013-09-01', 104, 16, 24),
(123, 1, '48', '2013-08-01', 105, 16, 43),
(124, 1, '54', '2013-09-01', 105, 16, 24),
(125, 1, '23', '2013-04-01', 106, 16, 67),
(126, 1, '44', '2013-07-01', 106, 16, 24),
(127, 1, '05', '2013-02-01', 107, 16, 24),
(128, 1, '80', '2013-12-01', 107, 16, 24),
(129, 1, '03611', '2012-01-01', 108, 17, 1000),
(130, 1, '0493', '2014-01-01', 110, 17, 87),
(131, 1, '1183', '2014-05-01', 109, 17, 85),
(132, 1, '906010861', '2014-06-04', 111, 17, 4),
(133, 1, 'BE14A/11B02', '2016-02-01', 112, 17, 4),
(134, 1, 'BE14A/10L01', '2015-12-01', 113, 17, 4),
(135, 1, 'BE14A/06D01', '2012-04-01', 114, 17, 5),
(136, 1, 'BE14A/10K02', '2015-11-01', 115, 17, 1),
(137, 1, 'BE14A/11G03', '2016-07-01', 111, 17, 10),
(138, 1, '2003L01R', '2016-07-01', 116, 17, 1),
(139, 1, '13', '2014-03-01', 117, 17, 8),
(140, 1, '56', '2014-10-01', 117, 17, 48),
(141, 1, '39', '2014-07-01', 118, 17, 27),
(142, 1, '49', '2015-08-01', 118, 17, 13),
(143, 1, '18', '2015-03-01', 119, 17, 24),
(144, 1, '82', '2016-08-01', 119, 17, 24),
(145, 1, '59', '2015-10-01', 119, 17, 24),
(146, 1, '1113239', '2013-08-01', 120, 18, 120),
(147, 1, '1113499', '2013-08-01', 121, 18, 24),
(148, 1, '1113179', '2013-08-01', 122, 18, 96),
(149, 1, '1118012', '2016-05-01', 123, 18, 670),
(150, 1, '1217577', '2016-08-01', 124, 18, 390),
(151, 1, '201049', '2015-11-01', 125, 18, 115),
(152, 1, '2113', '2015-11-01', 125, 18, 85),
(153, 1, '100708', '2015-07-01', 126, 18, 115),
(154, 1, '100518', '2013-05-01', 127, 18, 100),
(155, 1, '080905', '2014-05-01', 128, 18, 190),
(156, 1, '1003292', '2013-03-01', 129, 19, 2),
(157, 1, '0161', '2013-01-01', 130, 19, 1),
(158, 0, '10010855', '2012-01-01', 131, 19, 1),
(159, 1, '109965', '2012-06-01', 132, 19, 380),
(160, 1, '103819', '2012-12-01', 133, 19, 690),
(161, 1, '0908242', '2012-11-01', 134, 20, 38),
(162, 1, '09085896', '2013-08-01', 13, 20, 20),
(163, 1, '09010337', '2012-01-01', 135, 20, 160),
(164, 1, '2657104', '2013-02-01', 136, 20, 24),
(165, 1, '666', '2013-02-01', 137, 20, 3),
(166, 1, '318593', '2012-09-01', 138, 20, 4),
(167, 1, '0495022', '2012-06-01', 139, 21, 45),
(168, 1, '11010157', '2013-01-01', 140, 21, 7),
(169, 1, '1007742', '2012-10-01', 141, 21, 5),
(170, 1, 'AQ321', '2012-10-01', 142, 21, 100),
(171, 1, '10096467', '2013-09-01', 6, 21, 110),
(172, 1, '1000079', '2012-01-01', 8, 21, 38),
(173, 1, '1006137', '2012-08-01', 143, 21, 100),
(174, 1, '1', '2011-12-07', 108, 22, 40),
(175, 1, '1', '2011-12-07', 125, 22, 12),
(176, 1, '1', '2011-12-07', 124, 22, 12),
(177, 1, '1', '2011-12-07', 123, 22, 6),
(178, 1, '1', '2011-12-07', 144, 22, 11),
(179, 1, '1', '2020-01-01', 145, 22, 2),
(180, 1, '11', '2011-12-07', 124, 22, 5),
(181, 1, '1', '2020-12-07', 146, 22, 1),
(182, 1, '1', '2011-12-07', 53, 22, 12),
(183, 1, '1', '2011-12-07', 5, 22, 1),
(184, 1, '1', '2011-12-07', 60, 22, 2),
(185, 1, '1', '2011-12-07', 59, 22, 2),
(186, 1, '1', '2011-12-07', 19, 22, 8),
(187, 1, '1', '2011-12-07', 18, 22, 4),
(188, 1, '1', '2011-12-07', 48, 22, 12),
(189, 1, '1', '2011-12-07', 43, 22, 12),
(190, 1, '1', '2011-12-07', 57, 22, 3),
(191, 1, '1', '2011-12-07', 58, 22, 2),
(192, 1, '1', '2011-12-07', 14, 22, 2),
(193, 1, '1', '2011-12-07', 20, 22, 4),
(194, 1, '11', '2011-12-07', 18, 22, 11),
(195, 1, '1', '2011-12-07', 44, 22, 9),
(196, 1, '1', '2011-12-07', 61, 22, 5),
(197, 1, '1', '2011-12-07', 54, 22, 13),
(198, 1, '1', '2011-12-07', 51, 23, 15),
(199, 1, '1103751', '2013-03-01', 147, 23, 5),
(200, 1, '1', '2011-12-07', 56, 23, 1),
(201, 1, '1', '2011-12-07', 62, 23, 9),
(202, 1, '1', '2011-12-07', 19, 23, 12),
(203, 1, '1', '2011-12-07', 63, 23, 28),
(204, 1, '1', '2011-12-07', 52, 23, 17),
(205, 1, '1', '2011-12-07', 50, 23, 11),
(206, 1, '1', '2011-12-07', 49, 23, 11),
(207, 1, '1', '2011-12-07', 148, 23, 16),
(208, 1, '1', '2011-12-07', 149, 23, 1),
(209, 1, '1', '2020-12-07', 150, 23, 1),
(210, 1, '1', '2011-12-07', 151, 24, 2),
(211, 1, '1', '2011-12-07', 152, 24, 1),
(212, 1, '1', '2011-12-07', 153, 24, 3),
(213, 1, '1', '2011-12-07', 91, 24, 15),
(214, 1, '1', '2011-12-07', 93, 24, 1),
(215, 1, '1', '2011-12-07', 94, 24, 3),
(216, 1, '1', '2011-12-07', 26, 24, 4),
(217, 1, '1', '2011-12-07', 111, 24, 1),
(218, 1, '1', '2011-12-07', 90, 24, 2),
(219, 1, '1', '2011-12-07', 154, 24, 1),
(220, 1, '1', '2011-12-07', 121, 24, 3),
(221, 1, '1', '2011-12-07', 120, 24, 2),
(222, 1, '1', '2011-12-07', 122, 24, 1),
(223, 1, '1', '2011-12-07', 98, 24, 4),
(224, 1, '1', '2011-12-07', 104, 24, 5),
(225, 1, '1', '2011-12-07', 106, 24, 10),
(226, 1, '1', '2011-12-07', 107, 24, 4),
(227, 1, '1', '2011-12-07', 105, 24, 4),
(228, 1, '1', '2011-12-07', 100, 24, 3),
(229, 1, '1', '2011-12-07', 119, 24, 9),
(230, 1, '1', '2011-12-07', 95, 24, 13),
(231, 1, '1', '2011-12-07', 96, 24, 11),
(232, 1, '1', '2011-12-07', 118, 24, 18),
(233, 1, '1', '2011-12-07', 117, 24, 13),
(234, 1, '1', '2011-12-07', 155, 25, 5),
(235, 1, '1', '2011-12-07', 156, 25, 6),
(236, 1, '1', '2011-12-07', 96, 25, 1),
(237, 1, '1', '2011-12-07', 126, 25, 5),
(238, 1, '1', '2011-12-07', 127, 25, 6),
(239, 1, '1', '2011-12-07', 72, 25, 13),
(240, 1, '1', '2011-12-07', 70, 25, 20),
(241, 1, '1', '2011-12-07', 71, 25, 19),
(242, 1, '1', '2011-12-07', 69, 25, 21),
(243, 1, '1', '2011-12-07', 157, 25, 1),
(244, 1, '1', '2011-12-07', 79, 26, 1),
(245, 1, '1', '2011-12-07', 163, 26, 1),
(246, 1, '1', '2011-12-07', 40, 26, 30),
(247, 1, '1', '2011-12-07', 25, 26, 2),
(248, 1, '1', '2011-12-07', 162, 26, 2),
(249, 1, '1', '2011-12-07', 42, 26, 5),
(250, 1, '1', '2020-12-07', 164, 26, 3),
(251, 1, '1', '2011-12-07', 165, 26, 2),
(252, 1, '1', '2020-07-07', 166, 26, 1),
(253, 1, '1', '2011-12-07', 167, 26, 1),
(254, 1, '1', '2011-12-07', 34, 26, 1),
(255, 1, '1', '2011-12-07', 168, 26, 2),
(256, 1, '1', '2011-12-07', 159, 27, 5),
(257, 1, '1', '2011-12-07', 169, 27, 19),
(258, 1, '1', '2011-12-07', 142, 27, 4),
(259, 1, '1', '2011-12-07', 170, 27, 2),
(260, 1, '1', '2011-12-07', 136, 27, 7),
(261, 1, '1', '2011-12-07', 13, 27, 5),
(262, 1, '1', '2011-12-07', 134, 27, 5),
(263, 1, '1', '2011-12-07', 171, 28, 8),
(264, 1, '1', '2011-12-07', 172, 28, 5),
(265, 1, '1', '2011-12-07', 173, 28, 2),
(266, 1, '1', '2011-12-07', 174, 28, 2),
(267, 1, '1', '2011-12-07', 175, 28, 3),
(268, 1, '1', '2011-12-07', 176, 28, 4),
(269, 1, '1', '2011-12-07', 177, 28, 2),
(270, 1, '1', '2011-12-07', 68, 29, 12),
(271, 1, '1', '2020-12-07', 178, 29, 1),
(272, 1, '1', '2020-12-07', 179, 29, 1),
(273, 1, '1', '2011-12-07', 174, 29, 17),
(274, 1, '1', '2011-12-07', 171, 29, 14),
(275, 1, '1', '2011-12-07', 180, 30, 1),
(276, 1, '1', '2011-12-07', 181, 30, 1),
(277, 1, '1', '2011-12-07', 182, 30, 1),
(278, 1, '1', '2011-12-07', 183, 30, 1),
(279, 1, '1', '2011-12-07', 184, 30, 1),
(280, 1, '1', '2020-12-07', 185, 30, 1),
(281, 1, '1', '2020-12-07', 186, 30, 1),
(282, 0.02, '848', '2016-09-30', 187, 31, 1000),
(283, 0.49, '10080690', '2013-08-30', 224, 31, 100),
(284, 0.84, '1115134', '2013-08-30', 147, 31, 24),
(285, 0.73, '0589-451/11', '2013-10-30', 154, 31, 100),
(286, 6.1, '70212551', '2013-11-30', 180, 31, 5),
(287, 1.25, '1404', '2014-11-30', 169, 31, 30),
(288, 0.13, '8173', '2013-04-30', 168, 31, 300),
(289, 0.13, 'PR19075', '2014-07-30', 81, 31, 300),
(290, 0.13, '9241', '2014-01-30', 205, 31, 300),
(291, 0.08, '110708', '2016-11-30', 231, 31, 100),
(292, 0.08, '110616', '2016-06-30', 156, 31, 100),
(293, 1.18, '1114889', '2013-11-30', 120, 31, 192);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `idproduto` int(11) NOT NULL,
  `descProduto` varchar(80) DEFAULT NULL,
  `estMinimo` int(10) DEFAULT NULL,
  `estIdeal` int(10) DEFAULT NULL,
  `grupo_idgrupo` int(10) NOT NULL,
  `unidadeMedida_idunidadeMedida` int(10) NOT NULL,
  `quantidade` int(10) DEFAULT NULL,
  `concentracao` varchar(80) DEFAULT NULL,
  `ultimoPreço` double DEFAULT NULL,
  `id_SubGrupo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idproduto`, `descProduto`, `estMinimo`, `estIdeal`, `grupo_idgrupo`, `unidadeMedida_idunidadeMedida`, `quantidade`, `concentracao`, `ultimoPreço`, `id_SubGrupo`) VALUES
(1, 'SORO RINGER LACTATO 500ML', 10, 50, 2, 5, 18, '', 1, 9),
(2, 'ACIDO ACETILSALICILICO 100MG', 10, 50, 2, 2, 814, 'ACETILDOR', 1, 10),
(3, 'AMOXICILINA 500MG', 10, 50, 2, 6, 400, 'AMOXICILINA', 1, 6),
(4, 'CEFAZOLINA 1G', 10, 50, 2, 5, 58, 'KEFAZOL - CEFAZOLIN', 1, 6),
(5, 'CEFALOTINA 1G', 10, 50, 2, 5, 20, 'KEFLIN', 1, 6),
(6, 'DIAZEPAM 10MG', 10, 50, 2, 2, 70, '', 1, 5),
(7, 'CEFTRIAXONA 1G - IV', 10, 50, 2, 5, 85, 'CEFTRIAX - ROCEFIN', 1, 6),
(8, 'FENITOINA 50MG/ML', 10, 50, 2, 4, 38, 'HIDANTAL', 1, 5),
(9, 'CEFTRIAXONA 1G - IM', 10, 50, 2, 5, 19, 'CEFTRIAX - ROCEFIN', 1, 6),
(10, 'BENZILPENICILINA POTASSICA + PROCAINA 400.000', 10, 50, 2, 5, 6, 'WYCILIN - WONILIN', 1, 6),
(11, 'FENITOINA 100MG', 10, 50, 2, 2, 0, 'HIDANTAL', NULL, 5),
(12, 'FENOBARBITAL 100MG', 10, 50, 2, 2, 0, 'GARDENAL', NULL, 5),
(13, 'FENOBARBITAL 200MG/ML', 10, 50, 2, 4, 20, 'GARDENAL', 1, 5),
(14, 'BENZILPENICILINA BENZATINA 1.200.000 UI', 10, 50, 2, 5, 57, 'BENZETACIL', 1, 6),
(15, 'BENZILPENICILINA POTASSICA 5.000.000 UI', 10, 50, 2, 5, 20, 'PENICILINA CRISTALINA', 1, 6),
(16, 'CLORETO DE POTASSIO 10% 10ML', 10, 50, 2, 5, 463, '', 1, 9),
(17, 'CLORETO SODICO 0,9% 10ML', 10, 50, 2, 5, 150, '', 1, 10),
(18, 'GLICOSE 25% (AMP 10ML)', 10, 50, 2, 5, 200, '', 1, 10),
(19, 'AGUA DESTILADA 10ML', 10, 50, 2, 5, 0, '', 1, 9),
(20, 'HIDROCORTISONA 500 MG', 10, 50, 2, 5, 72, 'CORTISON - SOLUCORTEF', 1, 10),
(21, 'FLEET ENEMA 180ML', 10, 50, 2, 5, 5, '', 1, 10),
(22, 'BICARBONATO DE SODIO 8,4% 10ML', 10, 50, 2, 4, 220, '', 1, 9),
(23, 'GLUCONATO DE CALCIO 10% 100MG/ML (AMP 10ML)', 10, 50, 2, 4, 164, '', 1, 9),
(24, 'METRONIDAZOL 100ML', 10, 20, 2, 5, 23, 'FLAGYL', 1, 6),
(25, 'LIDOCAINA 2% GELEIA', 5, 10, 2, 5, 4, 'XYLOCAINA GEL', 1, 7),
(26, 'LIDOCAINA 2% S/ VASO 20ML P/ ANESTESIA LOCAL - MARCA CRISTALIA', 25, 75, 2, 5, 41, 'XYLOCAINA 2% P/ ANESTESIA LOCAL', 1, 7),
(27, 'BUPIVACAINA 0,5% S/ EPINEFRINA 20ML P/ PERIDURAL- MARCA CRISTALIA', 2, 3, 2, 5, 10, 'BUPIVACAINA S/ VASOCONSTRITOR P/ PERIDURAL', 1, 7),
(28, 'BUPIVACAINA 0,5% C/ EPINEFRINA 20ML P/ PERIDURAL - MARCA CRISTALIA', 2, 3, 2, 5, 10, 'BUPIVACAINA C/ VASOCONSTRITOR P/ PERIDURAL', 1, 7),
(29, 'BUPIVACAINA HIPERBARICA 0,5% PESADA 4ML P/ RAQUIANESTESIA - MARCA CRISTALIA', 40, 80, 2, 5, 120, 'BUPIVACAINA P/ RAQUIANESTESIA', 1, 7),
(30, 'LIDOCAINA HIPERBARICA 5% 2ML P/ RAQUIANESTESIA - MARCA CRISTALIA', 10, 50, 2, 5, 100, 'XYLOCAINA PESADA 5% P/ RAQUIANESTESIA', 1, 7),
(31, 'VITELINATO DE PRATA 10% 5ML', 3, 5, 2, 5, 1, 'ARGIROL - CREDE', 1, 10),
(32, 'BROMIDRATO DE FENOTEROL', 2, 5, 2, 5, 1, 'BEROTEC', 1, 10),
(33, 'BROMETO DE IPRATROPIO', 3, 5, 2, 5, 8, 'ATROVENT', 1, 10),
(34, 'BUTILBROMETO DE ESCOPOLAMINA+DIPIRONA SODICA GOTAS', 10, 50, 2, 5, 11, 'BUSCOPAN COMPOSTO GOTAS', 1, 10),
(35, 'DIPIRONA SODICA 500MG/ML (GOTAS)', 10, 50, 2, 5, 9, 'NOVALGINA - MAGNOPYROL', 1, 10),
(36, 'METILDOPA 250MG', 0, 0, 2, 2, 40, '', 1, 10),
(37, 'AMIODARONA 200MG', 10, 50, 2, 2, 14, '', 1, 10),
(38, 'BUTILBROMETO DE ESCOPALAMINA+DIPIRONA SODICA', 10, 50, 2, 2, 70, 'BUSCOPAN COMPOSTO', 1, 10),
(39, 'DICLOFENACO DE SODIO 50MG', 10, 50, 2, 2, 53, 'VOLTAREN', 1, 10),
(40, 'NIFEDIPINO 20 MG', 10, 50, 2, 2, 10, 'ADALAT', 1, 10),
(41, 'ISOXSUPRINA 10MG', 10, 50, 2, 2, 15, 'INIBINA', 1, 10),
(42, 'CAPTOPRIL 25 MG', 10, 50, 2, 2, 510, '', 1, 10),
(43, 'AMIODARONA 50MG/ML (AMP 3ML)', 10, 50, 2, 4, 90, '', 1, 10),
(44, 'DESLANOSIDEO 0,2MG/ML (AMP 2ML)', 10, 50, 2, 4, 90, 'CEDILANIDE', 1, 10),
(45, 'ERGOMETRINA 0,2MG/ML (AMP 1ML)', 10, 50, 2, 4, 60, 'ERGOTRATE', 1, 10),
(46, 'PARACETAMOL 750MG', 10, 50, 2, 2, 120, 'TYLENOL', 1, 10),
(47, 'DIPIRONA SODICA 500MG', 10, 50, 2, 2, 370, 'NOVALGINA - MAGNOPYROL', 1, 10),
(48, 'ATROPINA 0,25MG/ML (AMP 1ML)', 10, 50, 2, 4, 89, '', 1, 5),
(49, 'METOCLOPRAMIDA 5MG/ML (AMP 2ML)', 10, 50, 2, 4, 18, 'PLASIL', 1, 10),
(50, 'BROMOPRIDA 5MG/ML (AMP 2ML)', 10, 50, 2, 4, 283, 'PLAMET', 1, 10),
(51, 'RANITIDINA 25MG/ML (AMP 2ML)', 10, 50, 2, 4, 72, '', 1, 10),
(52, 'DICLOFENADO DE SODIO 25MG/ML (AMP 3ML)', 10, 50, 2, 4, 132, 'VOLTAREN', 1, 10),
(53, 'BUTILBROMETO DE ESCOPOLAMINA 20MG/ML (AMP 1ML', 10, 50, 2, 4, 8, 'HIOSCINA', 1, 10),
(54, 'FUROSEMIDA 10MG/ML (AMP 2ML)', 10, 50, 2, 4, 90, 'LASIX', 1, 10),
(55, 'GENTAMICINA 40MG/ML (AMP 2ML)', 10, 50, 2, 4, 25, 'GARAMICINA', 1, 6),
(56, 'DEXAMETASONA 4MG/ML (AMP 2ML)', 10, 50, 2, 4, 15, '', 1, 10),
(57, 'FITOMENADIONA 10MG/ML (AMP 1ML)', 10, 50, 2, 4, 135, 'KANAKION - VITAMINA K', 1, 10),
(58, 'OCITOCINA 5UI/ML (AMP 1ML)', 10, 50, 2, 4, 120, 'SYNTONCINON', 1, 10),
(59, 'ADRENALINA OU EPINEFRINA 1MG/ML (AMP 1ML)', 2, 3, 2, 4, 52, 'ADRENALINA', 1, 10),
(60, 'DOPAMINA 5MG/ML (AMP 10ML)', 10, 50, 2, 4, 85, 'REVIVAN', 1, 10),
(61, 'AMINOFILINA 24MG/ML (AMP 10ML)', 10, 50, 2, 4, 72, '', 1, 10),
(62, 'BUTILBROMETO DE ESCOPOLAMINA+DIPIRONA SODICA', 10, 50, 2, 4, 224, 'BUSCOPAN COMPOSTO', 1, 10),
(63, 'DIPIRONA SODICA 500MG/ML (AMP 2ML)', 10, 50, 2, 4, 36, 'NOVALGINA - MAGNOPYROL', 1, 10),
(64, 'CAMPO OPERATORIO 45X50CM', 10, 50, 1, 7, 100, 'COMPRESSA CIRURGICA GRANDE 45X50CM', 1, 1),
(65, 'CAMPO OPERATORIO 23X25CM', 10, 50, 1, 7, 50, 'COMPRESSA CIRURGICA MEDIA 23X25CM', 1, 1),
(66, 'COMPRESSA DE GAZE 7,5X7,5CM', 10, 50, 1, 7, 500, '', 1, 1),
(67, 'ALGODAO HIDROFILO 500GR', 10, 50, 1, 7, 2, '', 1, 1),
(68, 'ATADURA DE CREPE 25CM', 10, 50, 1, 7, 96, '', 1, 1),
(69, 'AGULHA 25X7', 10, 50, 1, 7, 0, '', 1, 1),
(70, 'AGULHA 13X4,5', 10, 50, 1, 7, 69, '', 1, 1),
(71, 'AGULHA 40X12', 10, 50, 1, 7, 45, '', 1, 1),
(72, 'LAMINA DE BISTURI N° 15', 10, 50, 1, 7, 40, '', 1, 1),
(73, 'LAMINA DE BISTURI N° 22', 10, 50, 1, 7, 400, '', 1, 1),
(74, 'AGULHA PARA ANESTESIA ESPINHAL 25GX3,5', 10, 50, 1, 7, 0, '', 1, 1),
(75, 'AGULHA PARA ANESTESIA ESPINHAL 27GX3,5', 10, 50, 1, 7, 8, '', 1, 1),
(76, 'AGULHA PARA ANESTESIA ESPINHAL 23GX80', 10, 50, 1, 7, 2, '', 1, 1),
(77, 'SERINGA 1 ML COM AGULHA', 10, 50, 1, 7, 136, '', 1, 1),
(78, 'FITA ADESIVA PARA AUTOCLAVE', 10, 50, 1, 7, 5, '', 1, 1),
(79, 'FITA ADESIVA 19MM', 10, 50, 1, 7, 8, 'FITA CREPE', 1, 1),
(80, 'ALCOOL 70%', 10, 50, 1, 7, 8, '', 1, 1),
(81, 'LUVA PROCEDIMENTO M', 10, 50, 1, 7, 300, '', 0.13, 1),
(82, 'LAMINA PARA TRICOTOMIA', 10, 50, 1, 7, 45, '', 1, 1),
(83, 'CLAMP UMBILICAL', 10, 20, 1, 7, 26, '', 1, 1),
(84, 'PULSEIRA PARA RN', 10, 50, 1, 7, 19, 'RECEM NASCIDO', 1, 1),
(85, 'TUBO ENDOTRAQUEAL 7,5', 10, 50, 1, 7, 1, '', 1, 1),
(86, 'TUBO ENDOTRAQUEAL 6,5', 10, 50, 1, 7, 1, '', 1, 1),
(87, 'TUBO ENDOTRAQUEAL 3,5', 10, 50, 1, 7, 7, '', 1, 1),
(88, 'DRENO PENROSE N 3', 10, 50, 1, 7, 12, '', 1, 1),
(89, 'SERINGA 60 ML SEM AGULHA', 10, 50, 1, 7, 5, '', 1, 1),
(90, 'COLETOR DE URINA SISTEMA FECHADO', 10, 50, 1, 7, 7, '', 1, 1),
(91, 'SONDA URETRAL N° 10', 10, 50, 1, 7, 73, '', 1, 1),
(92, 'SONDA URETRAL N° 8', 10, 50, 1, 7, 60, '', 1, 1),
(93, 'SONDA URETRAL N° 14', 10, 50, 1, 7, 9, '', 1, 1),
(94, 'SONDA URETRAL N° 16', 10, 50, 1, 7, 4, '', 1, 1),
(95, 'FIO MONONYLON 3-0 AGULHADO - MARCA SHALON', 10, 50, 1, 7, 62, '', 1, 1),
(96, 'FIO MONONYLON 4-0 AGULHADO - MARCA SHALON', 10, 50, 1, 7, 19, '', 1, 1),
(97, 'FIO MONONYLON 0 AGULHADO- MARCA SHALON', 10, 50, 1, 7, 120, '', 1, 1),
(98, 'FIO ALGODAO 0 SEM AGULHA - MARCA SHALON', 10, 50, 1, 7, 48, '', 1, 1),
(99, 'FIO ALGODAO 2-0 AGULHADO - MARCA SHALON', 10, 50, 1, 7, 36, '', 1, 1),
(100, 'FIO CATGUT SIMPLES 2-0 AGULHADO - MARCA SHALON', 10, 50, 1, 7, 24, '', 1, 1),
(101, 'FIO CATGUT CROMADO 0 SEM AGULHA - MARCA SHALON', 10, 50, 1, 7, 74, '', 1, 1),
(103, 'FIO CATGUT CROMADO 1  SEM AGULHA - MARCA SHALON', 10, 50, 1, 7, 96, '', 1, 1),
(104, 'FIO CATGUT SIMPLES 4-0 AGULHADO - MARCA SHALON', 10, 50, 1, 7, 24, '', 1, 1),
(105, 'FIO CATGUT SIMPLES 3-0 AGULHADO - MARCA SHALON', 10, 50, 1, 7, 67, '', 1, 1),
(106, 'FIO CATGUT CROMADO 4-0 AGULHADO - MARCA SHALON', 10, 50, 1, 7, 91, '', 1, 1),
(107, 'FIO CATGUT CROMADO 3-0 AGULHADO - MARCA SHALON', 10, 50, 1, 7, 48, '', 1, 1),
(108, 'CURATIVO ESTERIL', 10, 50, 1, 7, 990, 'BLOOD STOP REDONDO', 1, 1),
(109, 'LUVA CIRURGICA N. 7,5 - MARCA MUCAMBO', 10, 50, 1, 7, 75, '', 1, 1),
(110, 'LUVA CIRURGICA N. 7,0 - MARCA MUCAMBO', 10, 50, 1, 7, 87, '', 1, 1),
(111, 'SONDA DE FOLEY N° 16', 10, 50, 1, 7, 14, '', 1, 1),
(112, 'SONDA DE FOLEY N° 10', 10, 50, 1, 7, 4, '', 1, 1),
(113, 'SONDA DE FOLEY N° 18', 10, 50, 1, 7, 4, '', 1, 1),
(114, 'SONDA DE FOLEY N° 22', 10, 50, 1, 7, 5, '', 1, 1),
(115, 'SONDA DE FOLEY N° 14', 10, 50, 1, 7, 1, '', 1, 1),
(116, 'SONDA DE FOLEY N° 20', 10, 50, 1, 7, 1, '', 1, 1),
(117, 'FIO MONONYLON 6-0 AGULHADO - MARCA SHALON', 10, 50, 1, 7, 56, '', 1, 1),
(118, 'FIO MONONYLON 5-0 AGULHADO - MARCA SHALON', 10, 50, 1, 7, 40, '', 1, 1),
(119, 'FIO MONONYLON 2-0 AGULHADO - MARCA SHALON', 10, 50, 1, 7, 72, '', 1, 1),
(120, 'SORO FISIOLOGICO 0,9% 500ML', 10, 50, 2, 5, 264, '', 1.18, 9),
(121, 'SORO RINGER 500ML', 10, 50, 2, 5, 0, '', 1, 9),
(122, 'SORO GLICOSADO 5% 500ML', 10, 50, 2, 5, 76, '', 1, 9),
(123, 'SERINGA 5 ML COM AGULHA', 10, 50, 1, 7, 630, '', 1, 1),
(124, 'SERINGA 20 ML COM AGULHA', 10, 50, 1, 7, 380, '', 1, 1),
(125, 'SERINGA 10 ML COM AGULHA', 10, 50, 1, 7, 145, '', 1, 1),
(126, 'SCALP N° 25', 10, 50, 1, 7, 100, '', 1, 1),
(127, 'SCALP N° 19', 10, 50, 1, 7, 100, '', 1, 1),
(128, 'CATETER INTRAVENOSO 20GX32', 10, 50, 1, 7, 180, 'INTRACATH', 1, 1),
(129, 'IODO 2%', 10, 50, 1, 5, 2, '', 1, 1),
(130, 'VASELINA LIQUIDA', 2, 5, 1, 5, 1, '', 1, 1),
(131, 'PVPI TOPICO', 10, 50, 1, 5, 1, 'PVPI OU POVIDINE TOPICO - TINTURA DE IODO 2%', 0, 1),
(132, 'AMITRIPTILINA 25MG', 10, 50, 2, 2, 371, '', 1, 5),
(133, 'CARBAMAZEPINA 200MG', 10, 50, 2, 2, 690, 'TEGRETOL', 1, 5),
(134, 'MEPERIDINA OU PETIDINA 50MG/ML (AMP 2ML)', 10, 50, 2, 4, 38, 'DOLANTINA - DOLOSAL', 1, 5),
(135, 'PROMETAZINA 25MG', 10, 50, 2, 2, 160, 'FENERGAN', 1, 10),
(136, 'TRAMADOL 100MG', 10, 50, 2, 4, 20, 'TRAMAL - SYLADOR - TRAMADON', 1, 5),
(137, 'LEVOMEPROMAZINA (GOTAS)', 10, 50, 2, 5, 3, 'NEOZINE', 1, 5),
(138, 'CLONAZEPAN 2,5MG/ML (GOTAS)', 10, 50, 2, 5, 4, 'RIVOTRIL', 1, 5),
(139, 'HALOPERIDOL 5MG/ML (AMP 1ML)', 10, 50, 2, 4, 45, 'HALDOL', 1, 5),
(140, 'TIOPENTAL SODICO 1G', 10, 50, 2, 5, 7, 'THIONEMBUTAL', 1, 5),
(141, 'MIDAZOLAN 5MG/ML (AMP 3ML)', 10, 50, 2, 4, 5, 'DORMONID', 1, 5),
(142, 'PROMETAZINA 25 MG/ML (AMP 2 ML)', 10, 50, 2, 4, 100, 'FENERGAN', 1, 10),
(143, 'CLORPROMAZINA 25MG (AMP 5ML)', 10, 50, 2, 4, 100, 'AMPLICTIL', 1, 5),
(144, 'SERINGA 3 ML COM AGULHA', 10, 50, 1, 7, 0, '', 1, 1),
(145, 'OCULOS PROTETOR', 1, 1, 1, 7, 2, '', 1, 1),
(146, 'APARELHO DE GLICOTESTE', 1, 1, 1, 7, 1, '', 1, 13),
(147, 'ETILEFRINA 10MG/ML (AMP 1ML)', 10, 50, 2, 4, 29, 'EFORTIL', 0.84, 10),
(148, 'MASCARA DESCARTAVEL', 10, 50, 1, 7, 0, '', 1, 1),
(149, 'GORRO DESCARTAVEL', 10, 50, 1, 7, 0, '', 1, 1),
(150, 'GORRO DE TECIDO', 10, 10, 1, 7, 1, '', 1, 4),
(151, 'SONDA NASOGASTRICA LONGA N 6', 10, 20, 1, 7, 0, '', 1, 1),
(152, 'SONDA NASOGASTRICA LONGA Nº 16', 10, 20, 1, 7, 0, '', 1, 1),
(153, 'SONDA LEVINE PEDIATRICA Nº 10', 10, 20, 1, 7, 0, '', 1, 1),
(154, 'EQUIPO MACROGOTAS C/ INJETOR LATERAL - COMPOJET', 10, 50, 1, 7, 100, '', 0.73, 1),
(155, 'SCALP Nº 27', 10, 50, 1, 7, 0, '', 1, 1),
(156, 'SCALP Nº 23', 10, 50, 1, 7, 100, '', 0.08, 1),
(157, 'AGULHA 25X8', 10, 50, 1, 7, 0, '', 1, 1),
(158, 'DEXAMETASONA 0,75MG', 10, 50, 2, 2, 0, 'DECADRON', NULL, 10),
(159, 'DEXAMETASONA 4MG', 10, 50, 2, 2, 0, 'DECADRON', 1, 10),
(160, 'FEXOFENADINA 120MG', 10, 50, 2, 2, 0, 'FEXODANE', NULL, 10),
(161, 'CETOCONAZOL 2% POMADA', 10, 20, 2, 7, 3, 'NIZORAL', NULL, 10),
(162, 'TIOCONAZOL +TINIDAZOL  (100MG/150MG/5G)', 0, 0, 2, 7, 0, 'TAKIL', 1, 14),
(163, 'ESPARADRAPO MICROPORE 5CM', 10, 50, 1, 7, 0, 'ESPARADRAPO ANTIALERGICO', 1, 1),
(164, 'CUBA RIM DE INOX PEQUENA', 10, 10, 1, 7, 3, '', 1, 13),
(165, 'MARTELO PARA REFLEXO', 1, 2, 1, 7, 1, '', 1, 13),
(166, 'BALA DE OXIGENIO GRANDE', 1, 1, 1, 7, 1, '', 1, 13),
(167, 'FOCO', 1, 1, 1, 7, 0, '', 1, 13),
(168, 'LUVA PROCEDIMENTO G', 1, 100, 1, 7, 300, '', 0.13, 1),
(169, 'LUVA CIRURGICA N. 8,0 - MARCA MUCAMBO', 10, 10, 1, 7, 30, '', 1.25, 1),
(170, 'DIAZEPAM 5MG/ML (AMP 2ML)', 10, 50, 2, 4, 0, 'DIEMPAX', 1, 5),
(171, 'ATADURA DE ALGODAO 20CM', 10, 50, 1, 7, 0, 'ALGODAO ORTOPEDICO', 1, 1),
(172, 'ATADURA GESSADA 20CM', 10, 50, 1, 7, 0, '', 1, 1),
(173, 'ATADURA GESSADA 10CM', 10, 50, 1, 7, 0, '', 1, 1),
(174, 'ATADURA DE ALGODAO 10CM', 10, 50, 1, 7, 0, 'ALGODAO ORTOPEDICO', 1, 1),
(175, 'ATADURA DE CREPE 10CM', 10, 50, 1, 7, 0, '', 1, 1),
(176, 'ATADURA DE CREPE 15CM', 10, 50, 1, 7, 0, '', 1, 1),
(177, 'ATADURA DE CREPE 20CM', 10, 50, 1, 7, 0, '', 1, 1),
(178, 'COLETE CERVICAL', 10, 50, 1, 7, 1, '', 1, 1),
(179, 'SERRA PARA GESSO', 1, 10, 1, 7, 1, '', 1, 13),
(180, 'ESPARADRAPO COMUM 10CM', 1, 8, 1, 7, 5, '', 6.1, 1),
(181, 'NITROFURAZONA 2MG/G (POMADA 500GR)', 10, 50, 2, 5, 0, 'FURACIN', 1, 10),
(182, 'ALCOOL GEL', 10, 50, 1, 5, 0, '', 1, 1),
(183, 'BANDEJA RETANGULAR DE INOX', 1, 2, 1, 7, 0, '', 1, 13),
(184, 'CANETA PARA BISTURI ELETRICO', 1, 2, 1, 7, 0, '', 1, 13),
(185, 'BISTURI ELETRICO', 1, 2, 1, 7, 1, '', 1, 13),
(186, 'MESA DE MAYO', 1, 1, 1, 7, 1, '', 1, 13),
(187, 'ABAIXADOR DE LINGUA', 1, 2, 1, 7, 1000, '', 0.02, 1),
(188, 'ANTI-DIARREICO', 10, 50, 2, 7, 0, 'LACTIPAN - FLORAX - FLORATIL - KAOMAGMA', NULL, 10),
(189, 'ANTI-TUSSIGENO', 10, 50, 2, 5, 0, '', NULL, 10),
(190, 'BOLSA PARA COLOSTOMIA', 10, 50, 1, 7, 0, '', NULL, 1),
(191, 'BETAMETASONA 7MG/ML', 10, 50, 2, 4, 0, 'DIPROSPAN - CELESTONE', NULL, 10),
(192, 'BENZILPENICILINA BENZATINA 600.000 UI', 10, 50, 2, 5, 0, 'BENZETACIL', NULL, 6),
(193, 'CATETER NASAL DE OXIGENIO Nº 04', 10, 50, 1, 7, 0, '', NULL, 1),
(194, 'CATETER NASAL DE OXIGENIO Nº 06', 10, 50, 1, 7, 0, '', NULL, 1),
(195, 'CATETER NASAL DE OXIGENIO Nº 08', 10, 50, 1, 7, 0, '', NULL, 1),
(196, 'CLORANFENICOL 1G', 10, 50, 2, 5, 0, 'QUEMICETINA', NULL, 6),
(197, 'SIMETICONA GOTAS', 10, 50, 2, 5, 0, 'LUFTAL GOTAS', NULL, 10),
(198, 'EQUIPO MICROGOTAS', 10, 50, 1, 7, 0, '', NULL, 1),
(199, 'ESPIRONOLACTONA 25MG', 10, 50, 2, 2, 0, 'ALDACTONE', NULL, 10),
(200, 'FORMOL 10%', 10, 50, 1, 7, 0, '', NULL, 1),
(202, 'HALOTANO 100ML - MARCA CRISTALIA', 10, 50, 2, 5, 0, 'ANESTESICO INALATORIO', NULL, 5),
(204, 'HIDROXIDO DE ALUMINIO', 10, 50, 2, 5, 0, '', NULL, 10),
(205, 'LUVA PROCEDIMENTO P', 10, 50, 1, 7, 300, '', 0.13, 1),
(206, 'LUVA PROCEDIMENTO PP', 10, 50, 1, 7, 0, '', NULL, 1),
(208, 'DIGOXINA 0,25MG', 10, 50, 2, 2, 0, '', NULL, 10),
(209, 'PARACETAMOL GOTAS', 1, 2, 2, 5, 0, 'TYLENOL', NULL, 10),
(210, 'PVPI DEGERMANTE', 10, 50, 1, 5, 0, 'PVPI OU POVIDINE DEGERMANTE', NULL, 1),
(211, 'PREDNISOLONA 3 MG/ML SUSPENSAO', 1, 2, 2, 5, 0, 'PREDSIM - PRELONE - ORALPRED', NULL, 10),
(212, 'PREDNISOLONA  5 MG', 1, 2, 2, 2, 0, 'PREDSIM - PRELONE - ORALPRED', NULL, 10),
(213, 'PREDNISONA 5 MG', 1, 2, 2, 2, 0, 'METICORTEN', NULL, 10),
(214, 'PREDNISONA 20 MG', 1, 2, 2, 2, 0, 'METICORTEN', NULL, 10),
(215, 'FENAZOPIRIDINA 100 MG', 10, 50, 2, 2, 0, 'PYRIDIUM - PYRISEPT', NULL, 10),
(216, 'RANITIDINA 150MG', 10, 50, 2, 2, 0, '', NULL, 10),
(217, 'SERINGA DE VIDRO 10 ML', 10, 50, 1, 7, 0, '', NULL, 1),
(218, 'SERINGA 3 ML SEM AGULHA', 10, 50, 1, 7, 0, '', NULL, 1),
(219, 'SERINGA 5 ML SEM AGULHA', 10, 50, 1, 7, 0, '', NULL, 1),
(220, 'SERINGA 10 ML SEM AGULHA', 10, 50, 1, 7, 0, '', NULL, 1),
(221, 'SERINGA 20 ML SEM AGULHA', 10, 50, 1, 7, 0, '', NULL, 1),
(222, 'SONDA RETAL N. 18', 10, 50, 1, 7, 0, '', NULL, 1),
(223, 'HIPOCLORITO DE SODIO 1%', 10, 50, 1, 5, 0, '', NULL, 2),
(224, 'COMPLEXO B (AMP 2 ML)', 10, 50, 2, 4, 100, 'FRUTOPLEX', 0.49, 10),
(225, 'PROPRANOLOL 40 MG', 10, 50, 2, 2, 0, '', NULL, 10),
(226, 'SULFATO DE MAGNESIO 50 %', 10, 50, 2, 4, 0, '', NULL, 9),
(227, 'DOBUTAMINA 2,5 MG/ ML', 10, 50, 2, 4, 0, 'DOBUTREX', NULL, 10),
(228, 'BENZIDAMINA 500 MG', 0, 0, 2, 1, 0, 'FLOGO-ROSA', NULL, 14),
(229, 'EUCALIPTOL - MENTOL - CANFORA - GUAIACOL', 0, 0, 2, 7, 0, 'TRANSPULMIN', NULL, 14),
(230, 'SACCHAROMYCES CEREVISIAE 50 MILHOES ML', 0, 0, 2, 7, 0, 'FLORAX - FLORATIL - LACTPAN', NULL, 14),
(231, 'SCALP N. 21', 10, 50, 1, 7, 100, '', 0.08, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `requisicao`
--

CREATE TABLE `requisicao` (
  `codigo_requisicao` int(10) NOT NULL,
  `veiculo` varchar(11) NOT NULL,
  `data_emissao` date NOT NULL,
  `usuario_requisitor` varchar(40) NOT NULL,
  `usuario_estoquista` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `requisicao`
--

INSERT INTO `requisicao` (`codigo_requisicao`, `veiculo`, `data_emissao`, `usuario_requisitor`, `usuario_estoquista`) VALUES
(1, '2', '2020-04-22', '1', '3'),
(2, '2', '2020-05-12', '1', '3'),
(3, '2', '2020-05-12', '2', '3'),
(4, '2', '2020-05-12', '2', '3'),
(5, '1', '2020-05-12', '2', '3'),
(6, '2', '2020-05-12', '1', '3'),
(7, '2', '2020-05-12', '3', '3'),
(8, '1', '2020-05-12', '3', '3');

-- --------------------------------------------------------

--
-- Estrutura da tabela `requisicoes`
--

CREATE TABLE `requisicoes` (
  `tipo` varchar(20) NOT NULL,
  `codigo_requisicao` int(10) NOT NULL,
  `id` int(10) NOT NULL,
  `produto` varchar(255) NOT NULL,
  `qtd` int(10) NOT NULL,
  `data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `requisicoes`
--

INSERT INTO `requisicoes` (`tipo`, `codigo_requisicao`, `id`, `produto`, `qtd`, `data`) VALUES
('E', 1, 1, '75', 2, '2020-04-22'),
('D', 1, 2, '75', 2, '2020-04-22'),
('E', 2, 3, '59', 8, '2020-05-12'),
('D', 2, 4, '59', 2, '2020-05-12'),
('D', 2, 5, '59', 1, '2020-05-12'),
('D', 2, 6, '59', 1, '2020-05-12'),
('D', 2, 7, '59', 1, '2020-05-12'),
('D', 2, 8, '59', 1, '2020-05-12'),
('E', 3, 9, '71', 3, '2020-05-12'),
('D', 3, 10, '71', 1, '2020-05-12'),
('E', 3, 11, '34', 5, '2020-05-12'),
('E', 4, 12, '37', 5, '2020-05-12'),
('E', 5, 13, '37', 6, '2020-05-12'),
('E', 6, 14, '71', 8, '2020-05-12'),
('D', 3, 15, '71', 1, '2020-05-12'),
('D', 3, 16, '34', 3, '2020-05-12'),
('E', 7, 17, '2', 6, '2020-05-12'),
('E', 8, 18, '70', 6, '2020-05-12'),
('E', 8, 19, '61', 6, '2020-05-12'),
('D', 8, 20, '70', 3, '2020-05-12'),
('D', 8, 21, '61', 4, '2020-05-12'),
('D', 8, 22, '70', 2, '2020-05-12'),
('D', 8, 23, '61', 1, '2020-05-12'),
('D', 2, 24, '59', 1, '2020-05-12'),
('D', 3, 25, '71', 1, '2020-05-12');

-- --------------------------------------------------------

--
-- Estrutura da tabela `saida`
--

CREATE TABLE `saida` (
  `idsaida` int(11) NOT NULL,
  `dataRetirada` date DEFAULT NULL,
  `destino_idDestino` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `saida`
--

INSERT INTO `saida` (`idsaida`, `dataRetirada`, `destino_idDestino`) VALUES
(1, '2011-12-06', 1),
(2, '2011-12-07', 1),
(3, '2011-12-07', 3),
(4, '2011-12-07', 1),
(5, '2011-12-08', 3),
(6, '2011-12-09', 2),
(7, '2011-12-08', 4),
(8, '2011-12-10', 3),
(9, '2020-04-08', 4),
(10, '2012-05-01', 2),
(11, '2001-02-12', 5),
(12, '2020-05-12', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `saidadestino`
--

CREATE TABLE `saidadestino` (
  `codMovimento` int(11) NOT NULL,
  `dataMovimento` date DEFAULT NULL,
  `motivoMovimento` varchar(12) DEFAULT NULL,
  `destino_idDestino` int(11) DEFAULT NULL,
  `idUsuario_requisitor` int(11) NOT NULL,
  `codigo_veiculo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `saidadestino`
--

INSERT INTO `saidadestino` (`codMovimento`, `dataMovimento`, `motivoMovimento`, `destino_idDestino`, `idUsuario_requisitor`, `codigo_veiculo`) VALUES
(1, '2011-09-09', 'consumo', 1, 0, 0),
(2, '2020-05-02', 'consumo', 4, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `saidadestinoitem`
--

CREATE TABLE `saidadestinoitem` (
  `codProduto` int(11) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `saida_saidadestino` int(11) DEFAULT NULL,
  `cod_saidaarmazem` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `saidadestinoitem`
--

INSERT INTO `saidadestinoitem` (`codProduto`, `quantidade`, `saida_saidadestino`, `cod_saidaarmazem`) VALUES
(157, 1, 1, 1),
(74, 12, 2, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `saidaitem`
--

CREATE TABLE `saidaitem` (
  `quantidade` int(11) DEFAULT NULL,
  `produto_idproduto` int(11) NOT NULL,
  `saida_idsaida` int(11) NOT NULL,
  `idsaidaItem` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `saidaitem`
--

INSERT INTO `saidaitem` (`quantidade`, `produto_idproduto`, `saida_idsaida`, `idsaidaItem`) VALUES
(18, 118, 1, 1),
(9, 119, 1, 2),
(2, 120, 1, 3),
(3, 121, 1, 4),
(1, 122, 1, 5),
(20, 19, 2, 6),
(20, 70, 2, 7),
(1, 157, 2, 8),
(21, 69, 2, 9),
(19, 71, 2, 10),
(1, 182, 2, 11),
(4, 98, 2, 12),
(19, 174, 2, 13),
(22, 171, 2, 14),
(5, 61, 2, 15),
(3, 175, 2, 16),
(4, 176, 2, 17),
(2, 177, 2, 18),
(12, 68, 2, 19),
(2, 173, 2, 20),
(5, 172, 2, 21),
(1, 183, 2, 22),
(2, 14, 2, 23),
(40, 108, 2, 24),
(11, 50, 2, 25),
(1, 34, 2, 26),
(12, 53, 2, 27),
(9, 62, 2, 28),
(1, 184, 2, 29),
(5, 42, 2, 30),
(4, 107, 2, 31),
(10, 106, 2, 32),
(3, 100, 2, 33),
(4, 105, 2, 34),
(5, 104, 2, 35),
(1, 5, 2, 36),
(12, 43, 2, 37),
(2, 60, 2, 38),
(11, 49, 2, 39),
(5, 134, 2, 40),
(4, 142, 2, 41),
(15, 51, 2, 42),
(7, 136, 2, 43),
(2, 90, 2, 44),
(9, 44, 2, 45),
(5, 159, 2, 46),
(2, 170, 2, 47),
(17, 39, 2, 48),
(28, 63, 2, 49),
(2, 59, 2, 50),
(1, 154, 2, 51),
(1, 163, 2, 52),
(1, 180, 2, 53),
(5, 13, 2, 54),
(1, 79, 2, 55),
(3, 57, 2, 56),
(1, 167, 2, 57),
(1, 56, 2, 58),
(13, 54, 2, 59),
(15, 18, 2, 60),
(1, 149, 2, 61),
(13, 72, 2, 62),
(2, 25, 2, 63),
(4, 26, 2, 64),
(19, 169, 2, 65),
(2, 168, 2, 66),
(1, 165, 2, 67),
(16, 148, 2, 68),
(30, 40, 2, 69),
(1, 181, 2, 70),
(13, 95, 2, 71),
(12, 96, 2, 72),
(13, 117, 2, 73),
(2, 58, 2, 74),
(6, 127, 2, 75),
(5, 126, 2, 76),
(6, 156, 2, 77),
(5, 155, 2, 78),
(12, 125, 2, 79),
(17, 124, 2, 80),
(11, 144, 2, 81),
(6, 123, 2, 82),
(1, 111, 2, 83),
(2, 151, 2, 84),
(3, 153, 2, 85),
(1, 152, 2, 86),
(15, 91, 2, 87),
(1, 93, 2, 88),
(3, 94, 2, 89),
(4, 20, 2, 90),
(12, 48, 2, 91),
(2, 162, 2, 92),
(20, 5, 3, 93),
(20, 125, 3, 94),
(20, 123, 3, 95),
(10, 124, 3, 96),
(40, 19, 3, 97),
(20, 69, 3, 98),
(10, 53, 4, 99),
(10, 123, 4, 100),
(10, 109, 4, 101),
(20, 72, 4, 102),
(2, 26, 4, 103),
(20, 122, 5, 104),
(24, 120, 5, 105),
(24, 121, 5, 106),
(12, 63, 5, 107),
(10, 52, 5, 108),
(20, 6, 5, 109),
(10, 123, 6, 110),
(6, 74, 6, 111),
(5, 76, 6, 112),
(1, 80, 7, 113),
(24, 63, 8, 114),
(80, 19, 8, 115),
(10, 5, 8, 116),
(35, 125, 8, 117),
(22, 69, 8, 118),
(15, 126, 8, 119),
(10, 128, 8, 120),
(20, 6, 8, 121),
(12, 54, 8, 122),
(100, 81, 8, 123),
(24, 120, 8, 124),
(20, 74, 9, 125),
(1, 75, 10, 126),
(2, 80, 11, 127),
(2, 75, 12, 128);

-- --------------------------------------------------------

--
-- Estrutura da tabela `subgrupo`
--

CREATE TABLE `subgrupo` (
  `idSubGrupo` int(11) NOT NULL,
  `subDescricao` varchar(50) DEFAULT NULL,
  `idgrupo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `subgrupo`
--

INSERT INTO `subgrupo` (`idSubGrupo`, `subDescricao`, `idgrupo`) VALUES
(1, 'HOSPITALAR', 1),
(2, 'LIMPEZA/LAVANDERIA', 1),
(3, 'COZINHA', 1),
(4, 'TECIDOS', 1),
(5, 'PSICOTROPICO', 2),
(6, 'ANTIBIOTICO', 2),
(7, 'ANESTESICO', 2),
(8, 'CAIXA DE EMERGENCIA', 2),
(9, 'REPOSICAO PARENTERAL', 2),
(10, 'GERAL', 2),
(11, 'ESCRITORIO', 1),
(13, 'PATRIMONIO', 1),
(14, 'AMOSTRA GRATIS', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbarmazem`
--

CREATE TABLE `tbarmazem` (
  `codDestino` int(11) DEFAULT NULL,
  `codProduto` int(11) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `idarmazem` int(11) NOT NULL,
  `vencimento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbarmazem`
--

INSERT INTO `tbarmazem` (`codDestino`, `codProduto`, `quantidade`, `idarmazem`, `vencimento`) VALUES
(1, 118, 18, 1, '2011-12-07'),
(1, 119, 9, 2, '2011-12-07'),
(1, 120, 2, 3, '2011-12-07'),
(1, 121, 3, 4, '2011-12-07'),
(1, 122, 1, 5, '2011-12-07'),
(1, 19, 20, 6, '2011-12-07'),
(1, 70, 20, 7, '2011-12-07'),
(1, 157, 0, 8, '2011-12-07'),
(1, 69, 21, 9, '2011-12-07'),
(1, 71, 19, 10, '2011-12-07'),
(1, 182, 1, 11, '2011-12-07'),
(1, 98, 4, 12, '2011-12-07'),
(1, 174, 19, 13, '2011-12-07'),
(1, 171, 22, 14, '2011-12-07'),
(1, 61, 5, 15, '2011-12-07'),
(1, 175, 3, 16, '2011-12-07'),
(1, 176, 4, 17, '2011-12-07'),
(1, 177, 2, 18, '2011-12-07'),
(1, 68, 12, 19, '2011-12-07'),
(1, 173, 2, 20, '2011-12-07'),
(1, 172, 5, 21, '2011-12-07'),
(1, 183, 1, 22, '2011-12-07'),
(1, 14, 2, 23, '2011-12-07'),
(1, 108, 40, 24, '2011-12-07'),
(1, 50, 11, 25, '2011-12-07'),
(1, 34, 1, 26, '2011-12-07'),
(1, 53, 12, 27, '2011-12-07'),
(1, 62, 9, 28, '2011-12-07'),
(1, 184, 1, 29, '2011-12-07'),
(1, 42, 5, 30, '2011-12-07'),
(1, 107, 4, 31, '2011-12-07'),
(1, 106, 10, 32, '2011-12-07'),
(1, 100, 3, 33, '2011-12-07'),
(1, 105, 4, 34, '2011-12-07'),
(1, 104, 5, 35, '2011-12-07'),
(1, 5, 1, 36, '2011-12-07'),
(1, 43, 12, 37, '2011-12-07'),
(1, 60, 2, 38, '2011-12-07'),
(1, 49, 11, 39, '2011-12-07'),
(1, 134, 5, 40, '2011-12-07'),
(1, 142, 4, 41, '2011-12-07'),
(1, 51, 15, 42, '2011-12-07'),
(1, 136, 7, 43, '2011-12-07'),
(1, 90, 2, 44, '2011-12-07'),
(1, 44, 9, 45, '2011-12-07'),
(1, 159, 5, 46, '2011-12-07'),
(1, 170, 2, 47, '2011-12-07'),
(1, 39, 17, 48, '2013-04-01'),
(1, 63, 28, 49, '2011-12-07'),
(1, 59, 2, 50, '2011-12-07'),
(1, 154, 1, 51, '2011-12-07'),
(1, 163, 1, 52, '2011-12-07'),
(1, 180, 1, 53, '2011-12-07'),
(1, 13, 5, 54, '2011-12-07'),
(1, 79, 1, 55, '2011-12-07'),
(1, 57, 3, 56, '2011-12-07'),
(1, 167, 1, 57, '2011-12-07'),
(1, 56, 1, 58, '2011-12-07'),
(1, 54, 13, 59, '2011-12-07'),
(1, 18, 4, 60, '2011-12-07'),
(1, 18, 11, 61, '2011-12-07'),
(1, 149, 1, 62, '2011-12-07'),
(1, 72, 13, 63, '2011-12-07'),
(1, 25, 2, 64, '2011-12-07'),
(1, 26, 4, 65, '2011-12-07'),
(1, 169, 19, 66, '2011-12-07'),
(1, 168, 2, 67, '2011-12-07'),
(1, 165, 1, 68, '2011-12-07'),
(1, 148, 16, 69, '2011-12-07'),
(1, 40, 30, 70, '2011-12-07'),
(1, 181, 1, 71, '2011-12-07'),
(1, 95, 13, 72, '2011-12-07'),
(1, 96, 12, 73, '2011-12-07'),
(1, 117, 13, 74, '2011-12-07'),
(1, 58, 2, 75, '2011-12-07'),
(1, 127, 6, 76, '2011-12-07'),
(1, 126, 5, 77, '2011-12-07'),
(1, 156, 6, 78, '2011-12-07'),
(1, 155, 5, 79, '2011-12-07'),
(1, 125, 12, 80, '2011-12-07'),
(1, 124, 12, 81, '2011-12-07'),
(1, 124, 5, 82, '2011-12-07'),
(1, 144, 11, 83, '2011-12-07'),
(1, 123, 6, 84, '2011-12-07'),
(1, 111, 1, 85, '2011-12-07'),
(1, 151, 2, 86, '2011-12-07'),
(1, 153, 3, 87, '2011-12-07'),
(1, 152, 1, 88, '2011-12-07'),
(1, 91, 15, 89, '2011-12-07'),
(1, 93, 1, 90, '2011-12-07'),
(1, 94, 3, 91, '2011-12-07'),
(1, 20, 4, 92, '2011-12-07'),
(1, 48, 12, 93, '2011-12-07'),
(1, 162, 2, 94, '2011-12-07'),
(3, 5, 20, 95, '2013-01-01'),
(3, 125, 20, 96, '2015-11-01'),
(3, 123, 20, 97, '2016-05-01'),
(3, 124, 10, 98, '2016-08-01'),
(3, 19, 40, 99, '2013-08-01'),
(3, 69, 20, 100, '2016-05-01'),
(1, 53, 10, 101, '2012-05-01'),
(1, 123, 10, 102, '2016-05-01'),
(1, 109, 10, 103, '2014-05-01'),
(1, 72, 20, 104, '2016-03-01'),
(1, 26, 2, 105, '2012-09-01'),
(3, 122, 20, 106, '2013-08-01'),
(3, 120, 24, 107, '2013-08-01'),
(3, 121, 24, 108, '2013-08-01'),
(3, 63, 12, 109, '2013-09-01'),
(3, 52, 10, 110, '2011-12-07'),
(3, 6, 20, 111, '2013-09-01'),
(2, 123, 10, 112, '2016-05-01'),
(2, 74, 6, 113, '2014-01-01'),
(2, 76, 5, 114, '2012-12-01'),
(4, 80, 1, 115, '2014-06-01'),
(3, 63, 24, 116, '2013-09-01'),
(3, 19, 80, 117, '2013-08-01'),
(3, 5, 10, 118, '2013-01-01'),
(3, 125, 35, 119, '2015-11-01'),
(3, 69, 22, 120, '2016-05-01'),
(3, 126, 15, 121, '2015-07-01'),
(3, 128, 10, 122, '2014-05-01'),
(3, 6, 20, 123, '2013-09-01'),
(3, 54, 12, 124, '2013-06-01'),
(3, 81, 100, 125, '2013-12-01'),
(3, 120, 24, 126, '2013-08-01'),
(4, 74, 5, 127, '2014-01-01'),
(4, 74, 3, 128, '2014-02-01'),
(2, 75, 1, 129, '2013-10-01'),
(5, 80, 2, 130, '2014-06-01'),
(3, 75, 2, 131, '2013-10-01');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbvencimento`
--

CREATE TABLE `tbvencimento` (
  `codProduto` int(11) NOT NULL,
  `data` date NOT NULL,
  `lote` varchar(20) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `idVencimento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbvencimento`
--

INSERT INTO `tbvencimento` (`codProduto`, `data`, `lote`, `quantidade`, `idVencimento`) VALUES
(1, '2012-09-01', '1019405', 18, 1),
(2, '2012-10-01', '100950', 820, 2),
(3, '2012-08-01', '1375388', 400, 3),
(4, '2012-08-01', 'BZLIDO052', 50, 4),
(4, '2012-05-01', 'BZLIDO022', 8, 5),
(5, '2013-01-01', '103685C', 20, 6),
(7, '2013-08-01', '2544092', 85, 7),
(9, '2012-10-01', 'FR1007503AP1002153', 13, 12),
(9, '2013-06-01', '20090413', 6, 13),
(10, '2013-09-01', '0190238', 6, 14),
(14, '2012-09-01', '2505115', 67, 15),
(15, '2012-05-01', '0910158', 20, 16),
(16, '2012-03-01', '052-03', 63, 17),
(16, '2012-11-01', '105.14.94', 200, 18),
(16, '2012-12-01', '1130270', 200, 19),
(17, '2013-02-01', '1130253', 150, 20),
(18, '2012-06-01', 'LKL', 200, 21),
(19, '2013-08-01', '1131365', 0, 22),
(20, '2012-07-01', '2160103', 72, 23),
(21, '2014-06-01', '1106405', 5, 24),
(22, '2013-06-01', 'BKX', 220, 25),
(23, '2012-12-01', 'AI009-10', 164, 26),
(24, '2013-05-01', '1112035', 23, 27),
(25, '2012-07-01', '10075271', 4, 28),
(26, '2012-09-01', 'LL161-10', 23, 29),
(26, '2012-12-01', '3578055', 18, 30),
(27, '2014-05-01', '11053582', 10, 31),
(28, '2012-10-01', '11042476', 10, 32),
(29, '2012-12-01', '10128969', 120, 33),
(30, '2012-03-01', '10096477', 100, 34),
(31, '2012-09-16', 'F27155', 1, 35),
(32, '2013-04-01', '11D11I', 1, 36),
(33, '2012-06-01', '2433059', 8, 37),
(34, '2013-02-01', 'ED11B001-2', 5, 38),
(34, '2012-12-01', '10L515', 8, 39),
(35, '2013-08-01', 'D511H056-2', 7, 40),
(35, '2012-11-01', '101749', 2, 41),
(36, '2013-07-01', 'L47625', 40, 42),
(37, '2012-10-01', '10100888', 20, 43),
(37, '2012-06-01', '10060539', 30, 44),
(38, '2013-03-01', '031315', 70, 45),
(39, '2013-04-01', '10040266', 63, 46),
(40, '2012-12-01', '2653', 10, 47),
(41, '2013-03-01', '11040341', 15, 48),
(42, '2012-03-01', '101494', 510, 49),
(43, '2012-06-01', 'AD012/10', 90, 50),
(44, '2013-04-01', '1107470', 40, 51),
(44, '2013-06-01', '1110470', 50, 52),
(45, '2012-11-01', '1008839', 60, 53),
(46, '2012-08-01', '101176', 120, 54),
(47, '2012-02-01', '10C690', 50, 55),
(47, '2012-03-01', '10C24B', 320, 56),
(48, '2012-04-01', '20179102F', 94, 57),
(49, '2012-09-01', '2661097', 18, 58),
(50, '2013-02-01', '1860312', 290, 59),
(51, '2012-03-01', '2660154', 72, 60),
(52, '2013-01-01', '0719636', 125, 61),
(53, '2012-05-01', '10050379B', 8, 62),
(54, '2013-06-01', '2662199', 90, 63),
(55, '2013-06-01', '0540309', 25, 64),
(56, '2013-06-01', '1170285', 15, 65),
(57, '2013-03-01', '1104233', 35, 66),
(57, '2013-07-01', '1113346', 100, 67),
(58, '2012-07-01', '177705', 20, 68),
(58, '2012-10-01', '1008053', 100, 69),
(59, '2012-06-01', '10060684B', 66, 70),
(60, '2012-07-01', '10070801B', 85, 71),
(61, '2013-07-01', '0480567', 73, 72),
(62, '2013-07-01', '0297339', 30, 73),
(62, '2013-07-01', '0297346', 200, 74),
(63, '2013-09-01', '2658811', 36, 75),
(64, '2016-09-01', '501139TC', 50, 76),
(65, '2013-03-01', 'CP10085', 50, 77),
(66, '2016-02-01', '301108', 500, 78),
(64, '2014-09-01', '062', 50, 79),
(67, '2016-07-20', '1810', 2, 80),
(68, '2014-12-01', '36', 96, 81),
(69, '2016-05-01', 'BE30/11E02', 0, 82),
(70, '2015-06-01', 'BE30/10F02', 73, 83),
(71, '2015-04-01', 'BE30/10D01', 74, 84),
(72, '2016-03-01', 'CS11C02', 40, 85),
(73, '2015-03-01', 'CS10C02', 400, 86),
(74, '2014-02-01', '990211', 0, 87),
(75, '2013-10-01', '880942', 10, 88),
(76, '2012-12-01', '09A002', 2, 89),
(74, '2014-01-01', 'WF2011032', 0, 90),
(77, '2015-09-01', '201034', 136, 91),
(78, '2013-01-01', '2011', 5, 92),
(79, '2013-01-01', '2011', 5, 93),
(79, '2013-01-01', '2012', 3, 94),
(80, '2014-09-01', '0169', 12, 95),
(80, '2014-06-01', '0093', 0, 96),
(81, '2013-12-01', 'PR445', 0, 97),
(82, '2014-01-01', '2012', 45, 98),
(83, '2012-09-01', '4919/10', 26, 99),
(84, '2013-01-01', '2011', 19, 100),
(85, '2013-06-01', 'BE20A-08F021', 1, 101),
(86, '2013-03-01', 'BE20A08C01', 1, 102),
(87, '2013-12-01', 'BE20A', 7, 103),
(88, '2012-10-01', 'GA1500', 12, 104),
(89, '2015-10-01', '02999458', 5, 105),
(90, '2015-12-01', '1110A', 7, 106),
(92, '2014-08-01', '7649', 60, 107),
(91, '2014-08-01', '2004P03004', 68, 108),
(91, '2013-08-01', '2004P02234', 5, 109),
(94, '2012-10-01', '4734', 4, 110),
(93, '2013-01-01', '2011', 9, 111),
(95, '2014-12-01', '74', 14, 112),
(95, '2015-11-01', '73', 24, 113),
(95, '2016-02-01', '15', 24, 114),
(96, '2016-08-01', '82', 19, 115),
(97, '2015-01-01', '02', 48, 116),
(97, '2016-02-01', '17', 24, 117),
(97, '2015-03-01', '20', 48, 118),
(98, '2016-04-01', '111287', 48, 119),
(99, '2016-01-01', '110151', 24, 120),
(99, '2013-09-01', '83546', 12, 121),
(100, '2014-08-01', '83', 24, 122),
(101, '2014-07-01', '74', 74, 123),
(103, '2012-04-01', '22', 48, 124),
(103, '2012-06-01', '31', 48, 125),
(104, '2013-09-01', '54', 24, 126),
(105, '2013-08-01', '48', 43, 127),
(105, '2013-09-01', '54', 24, 128),
(106, '2013-04-01', '23', 67, 129),
(106, '2013-07-01', '44', 24, 130),
(107, '2013-02-01', '05', 24, 131),
(107, '2013-12-01', '80', 24, 132),
(108, '2012-01-01', '03611', 1000, 133),
(110, '2014-01-01', '0493', 87, 134),
(109, '2014-05-01', '1183', 75, 135),
(111, '2014-06-04', '906010861', 4, 136),
(112, '2016-02-01', 'BE14A/11B02', 4, 137),
(113, '2015-12-01', 'BE14A/10L01', 4, 138),
(114, '2012-04-01', 'BE14A/06D01', 5, 139),
(115, '2015-11-01', 'BE14A/10K02', 1, 140),
(111, '2016-07-01', 'BE14A/11G03', 10, 141),
(116, '2016-07-01', '2003L01R', 1, 142),
(117, '2014-03-01', '13', 8, 143),
(117, '2014-10-01', '56', 48, 144),
(118, '2014-07-01', '39', 27, 145),
(118, '2015-08-01', '49', 13, 146),
(119, '2015-03-01', '18', 24, 147),
(119, '2016-08-01', '82', 24, 148),
(119, '2015-10-01', '59', 24, 149),
(120, '2013-08-01', '1113239', 72, 150),
(121, '2013-08-01', '1113499', 0, 151),
(122, '2013-08-01', '1113179', 76, 152),
(123, '2016-05-01', '1118012', 630, 153),
(124, '2016-08-01', '1217577', 380, 154),
(125, '2015-11-01', '201049', 60, 155),
(125, '2015-11-01', '2113', 85, 156),
(126, '2015-07-01', '100708', 100, 157),
(127, '2013-05-01', '100518', 100, 158),
(128, '2014-05-01', '080905', 180, 159),
(129, '2013-03-01', '1003292', 2, 160),
(130, '2013-01-01', '0161', 1, 161),
(131, '2012-01-01', '10010855', 1, 162),
(132, '2012-06-01', '109965', 380, 163),
(133, '2012-12-01', '103819', 690, 164),
(134, '2012-11-01', '0908242', 38, 165),
(13, '2013-08-01', '09085896', 20, 166),
(135, '2012-01-01', '09010337', 160, 167),
(136, '2013-02-01', '2657104', 24, 168),
(137, '2013-02-01', '666', 3, 169),
(138, '2012-09-01', '318593', 4, 170),
(139, '2012-06-01', '0495022', 45, 171),
(140, '2013-01-01', '11010157', 7, 172),
(141, '2012-10-01', '1007742', 5, 173),
(142, '2012-10-01', 'AQ321', 100, 174),
(6, '2013-09-01', '10096467', 70, 175),
(8, '2012-01-01', '1000079', 38, 176),
(143, '2012-08-01', '1006137', 100, 177),
(108, '2011-12-07', '1', 0, 178),
(125, '2011-12-07', '1', 0, 179),
(124, '2011-12-07', '1', 0, 180),
(123, '2011-12-07', '1', 0, 181),
(144, '2011-12-07', '1', 0, 182),
(145, '2020-01-01', '1', 2, 183),
(124, '2011-12-07', '11', 0, 184),
(146, '2020-12-07', '1', 1, 185),
(53, '2011-12-07', '1', 0, 186),
(5, '2011-12-07', '1', 0, 187),
(60, '2011-12-07', '1', 0, 188),
(59, '2011-12-07', '1', 0, 189),
(19, '2011-12-07', '1', 0, 190),
(18, '2011-12-07', '1', 0, 191),
(48, '2011-12-07', '1', 0, 192),
(43, '2011-12-07', '1', 0, 193),
(57, '2011-12-07', '1', 0, 194),
(58, '2011-12-07', '1', 0, 195),
(14, '2011-12-07', '1', 0, 196),
(20, '2011-12-07', '1', 0, 197),
(18, '2011-12-07', '11', 0, 198),
(44, '2011-12-07', '1', 0, 199),
(61, '2011-12-07', '1', 0, 200),
(54, '2011-12-07', '1', 0, 201),
(51, '2011-12-07', '1', 0, 202),
(147, '2013-03-01', '1103751', 5, 203),
(56, '2011-12-07', '1', 0, 204),
(62, '2011-12-07', '1', 0, 205),
(63, '2011-12-07', '1', 0, 206),
(52, '2011-12-07', '1', 7, 207),
(50, '2011-12-07', '1', 0, 208),
(49, '2011-12-07', '1', 0, 209),
(148, '2011-12-07', '1', 0, 210),
(149, '2011-12-07', '1', 0, 211),
(150, '2020-12-07', '1', 1, 212),
(151, '2011-12-07', '1', 0, 213),
(152, '2011-12-07', '1', 0, 214),
(153, '2011-12-07', '1', 0, 215),
(91, '2011-12-07', '1', 0, 216),
(93, '2011-12-07', '1', 0, 217),
(94, '2011-12-07', '1', 0, 218),
(26, '2011-12-07', '1', 0, 219),
(111, '2011-12-07', '1', 0, 220),
(90, '2011-12-07', '1', 0, 221),
(154, '2011-12-07', '1', 0, 222),
(121, '2011-12-07', '1', 0, 223),
(120, '2011-12-07', '1', 0, 224),
(122, '2011-12-07', '1', 0, 225),
(98, '2011-12-07', '1', 0, 226),
(104, '2011-12-07', '1', 0, 227),
(106, '2011-12-07', '1', 0, 228),
(107, '2011-12-07', '1', 0, 229),
(105, '2011-12-07', '1', 0, 230),
(100, '2011-12-07', '1', 0, 231),
(119, '2011-12-07', '1', 0, 232),
(95, '2011-12-07', '1', 0, 233),
(96, '2011-12-07', '1', 0, 234),
(118, '2011-12-07', '1', 0, 235),
(117, '2011-12-07', '1', 0, 236),
(155, '2011-12-07', '1', 0, 237),
(156, '2011-12-07', '1', 0, 238),
(126, '2011-12-07', '1', 0, 239),
(127, '2011-12-07', '1', 0, 240),
(72, '2011-12-07', '1', 0, 241),
(70, '2011-12-07', '1', 0, 242),
(71, '2011-12-07', '1', 0, 243),
(69, '2011-12-07', '1', 0, 244),
(157, '2011-12-07', '1', 0, 245),
(79, '2011-12-07', '1', 0, 246),
(163, '2011-12-07', '1', 0, 247),
(40, '2011-12-07', '1', 0, 248),
(25, '2011-12-07', '1', 0, 249),
(162, '2011-12-07', '1', 0, 250),
(42, '2011-12-07', '1', 0, 251),
(164, '2020-12-07', '1', 3, 252),
(165, '2011-12-07', '1', 1, 253),
(166, '2020-07-07', '1', 1, 254),
(167, '2011-12-07', '1', 0, 255),
(34, '2011-12-07', '1', 0, 256),
(168, '2011-12-07', '1', 0, 257),
(159, '2011-12-07', '1', 0, 258),
(169, '2011-12-07', '1', 0, 259),
(142, '2011-12-07', '1', 0, 260),
(170, '2011-12-07', '1', 0, 261),
(136, '2011-12-07', '1', 0, 262),
(13, '2011-12-07', '1', 0, 263),
(134, '2011-12-07', '1', 0, 264),
(171, '2011-12-07', '1', 0, 265),
(172, '2011-12-07', '1', 0, 266),
(173, '2011-12-07', '1', 0, 267),
(174, '2011-12-07', '1', 0, 268),
(175, '2011-12-07', '1', 0, 269),
(176, '2011-12-07', '1', 0, 270),
(177, '2011-12-07', '1', 0, 271),
(68, '2011-12-07', '1', 0, 272),
(178, '2020-12-07', '1', 1, 273),
(179, '2020-12-07', '1', 1, 274),
(180, '2011-12-07', '1', 0, 275),
(181, '2011-12-07', '1', 0, 276),
(182, '2011-12-07', '1', 0, 277),
(183, '2011-12-07', '1', 0, 278),
(184, '2011-12-07', '1', 0, 279),
(185, '2020-12-07', '1', 1, 280),
(186, '2020-12-07', '1', 1, 281),
(187, '2016-09-30', '848', 1000, 282),
(224, '2013-08-30', '10080690', 100, 283),
(147, '2013-08-30', '1115134', 24, 284),
(154, '2013-10-30', '0589-451/11', 100, 285),
(180, '2013-11-30', '70212551', 5, 286),
(169, '2014-11-30', '1404', 30, 287),
(168, '2013-04-30', '8173', 300, 288),
(81, '2014-07-30', 'PR19075', 300, 289),
(205, '2014-01-30', '9241', 300, 290),
(231, '2016-11-30', '110708', 100, 291),
(156, '2016-06-30', '110616', 100, 292),
(120, '2013-11-30', '1114889', 192, 293);

-- --------------------------------------------------------

--
-- Estrutura da tabela `unidademedida`
--

CREATE TABLE `unidademedida` (
  `idunidadeMedida` int(11) NOT NULL,
  `siglaUnidade` varchar(10) DEFAULT NULL,
  `descUnidade` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `unidademedida`
--

INSERT INTO `unidademedida` (`idunidadeMedida`, `siglaUnidade`, `descUnidade`) VALUES
(1, 'ENV', 'ENVELOPE'),
(2, 'CPR', 'COMPRIMIDO'),
(3, 'DR', 'DRAGEA'),
(4, 'AMP', 'AMPOLA'),
(5, 'FR', 'FRASCO'),
(6, 'CAP', 'CAPSULA'),
(7, 'UN', 'UNIDADE');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `nomeUsuario` varchar(50) DEFAULT NULL,
  `login` varchar(20) DEFAULT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `tipoUsuário` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`idusuario`, `nomeUsuario`, `login`, `senha`, `tipoUsuário`) VALUES
(3, 'ADMINISTRADOR', 'ADMIN', 'ADMIN', 'administrador'),
(4, 'FERNANDA', 'FERNANDA', 'FERNADNA', 'administrador'),
(5, 'ENFERMAGEM', 'POSTO', 'POSTO', 'usuario');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario_requisitor`
--

CREATE TABLE `usuario_requisitor` (
  `codigo_requisitor` int(10) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `cpf` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `usuario_requisitor`
--

INSERT INTO `usuario_requisitor` (`codigo_requisitor`, `nome`, `cpf`) VALUES
(1, 'Ricardo', '708.852.431.70'),
(2, 'Tulio', '708.852.431.70'),
(3, 'andre', '708.852.431.70');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `codigo` int(11) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `chassi` varchar(45) NOT NULL,
  `placa` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `veiculo`
--

INSERT INTO `veiculo` (`codigo`, `descricao`, `chassi`, `placa`) VALUES
(1, 'Buggy 1.6/ TST/ RS 1.6 4-Lug.', '54824067494', 'MOJ-7137'),
(2, 'Corona Mec.', '25293690605', 'HWC-2477');

-- --------------------------------------------------------

--
-- Stand-in structure for view `warmazem`
-- (See below for the actual view)
--
CREATE TABLE `warmazem` (
`idunidadeMedida` int(11)
,`siglaUnidade` varchar(10)
,`idproduto` int(11)
,`vencimento` date
,`descProduto` varchar(80)
,`unidadeMedida_idunidadeMedida` int(10)
,`concentracao` varchar(80)
,`codDestino` int(11)
,`codProduto` int(11)
,`quantidade` int(11)
,`idarmazem` int(11)
,`idDestino` int(10)
,`descDestino` varchar(50)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `wsaidadestino`
-- (See below for the actual view)
--
CREATE TABLE `wsaidadestino` (
`codmovimento` int(11)
,`dataMovimento` date
,`motivoMovimento` varchar(12)
,`destino_idDestino` int(11)
,`codProduto` int(11)
,`quantidade` int(11)
,`descProduto` varchar(80)
,`concentracao` varchar(80)
,`descDestino` varchar(50)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `wvencimento`
-- (See below for the actual view)
--
CREATE TABLE `wvencimento` (
`descProduto` varchar(80)
,`concentracao` varchar(80)
,`data` date
,`lote` varchar(20)
,`quantidade` int(11)
,`codProduto` int(11)
);

-- --------------------------------------------------------

--
-- Structure for view `warmazem`
--
DROP TABLE IF EXISTS `warmazem`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `warmazem`  AS  select `u`.`idunidadeMedida` AS `idunidadeMedida`,`u`.`siglaUnidade` AS `siglaUnidade`,`p`.`idproduto` AS `idproduto`,`tb`.`vencimento` AS `vencimento`,`p`.`descProduto` AS `descProduto`,`p`.`unidadeMedida_idunidadeMedida` AS `unidadeMedida_idunidadeMedida`,`p`.`concentracao` AS `concentracao`,`tb`.`codDestino` AS `codDestino`,`tb`.`codProduto` AS `codProduto`,`tb`.`quantidade` AS `quantidade`,`tb`.`idarmazem` AS `idarmazem`,`d`.`idDestino` AS `idDestino`,`d`.`descDestino` AS `descDestino` from (((`unidademedida` `u` join `produto` `p` on((`u`.`idunidadeMedida` = `p`.`unidadeMedida_idunidadeMedida`))) join `tbarmazem` `tb` on((`p`.`idproduto` = `tb`.`codProduto`))) join `destino` `d` on((`tb`.`codDestino` = `d`.`idDestino`))) ;

-- --------------------------------------------------------

--
-- Structure for view `wsaidadestino`
--
DROP TABLE IF EXISTS `wsaidadestino`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `wsaidadestino`  AS  select `s`.`codMovimento` AS `codmovimento`,`s`.`dataMovimento` AS `dataMovimento`,`s`.`motivoMovimento` AS `motivoMovimento`,`s`.`destino_idDestino` AS `destino_idDestino`,`i`.`codProduto` AS `codProduto`,`i`.`quantidade` AS `quantidade`,`p`.`descProduto` AS `descProduto`,`p`.`concentracao` AS `concentracao`,`d`.`descDestino` AS `descDestino` from (((`saidadestino` `s` join `saidadestinoitem` `i` on((`s`.`codMovimento` = `i`.`saida_saidadestino`))) join `produto` `p` on((`p`.`idproduto` = `i`.`codProduto`))) join `destino` `d` on((`d`.`idDestino` = `s`.`destino_idDestino`))) ;

-- --------------------------------------------------------

--
-- Structure for view `wvencimento`
--
DROP TABLE IF EXISTS `wvencimento`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `wvencimento`  AS  select `p`.`descProduto` AS `descProduto`,`p`.`concentracao` AS `concentracao`,`tb`.`data` AS `data`,`tb`.`lote` AS `lote`,`tb`.`quantidade` AS `quantidade`,`tb`.`codProduto` AS `codProduto` from (`produto` `p` join `tbvencimento` `tb` on((`p`.`idproduto` = `tb`.`codProduto`))) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ajusteestoque`
--
ALTER TABLE `ajusteestoque`
  ADD PRIMARY KEY (`idMovimento`),
  ADD KEY `fornecedor_idfornecedor` (`fornecedor_idfornecedor`),
  ADD KEY `produto_idproduto` (`produto_idproduto`);

--
-- Indexes for table `destino`
--
ALTER TABLE `destino`
  ADD PRIMARY KEY (`idDestino`);

--
-- Indexes for table `entrada`
--
ALTER TABLE `entrada`
  ADD PRIMARY KEY (`identrada`),
  ADD KEY `fk_entrada_fornecedor1` (`fornecedor_idfornecedor`);

--
-- Indexes for table `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`idfornecedor`);

--
-- Indexes for table `grupo`
--
ALTER TABLE `grupo`
  ADD PRIMARY KEY (`idgrupo`);

--
-- Indexes for table `itemnota`
--
ALTER TABLE `itemnota`
  ADD PRIMARY KEY (`idItem`),
  ADD KEY `produto_idproduto` (`produto_idproduto`),
  ADD KEY `entrada_identrada` (`entrada_identrada`);

--
-- Indexes for table `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`idproduto`),
  ADD KEY `fk_produto_grupo1` (`grupo_idgrupo`),
  ADD KEY `fk_produto_unidadeMedida1` (`unidadeMedida_idunidadeMedida`),
  ADD KEY `id_SubGrupo` (`id_SubGrupo`);

--
-- Indexes for table `requisicao`
--
ALTER TABLE `requisicao`
  ADD PRIMARY KEY (`codigo_requisicao`);

--
-- Indexes for table `requisicoes`
--
ALTER TABLE `requisicoes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `saida`
--
ALTER TABLE `saida`
  ADD PRIMARY KEY (`idsaida`);

--
-- Indexes for table `saidadestino`
--
ALTER TABLE `saidadestino`
  ADD PRIMARY KEY (`codMovimento`);

--
-- Indexes for table `saidadestinoitem`
--
ALTER TABLE `saidadestinoitem`
  ADD PRIMARY KEY (`cod_saidaarmazem`),
  ADD KEY `saida_saidadestino` (`saida_saidadestino`),
  ADD KEY `codProduto` (`codProduto`);

--
-- Indexes for table `saidaitem`
--
ALTER TABLE `saidaitem`
  ADD PRIMARY KEY (`idsaidaItem`),
  ADD KEY `saida_idsaida` (`saida_idsaida`),
  ADD KEY `produto_idproduto` (`produto_idproduto`);

--
-- Indexes for table `subgrupo`
--
ALTER TABLE `subgrupo`
  ADD PRIMARY KEY (`idSubGrupo`),
  ADD KEY `idgrupo` (`idgrupo`);

--
-- Indexes for table `tbarmazem`
--
ALTER TABLE `tbarmazem`
  ADD PRIMARY KEY (`idarmazem`),
  ADD KEY `codProduto` (`codProduto`),
  ADD KEY `codDestino` (`codDestino`);

--
-- Indexes for table `tbvencimento`
--
ALTER TABLE `tbvencimento`
  ADD PRIMARY KEY (`idVencimento`),
  ADD KEY `codProduto` (`codProduto`);

--
-- Indexes for table `unidademedida`
--
ALTER TABLE `unidademedida`
  ADD PRIMARY KEY (`idunidadeMedida`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- Indexes for table `usuario_requisitor`
--
ALTER TABLE `usuario_requisitor`
  ADD PRIMARY KEY (`codigo_requisitor`);

--
-- Indexes for table `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ajusteestoque`
--
ALTER TABLE `ajusteestoque`
  MODIFY `idMovimento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `destino`
--
ALTER TABLE `destino`
  MODIFY `idDestino` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `entrada`
--
ALTER TABLE `entrada`
  MODIFY `identrada` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `idfornecedor` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `grupo`
--
ALTER TABLE `grupo`
  MODIFY `idgrupo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `itemnota`
--
ALTER TABLE `itemnota`
  MODIFY `idItem` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=294;

--
-- AUTO_INCREMENT for table `produto`
--
ALTER TABLE `produto`
  MODIFY `idproduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=232;

--
-- AUTO_INCREMENT for table `requisicao`
--
ALTER TABLE `requisicao`
  MODIFY `codigo_requisicao` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `requisicoes`
--
ALTER TABLE `requisicoes`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `saida`
--
ALTER TABLE `saida`
  MODIFY `idsaida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `saidadestino`
--
ALTER TABLE `saidadestino`
  MODIFY `codMovimento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `saidadestinoitem`
--
ALTER TABLE `saidadestinoitem`
  MODIFY `cod_saidaarmazem` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `saidaitem`
--
ALTER TABLE `saidaitem`
  MODIFY `idsaidaItem` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=129;

--
-- AUTO_INCREMENT for table `subgrupo`
--
ALTER TABLE `subgrupo`
  MODIFY `idSubGrupo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `tbarmazem`
--
ALTER TABLE `tbarmazem`
  MODIFY `idarmazem` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=132;

--
-- AUTO_INCREMENT for table `tbvencimento`
--
ALTER TABLE `tbvencimento`
  MODIFY `idVencimento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=294;

--
-- AUTO_INCREMENT for table `unidademedida`
--
ALTER TABLE `unidademedida`
  MODIFY `idunidadeMedida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `usuario_requisitor`
--
ALTER TABLE `usuario_requisitor`
  MODIFY `codigo_requisitor` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `veiculo`
--
ALTER TABLE `veiculo`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `entrada`
--
ALTER TABLE `entrada`
  ADD CONSTRAINT `fk_entrada_fornecedor1` FOREIGN KEY (`fornecedor_idfornecedor`) REFERENCES `fornecedor` (`idfornecedor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `itemnota`
--
ALTER TABLE `itemnota`
  ADD CONSTRAINT `itemnota_ibfk_3` FOREIGN KEY (`produto_idproduto`) REFERENCES `produto` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `itemnota_ibfk_4` FOREIGN KEY (`entrada_identrada`) REFERENCES `entrada` (`identrada`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `fk_produto_grupo1` FOREIGN KEY (`grupo_idgrupo`) REFERENCES `grupo` (`idgrupo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_produto_unidadeMedida1` FOREIGN KEY (`unidadeMedida_idunidadeMedida`) REFERENCES `unidademedida` (`idunidadeMedida`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`id_SubGrupo`) REFERENCES `subgrupo` (`idSubGrupo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `saidadestinoitem`
--
ALTER TABLE `saidadestinoitem`
  ADD CONSTRAINT `saidadestinoitem_ibfk_1` FOREIGN KEY (`saida_saidadestino`) REFERENCES `saidadestino` (`codMovimento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `saidadestinoitem_ibfk_2` FOREIGN KEY (`codProduto`) REFERENCES `produto` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `saidaitem`
--
ALTER TABLE `saidaitem`
  ADD CONSTRAINT `saidaitem_ibfk_1` FOREIGN KEY (`saida_idsaida`) REFERENCES `saida` (`idsaida`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `saidaitem_ibfk_2` FOREIGN KEY (`produto_idproduto`) REFERENCES `produto` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `subgrupo`
--
ALTER TABLE `subgrupo`
  ADD CONSTRAINT `subgrupo_ibfk_1` FOREIGN KEY (`idgrupo`) REFERENCES `grupo` (`idgrupo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `tbarmazem`
--
ALTER TABLE `tbarmazem`
  ADD CONSTRAINT `tbarmazem_ibfk_1` FOREIGN KEY (`codDestino`) REFERENCES `destino` (`idDestino`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `tbarmazem_ibfk_2` FOREIGN KEY (`codProduto`) REFERENCES `produto` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `tbvencimento`
--
ALTER TABLE `tbvencimento`
  ADD CONSTRAINT `tbvencimento_ibfk_1` FOREIGN KEY (`codProduto`) REFERENCES `produto` (`idproduto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
