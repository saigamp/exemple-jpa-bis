## exemple-jpa-bis

# installation

- dans eclipse, onglet "project explorer", clic droit "Import..."
- git/Projects from git (with smart import)
- clone URI
- dans URI: https://github.com/saigamp/exemple-jpa-bis.git

Attention! Le projet est en java 11. Il faut penser à avoir le jdk11.

# utilisation

- lancer la classe Application.java (run as java)
- dans un navigateur, aller sous http://localhost:8080/ (un message de bienvenue doit apparaîte)
- pour visualiser la base H2: http://localhost:8080/h2-console
- Driver Class: org.h2.Driver
- JDBC URL: jdbc:h2:mem:testdb
- User Name: sa
- Password: password
- une table book existe et contient 3 lignes (voit src/main/resources/data/sql)