package itscm2015;

public class Etudiant {
	private String nom;
	private String prenom;
	private int num;

	public static void main(String[] args) {
		Etudiant et1 = new Etudiant();
		et1.nom = "zaghli";
		et1.prenom = "hicham";
		et1.num = 1;
		System.out.println("nom:"+ et1.nom +" prenom:"+ et1.nom + " numer:"+ et1.num);

	}

}
