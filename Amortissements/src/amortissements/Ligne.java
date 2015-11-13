package amortissements;

/**
 * Ligne du tableau d'amortissement d'un crédit.
 */

public class Ligne 
{
	/**
	 * Créé une ligne à  partir des valeurs passées en paramètres.
	 */

	Ligne(int annee, double capitalInitial, double interets, 
			double amortissements, double annuite, double capitalFinal)
	{
		// TODO Ã  compléter.
	}

	/**
	 * Retourne l'indice de l'année concernée par la ligne.
	 * Les indices commencent à 1.
	 */
	
	public int getAnnee()
	{
		// TODO à compléter.
		return 0;
	}
	
	/**
	 * Retourne le montant du capital restant dû au début 
	 * de la période.
	 */
	
	public double getCapitalInitial()
	{
		// TODO à compléter.
		return 0;
	}
	
	/**
	 * Retourne le montant des intérêts verséss pendant la période.
	 */
	
	public double getInterets()
	{
		// TODO à compléter.
		return 0;
	}

	/**
	 * Retourne le montant du capital amorti pendant la période.
	 */
	
	public double getAmortissements()
	{
		// TODO Ã  complÃ©ter.
		return 0;
	}

	/**
	 * Retourne le montant de l'annuité pendant la période.
	 */
	
	public double getAnnuite()
	{
		// TODO à compléter.
		return 0;
	}
	
	/**
	 * Retourne le montant du capital restant dû à la fin
	 * de la période.
	 */
	
	public double getCapitalFinal()
	{
		// TODO à compléter.
		return 0;
	}
	
	/**
	 * Retourne la première ligne du tableau d'amortissement pour
	 * le crédit passé en paramètre.
	 */
	
	public static Ligne premiereLigne(Credit credit)
	{
		// TODO à compléter.
		return null;
	}

	/**
	 * Retourne la ligne suivant la ligne courante pour le 
	 * passer en paramètre. Retourne null si la ligne courante est
	 * la dernière ligne.
	 */
	
	public Ligne ligneSuivante(Credit credit)
	{
		// TODO à compléter.
		return null;
	}
}
