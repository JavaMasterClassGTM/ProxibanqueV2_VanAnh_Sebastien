package model;

public class Compte {
	private double solde;
	private int numeroCompte ;
	private String dateOuverture;
	
	
	
	public Compte(double solde, int numeroCompte, String dateOuverture) {
		super();
		this.solde = solde;
		this.numeroCompte = numeroCompte;
		this.dateOuverture = dateOuverture;
	}
	




	public Compte() {
		super();
	}





	public double getSolde() {
		return solde;
	}



	public void setSolde(double solde) {
		this.solde = solde;
	}



	public int getNumeroCompte() {
		return numeroCompte;
	}



	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}



	public String getDateOuverture() {
		return dateOuverture;
	}



	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	

}
