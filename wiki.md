# configuration du client Git

NB: Cette étape n'est à faire qu'une seule fois par workspace eclipse.

Pour que les commits soient bien affectés au bon utilisateur, il peut-être intéressant de modifier les propriétés user.name et user.email pour avoir les même qu’habituellement au bureau. (Copyright @Loïc)

Sous "Windows" -> "Preferences", aller dans "Team" -> "Git" -> "Configuration", cliquer sur "Add Entry...".
Ajouter les propriété user.name à "Prénom Nom" et user.email à "prénom.nom@justice.gouv.fr".

![importer_eclipse_3](uploads/883df843d32acbc396681913d7f7e236/importer_eclipse_3.png)


# copie de l'adresse du repo Git

A la racine du projet ([https://gitlab.com/sdse/bis/myproject](https://gitlab.com/sdse/bis/myproject)), cliquer sur "Clone", Clone with HTTPS -> icône "Copy URL":

![importer_eclipse_1](uploads/81cb15c9ad2ff70481685415d1e08e52/importer_eclipse_1.png)

# importer un projet sous eclipse

Dans eclipse, dans la vue "Projects Explorer", clic droit -> "Import..."

![importer_eclipse_2](uploads/d1748e3644ada6098a50685aadba38d6/importer_eclipse_2.png)

Choisir "Git" -> "Projects from Git (with smart import)" et cliquer sur "Next".

![importer_eclipse_4](uploads/f86def2b257228412e6e77914574f23d/importer_eclipse_4.png)

"Clone URI", "Next".

L'adresse du dépot Git devrait être pré-renseignée.
Ajouter votre compte gitlab et cocher "Store in Secure Store".

![importer_eclipse_5](uploads/bb12aedf6c6190e4e40ec9e031ac17f1/importer_eclipse_5.png)

Cliquer 2 fois sur "Next", choisir l'emplacement dans le workspace, cliquer sur "Next", cliquer sur "Finish".

# mon premier push commit

Editer le fichier README.md.
Ouvrir la vue Git Staging ("Windows" -> "Show View" -> "Other..." -> "Git" -> "Git staging".
Ajouter le fichier README.md dans les changement, mettre un message, cliquer sur "Commit and Push...".

![importer_eclipse_6](uploads/1ace4002305bec40512b94d8b4d525ef/importer_eclipse_6.png)