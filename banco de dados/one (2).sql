-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 18-Jan-2023 às 15:16
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `one`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `personagem`
--

CREATE TABLE `personagem` (
  `idPersonagem` int(11) NOT NULL,
  `nome` varchar(40) NOT NULL,
  `categoria` varchar(15) NOT NULL,
  `reconpensa` decimal(20,2) DEFAULT NULL,
  `fruta` varchar(30) DEFAULT NULL,
  `arcoEntrou` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `personagem`
--

INSERT INTO `personagem` (`idPersonagem`, `nome`, `categoria`, `reconpensa`, `fruta`, `arcoEntrou`) VALUES
(1, 'Monkey D. Luffy', 'Pirata', '3000000000.00', 'Gomugomu-no-mi ', 'Romance Dawn'),
(2, 'Roronoa Zoro', 'Pirata', '1111000000.00', '', 'Romance Dawn'),
(3, 'Nami', 'Pirata', '366000000.00', '', 'Orange Town'),
(4, 'Usopp', 'Pirata', '500000000.00', '', 'Vila Syrup'),
(5, 'Sanji', 'Pirata', '1032000000.00', '', 'Baratie'),
(6, 'Fujitora', 'Marinha', '0.00', 'Zushi Zushi no Mi', 'Dressrosa'),
(7, 'Smoker ', 'Marinha', '0.00', 'Moku Moku no Mi', 'Loguetown');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `personagem`
--
ALTER TABLE `personagem`
  ADD PRIMARY KEY (`idPersonagem`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `personagem`
--
ALTER TABLE `personagem`
  MODIFY `idPersonagem` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
