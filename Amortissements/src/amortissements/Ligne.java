package amortissements;

/**
 * Ligne du tableau d'amortissement d'un cr�dit.
 */

public class Ligne 
{
	/**
	 * Cr�� une ligne � partir des valeurs pass�es en param�tres.
	 */

	Ligne(int annee, double capitalInitial, double interets, 
			double amortissements, double annuite, double capitalFinal)
	{
		// TODO à compl�ter.
	}

	/**
	 * Retourne l'indice de l'ann�e concern�e par la ligne.
	 * Les indices commencent �1.
	 */
	
	public int getAnnee()
	{
		// TODO � compl�ter.
		return 0;
	}
	
	/**
	 * Retourne le montant du capital restant d� au d�but 
	 * de la p�riode.
	 */
	
	public double getCapitalInitial()
	{
		// TODO �compl�ter.
		return 0;
	}
	
	/**
	 * Retourne le montant des int�r�ts vers�ss pendant la p�riode.
	 */
	
	public double getInterets()
	{
		// TODO � compl�ter.
		return 0;
	}

	/**
	 * Retourne le montant du capital amorti pendant la p�riode.
	 */
	
	public double getAmortissements()
	{
		// TODO à compléter.
		return 0;
	}

	/**
	 * Retourne le montant de l'annuit� pendant la p�riode.
	 */
	
	public double getAnnuite()
	{
		// TODO � compl�ter.
		return 0;
	}
	
	/**
	 * Retourne le montant du capital restant d� �la fin
	 * de la p�riode.
	 */
	
	public double getCapitalFinal()
	{
		// TODO � compl�ter.
		return 0;
	}
	
	/**
	 * Retourne la premi�re ligne du tableau d'amortissement pour
	 * le cr�dit pass� en param�tre.
	 */
	
	public static Ligne premiereLigne(Credit credit)
	{
		// TODO � compl�ter.
		return null;
	}

	/**
	 * Retourne la ligne suivant la ligne courante pour le 
	 * passer en param�tre. Retourne null si la ligne courante est
	 * la derni�re ligne.
	 */
	
	public Ligne ligneSuivante(Credit credit)
	{
		// TODO � compl�ter.
		return null;
	}
}
