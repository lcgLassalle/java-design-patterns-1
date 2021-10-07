package fr.diginamic.state;

public class DemoAvion {

	public static void main(String[] args) {
		Avion avion = new Avion();
/*		avion.setEtat("AU SOL");
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();
		
		avion.setEtat("EN VOL");
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();
		
		avion.setEtat("EN APPROCHE");
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();
*/
		avion.setEtat(new AvionAuSol());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();

		avion.setEtat(new AvionEnVol());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();

		avion.setEtat(new AvionEnApproche());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();


	}

}
