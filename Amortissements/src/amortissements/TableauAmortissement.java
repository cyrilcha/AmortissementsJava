package amortissements;

/**
 * Représente le tableau d'amortissement d'un crédit.
 */

public class TableauAmortissement 
{
	private Credit credit;
	private Ligne[] lignes;

	/**
	 * Créé le tableau d'amortissement du crédit passé en paramètre.
	 */
	
	public TableauAmortissement(Credit credit)
	{
		this.credit = credit;
		this.lignes = new Ligne[credit.duree()];
		lignes[0] = Ligne.premiereLigne(credit);
		lignes[1] = lignes[0].ligneSuivante(credit);
		for(int i = 2; i < credit.duree(); i++)
		{
			lignes[i] = lignes[i-1].ligneSuivante(credit);
		}
			
	}
	
	/**
	 * Retourne la durée de l'amortissement.
	 */
	
	public int getNbLignes()
	{
		return credit.duree();
	}
	
	/**
	 * Retourne la "i"ème ligne du tableau d'amortissement.
	 * Les indices commencent à 0.
	 */
	
	public Ligne getLigne(int i)
	{
		return lignes[i];
	}
	
	/**
	 * Retourne une représentation du tableau au format 
	 * chaîne de caractères.
	 */
	
	public String toString() 
	{
		String ligne = "Annee      Amortissement      Reste      Interêts      Annuités ";
		for(int i =0; i<getNbLignes() ; i++)
		{
			ligne+=getLigne(i).toString();
		}
		return ligne;
	}
}
