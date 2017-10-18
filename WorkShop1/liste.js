function ajouterLigne()
{
    'use strict';
	var tableau = document.getElementById("tableau");

	var ligne = tableau.insertRow(-1);//on a ajouté une ligne

	var colonne1 = ligne.insertCell(0);//on a une ajouté une cellule
	colonne1.innerHTML += document.getElementById("id").value;//on y met le contenu de titre

	var colonne2 = ligne.insertCell(1);//on ajoute la seconde cellule
	colonne2.innerHTML += document.getElementById("prenom").value;
    
    var colonne2 = ligne.insertCell(1);//on ajoute la seconde cellule
	colonne2.innerHTML += document.getElementById("nom").value;
    
	var date = new Date();
	var colonne3 = ligne.insertCell(2);
	colonne3.innerHTML += date.getDate();//on ajoute le jour du mois
}