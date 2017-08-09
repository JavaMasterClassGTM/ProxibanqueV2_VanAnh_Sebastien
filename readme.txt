	************************************
*****  	Livrables:			   	*****
	************************************	

Diagrammes UML : Diagramme_de_classes.png
Application Proxibanque : l'application : Le dossier �clipse de l'application : Proxybanquev2, la documentation Javadoc, l'archive war : Proxybanquev2.war
Base de donn�es : Proxibanquev2.sql


	************************************
*****  	Description de l'application:   	*****
	************************************

ProxiBanqueSI est une application visant � faciliter les diff�rentes missions des conseillers.
Elle permet � un conseiller :

- de lire les informations concernant un client enregistr� (coordonn�es) ;
- cr�er client
- �diter un client
- voir la liste de tous les clients

Concernant la visualisation de la liste des comptes, cette fonction ne marche pas, elle n'a pas pu �tre termin�e.

L'application est structur�e en 4 packages :
- view
- model
- dao
- service
- util

Le package view contient les diff�rents servlet, qui permettent d'afficher la vue et rediriger vers les pages correspondantes au besoin de l'utilisateur. 

Le package model contient les classes m�tier, notamment le Client, le Conseiller et les diff�rents Comptes, appel�es au sein
des autres packages pour la mise en oeuvre des fonctionnalit�s de l'application.

Le package dao contient la classe Dao, o� sont appel�es les m�thodes du CRUD (ins�rer, lire, modifier, supprimer) sur la base de donn�es. 
L'interface IDao sert � r�guler l'interaction entre la classe Dao et le
package service.

Le package service contient la classe ServiceClient, qui comporte des m�thodes permettant
le fonctionnement de l'application, et l'interface IServiceClient, qui r�gule l'interaction
du package service avec les packages dao et view.


	************************************
*****  	Documentation:			  	*****
	************************************

Pour avoir acc�s � la documentation :

1) Ouvrez le dossier /doc

2/ Double cliquez sur 'index.html'

	
	************************************
***** 	Execution de l'application:    		*****
	************************************

Veuillez suivre les indications suivantes:

1) Pour d�marrer la base de donn�es de l'application : -Ouvrez l'application XAMPP
													   -Dans XAMPP, d�marrez Apache et MySQL
													   -Cliquez sur "Admin" sur la ligne 'MySQL'
													   -Cliquez sur Importer
													   -Choisissez le fichier : Proxibanquev2.sql et executez

2) Pour lancer l'application, r�cup�rez le ficher Proxybanquev2.war et placez le dans le dossier bin/webapps de votre conteneur web Apache Tomcat

2) Lancez une invite de commande (cmd.exe) et placez vous dans le r�pertoire bin de votre conteneur web Apache Tomcat

3) D�marrez Tomcat en utilisant la commande : startup.bat

4) Ouvrez votre navigateur web et rentrez l'adresse : http://localhost:8080/Proxybanquev2/

5) Pour se connecter il faut entrer en login 'toto', et en mot de passe'toto'.