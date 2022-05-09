-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 08-Maio-2022 às 17:39
-- Versão do servidor: 10.4.14-MariaDB
-- versão do PHP: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `clubesamambaia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `agenda`
--

CREATE TABLE `agenda` (
  `codigo` int(11) NOT NULL,
  `codigo_socio` int(11) NOT NULL,
  `codigo_modalidade` int(11) NOT NULL,
  `codigo_instalacao` int(11) NOT NULL,
  `data` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `instalacoes`
--

CREATE TABLE `instalacoes` (
  `codigo` int(10) NOT NULL,
  `nome` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `instalacoes`
--

INSERT INTO `instalacoes` (`codigo`, `nome`) VALUES
(1, 'Tenis'),
(2, 'Piscina'),
(3, 'Pavilhão'),
(4, 'Futebol');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modalidade`
--

CREATE TABLE `modalidade` (
  `codigo` int(10) NOT NULL,
  `nome` varchar(35) NOT NULL,
  `tipo` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `modalidade`
--

INSERT INTO `modalidade` (`codigo`, `nome`, `tipo`) VALUES
(1, 'Natacao', 'aula'),
(2, 'Pavilhao', 'aluguel'),
(3, 'Tenis', 'aula'),
(4, 'Tenis', 'aluguel');

-- --------------------------------------------------------

--
-- Estrutura da tabela `socio`
--

CREATE TABLE `socio` (
  `COD` int(4) NOT NULL,
  `NOME` varchar(50) DEFAULT NULL,
  `RG` varchar(10) DEFAULT NULL,
  `DATAADM` varchar(10) DEFAULT NULL,
  `DATANASC` varchar(10) DEFAULT NULL,
  `TELCEL` varchar(14) DEFAULT NULL,
  `TELRES` varchar(14) DEFAULT NULL,
  `BAIRRO` varchar(50) DEFAULT NULL,
  `CEP` varchar(9) DEFAULT NULL,
  `LOGRADOURO` varchar(150) DEFAULT NULL,
  `LOCALIDADE` varchar(25) DEFAULT NULL,
  `UF` varchar(2) DEFAULT NULL,
  `COMPLEMENTO` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `socio`
--

INSERT INTO `socio` (`COD`, `NOME`, `RG`, `DATAADM`, `DATANASC`, `TELCEL`, `TELRES`, `BAIRRO`, `CEP`, `LOGRADOURO`, `LOCALIDADE`, `UF`, `COMPLEMENTO`) VALUES
(1, 'Hugo', '12345678', '07/05/2022', '07/05/1995', '619865478', '613356489', 'bairro', '70856966', 'Quadra 12 conjunto rua g casa 32', 'bairro', 'DF', NULL),
(2, 'Victor', '3206598', '08/32/2022', '02/01/2020', '(36)26846-4564', '(61)3659-87623', 'bairro', '78965-000', 'cidade ru 54', 'brasilia', 'DF', 'complemento condominio'),
(3, 'pedro', '02316456', '08/38/2022', '03/02/1995', '(65)97453-1567', '(65)9894-62626', 'bairro s1', '78956-000', 'logradouro ', 'cidade b2', 'BA', 'complemento c54');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `cod` int(3) NOT NULL,
  `nome` varchar(20) NOT NULL,
  `login` varchar(10) NOT NULL,
  `senha` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`cod`, `nome`, `login`, `senha`) VALUES
(1, 'Admin', 'admin', 'admin');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `agenda`
--
ALTER TABLE `agenda`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `instalacoes`
--
ALTER TABLE `instalacoes`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `modalidade`
--
ALTER TABLE `modalidade`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `socio`
--
ALTER TABLE `socio`
  ADD PRIMARY KEY (`COD`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`cod`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `agenda`
--
ALTER TABLE `agenda`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `instalacoes`
--
ALTER TABLE `instalacoes`
  MODIFY `codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `modalidade`
--
ALTER TABLE `modalidade`
  MODIFY `codigo` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `socio`
--
ALTER TABLE `socio`
  MODIFY `COD` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `cod` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
