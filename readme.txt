	************************************
*****  	Livrables:			   	*****
	************************************	

Diagrammes UML : Diagramme_de_classes.png
Application Proxibanque : l'application : Le dossier éclipse de l'application : Proxybanquev2, la documentation Javadoc, l'archive war : Proxybanquev2.war
Base de données : Proxibanquev2.sql


	************************************
*****  	Description de l'application:   	*****
	************************************

ProxiBanqueSI est une application visant à faciliter les différentes missions des conseillers.
Elle permet à un conseiller :

- de lire les informations concernant un client enregistré (coordonnées) ;
- créer client
- éditer un client
- voir la liste de tous les clients

Concernant la visualisation de la liste des comptes, cette fonction ne marche pas, elle n'a pas pu être terminée.

L'application est structurée en 4 packages :
- view
- model
- dao
- service
- util

Le package view contient les différents servlet, qui permettent d'afficher la vue et rediriger vers les pages correspondantes au besoin de l'utilisateur. 

Le package model contient les classes métier, notamment le Client, le Conseiller et les différents Comptes, appelées au sein
des autres packages pour la mise en oeuvre des fonctionnalités de l'application.

Le package dao contient la classe Dao, où sont appelées les méthodes du CRUD (insérer, lire, modifier, supprimer) sur la base de données. 
L'interface IDao sert à réguler l'interaction entre la classe Dao et le
package service.

Le package service contient la classe ServiceClient, qui comporte des méthodes permettant
le fonctionnement de l'application, et l'interface IServiceClient, qui régule l'interaction
du package service avec les packages dao et view.


	************************************
*****  	Documentation:			  	*****
	************************************

Pour avoir accès à la documentation :

1) Ouvrez le dossier /doc

2/ Double cliquez sur 'index.html'

	
	************************************
***** 	Execution de l'application:    		*****
	************************************

Veuillez suivre les indications suivantes:

1) Pour démarrer la base de données de l'application : -Ouvrez l'application XAMPP
													   -Dans XAMPP, démarrez Apache et MySQL
													   -Cliquez sur "Admin" sur la ligne 'MySQL'
													   -Cliquez sur Importer
													   -Choisissez le fichier : Proxibanquev2.sql et executez

2) Pour lancer l'application, récupérez le ficher Proxybanquev2.war et placez le dans le dossier bin/webapps de votre conteneur web Apache Tomcat

2) Lancez une invite de commande (cmd.exe) et placez vous dans le répertoire bin de votre conteneur web Apache Tomcat

3) Démarrez Tomcat en utilisant la commande : startup.bat

4) Ouvrez votre navigateur web et rentrez l'adresse : http://localhost:8080/Proxybanquev2/

5) Pour se connecter il faut entrer en login 'toto', et en mot de passe'toto'.