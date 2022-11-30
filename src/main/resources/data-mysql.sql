--
-- Déchargement des données de la table `ressource`
--

INSERT INTO `ressource` (`id`, `nom`, `is_valid`) VALUES
                                                     (1, 'metier_developpeur_informatique', true),
                                                     (2, 'metier_dataAnalyste_informatique', true),
                                                     (3, 'metier_gendarme', true),
                                                     (4, 'Halloween', false),
                                                     (5, 'Noel', true),
                                                     (6, 'Paques', false),
                                                     (7, 'metier_comptable', false),
                                                     (8, 'LeagueOfLegend', true);

--
-- Déchargement des données de la table `role`
--
INSERT INTO `role` (`id`, `nom`) VALUES
                                     (1, 'Utilisateur'),
                                     (2, 'Moderateur'),
                                     (3, 'Administrateur'),
                                     (4, 'Super_administrateur');

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `nom`, `prenom`) VALUES
                                                                 (1, 'Smith', 'John'),
                                                                 (2, 'Romanov', 'Anastasia'),
                                                                 (3, 'Slim', 'Alameda'),
                                                                 (4, 'Neige', 'Blanche'),
                                                                 (5, 'Hopps', 'Bonnie'),
                                                                 (6, 'Leclair', 'Buzz'),
                                                                 (7, 'Duck', 'Donald'),
                                                                 (8, 'Mouse', 'Mickey'),
                                                                 (9, 'Indestructible', 'Violette'),
                                                                 (10, 'Omalley', 'Thomas');

--
-- Déchargement des données de la table `relation`
--

INSERT INTO `relation` (`id`, `type_relation`) VALUES
                                                      (1, 'connaissance'),
                                                      (2, 'famille'),
                                                      (3, 'travail'),
                                                      (4, 'ami'),
                                                      (5, 'meilleur ami'),
                                                      (6, 'conjoint');




