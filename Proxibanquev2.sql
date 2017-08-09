-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  jeu. 27 juil. 2017 à 15:40
-- Version du serveur :  10.1.25-MariaDB
-- Version de PHP :  7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `proxibanque`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `Id` int(11) NOT NULL,
  `Nom` varchar(20) NOT NULL,
  `Prenom` varchar(20) NOT NULL,
  `Adresse` varchar(60) DEFAULT NULL,
  `CodePostal` varchar(10) DEFAULT NULL,
  `Ville` varchar(10) DEFAULT NULL,
  `Telephone` varchar(10) DEFAULT NULL,
  `Email` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`Id`, `Nom`, `Prenom`, `Adresse`, `CodePostal`, `Ville`, `Telephone`, `Email`) VALUES
(1, 'Michel', 'Jean', '3, rue des Carmes', '75014', 'Paris', '0100000000', 'jeanmich@gmail.com'),
(2, 'Gilberto', 'Gilbert', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `compte courant`
--

CREATE TABLE `compte courant` (
  `Id` int(11) NOT NULL,
  `Numéro Compte` int(11) NOT NULL,
  `Solde` double NOT NULL,
  `Date Ouverture` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `compte epargne`
--

CREATE TABLE `compte epargne` (
  `Id` int(11) NOT NULL,
  `Numéro Compte` int(11) NOT NULL,
  `Solde` double NOT NULL,
  `Date Ouverture` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`Id`);

--
-- Index pour la table `compte courant`
--
ALTER TABLE `compte courant`
  ADD PRIMARY KEY (`Numéro Compte`),
  ADD KEY `Foreign` (`Id`);

--
-- Index pour la table `compte epargne`
--
ALTER TABLE `compte epargne`
  ADD PRIMARY KEY (`Numéro Compte`),
  ADD KEY `Foreign` (`Id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT pour la table `compte courant`
--
ALTER TABLE `compte courant`
  MODIFY `Numéro Compte` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `compte epargne`
--
ALTER TABLE `compte epargne`
  MODIFY `Numéro Compte` int(11) NOT NULL AUTO_INCREMENT;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
