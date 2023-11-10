package produit;

public class Sanglier extends Produit {
	private int poids;
	private String chasseur;
	
	public Sanglier(Unite unite, int poids, String chasseur) {
		super(unite);
		super.setNom("sanglier");
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	@Override
	public void description() {
		System.out.println(super.getNom() + " de " + poids + " " + super.getUnite() + " par " + chasseur);
	}
}
