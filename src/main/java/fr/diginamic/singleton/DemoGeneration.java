package fr.diginamic.singleton;

import fr.diginamic.singleton.externe.FicheSalaireIndividuelle;

public class DemoGeneration {

	public static void main(String[] args) {
		
		BulletinSalaire bs = new BulletinSalaire("Untel", "Bob", 2337.5);
		FicheSalaireIndividuelle fsi = new FicheSalaireIndividuelle("testeur","adaptation", 2500.3);

		//On adapte la fiche salaire pour qu'elle soit utilisable par le systeme de gestion
		FicheSalaireAdapter fsiAdapte = new FicheSalaireAdapter(fsi);

		SystemeGestion sg = new SystemeGestion();
		sg.genererPdf(bs, "/Users/louise/Desktop/FORMATION/Alternance/TPs/bulletin_salaire.pdf");
		sg.genererPdf(fsiAdapte, "/Users/louise/Desktop/FORMATION/Alternance/TPs/fiche_salaire_indiv.pdf");
	}

}
