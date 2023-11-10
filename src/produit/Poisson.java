package produit;

public class Poisson extends Produit {
	private String datePeche;
	
	public Poisson(String datePeche) {
		super(nom = "poisson", unite = Unite.PIECE);
		super.setNom("poisson");
		this.datePeche = datePeche;
	}
	
	@Override
	public void description() {
		System.out.println(super.getNom() + " pêchés " + datePeche);
	}
}
