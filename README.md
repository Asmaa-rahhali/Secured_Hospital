<h1>Gestion des Patients avec Spring Security</h1>

<p>Ce projet illustre le contrôle d'accès basé sur les rôles avec Spring Security, en utilisant trois modes d'authentification:</p>
<ul>
    <li>Authentification In-Memory</li>
    <li>Authentification JDBC</li>
    <li>Authentification avec UserDetailsService</li>
</ul>

<h2>Authentification In-Memory</h2>

<h3>Configuration</h3>
<img src="Captures/inMemoAuth.png" alt="Configuration In-Memory Authentication" width="800">

<h3>Résultat des Tests</h3>
<img src="Captures/inMemoTest.png" alt="Tests In-Memory Authentication" width="800">

<h2>Authentification JDBC</h2>

<h3>Configuration</h3>
<img src="Captures/jdbcAuth.png" alt="Configuration JDBC" width="800">

<h3>Base de Données Utilisateurs</h3>
<img src="Captures/db_jdbcAuth.png" alt="Base de Données JDBC Authentication" width="800">

<h3>Résultat des Tests</h3>
<img src="Captures/jdbcAuthTest.png" alt="Tests JDBC Authentication" width="800">

<hr>

<h2>Authentification UserDetailsService</h2>

<h3>Configuration</h3>
<img src="Captures/userDetailsServiceAuth.png" alt="Configuration UserDetailsService Authentication" width="800">

<h3>Base de Données Utilisateurs</h3>
<img src="Captures/db_userDetails.png" alt="Base de Données UserDetailsService" width="800">

<h3>Résultat des Tests</h3>
<img src="Captures/testUserDetailsServiceAuth.png" alt="Tests UserDetailsService Authentication" width="800">

<hr>

<h2>Interfaces Utilisateurs</h2>

<h3>Page de Connexion</h3>
<img src="Captures/login.png" alt="Page de Connexion" width="800">

<h3>Vue Admin</h3>
<p>L'administrateur peut consulter et gérer la liste des patients, y compris les supprimer ou les modifier.</p>
<img src="Captures/affichageAdmin.png" alt="Vue Admin" width="800">

<h3>Vue Utilisateur</h3>
<p>L'utilisateur peut consulter la liste des patients mais n'a pas accès à la suppression ou la modification.</p>
<img src="Captures/affichageUser.png" alt="Vue Utilisateur" width="800">

<h3>Accès Refusé</h3>
<p>Un utilisateur tentant d'accéder à des fonctionnalités réservées aux administrateurs, comme la suppression d'un patient, verra un message d'accès refusé.</p>
<img src="Captures/deleteNotAutho.png" alt="Accès Refusé" width="800">

