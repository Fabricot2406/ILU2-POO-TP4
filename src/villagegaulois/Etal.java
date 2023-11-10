package villagegaulois;

import personnages.Gaulois;

import produit.IProduit;

public class Etal <P extends IProduit> {
	private Gaulois vendeur;
	private P[] produit;
	private int nbProduit;
	private int prix;
	
	public void installerVendeur(Gaulois vendeur, P[] produit, int prix) {
		this.vendeur = vendeur;
		this.produit = produit;
		this.nbProduit = produit.length;
		this.prix = prix;
	}
}
