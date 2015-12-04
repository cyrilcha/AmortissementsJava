package amortissements;

/**
 * Ligne du tableau d'amortissement d'un crédit.
 */

public class Ligne 
{
	private int annee;
	private double capitalInitial;
	private double interets;
	private double amortissements;
	private double annuite;
	private double capitalFinal;
	
	/**
	 * Créé une ligne à partir des valeurs passées en paramètres.
	 */

	Ligne(int annee, double capitalInitial, double interets, 
			double amortissements, double annuite, double capitalFinal)
	{
		this.annee = annee;
		this.capitalInitial = capitalInitial;
		this.interets = interets;
		this.amortissements = amortissements;
		this.annuite = annuite;
		this.capitalFinal = capitalFinal;
		
	}

	/**
	 * Retourne l'indice de l'année concernée par la ligne.
	 * Les indices commencent à 1.
	 */
	
	public int getAnnee()
	{
		return annee;
	}
	
	/**
	 * Retourne le montant du capital restant dû au début 
	 * de la période.
	 */
	
	public double getCapitalInitial()
	{
		return capitalInitial;
	}
	
	/**
	 * Retourne le montant des intérêts versés pendant la période.
	 */
	
	public double getInterets()
	{
		return interets;
	}

	/**
	 * Retourne le montant du capital amorti pendant la période.
	 */
	
	public double getAmortissements()
	{
		return amortissements;
	}

	/**
	 * Retourne le montant de l'annuité pendant la période.
	 */
	
	public double getAnnuite()
	{
		return annuite;
	}
	
	/**
	 * Retourne le montant du capital restant dû à la fin
	 * de la période.
	 */
	
	public double getCapitalFinal()
	{
		return capitalFinal;
	}
	
	/**
	 * Retourne la première ligne du tableau d'amortissement pour
	 * le crédit passé en paramètre.
	 */
	
	public static Ligne premiereLigne(Credit credit)
	{
		int annee = 1;
		double amortissements = credit.montantEmprunte() / credit.duree();
		double capitalInitial = credit.montantEmprunte() - amortissements;
		double capitalFinal = capitalInitial;
		double annuite = credit.annuiteMaximale();
		double interets = annuite - amortissements;
		return new Ligne(annee, capitalInitial, interets, amortissements, annuite, 
				capitalFinal);
	}

	/**
	 * Retourne la ligne suivant la ligne courante pour le crédit
	 * passé en paramètre. Retourne null si la ligne courante est
	 * la dernière ligne.
	 */
	
	public Ligne ligneSuivante(Credit credit)
	{
		if(this.annee == credit.duree())
			return null;
		else
		{
			int annee = this.annee + 1;
			double amortissements = this.amortissements;
			double capitalInitial = this.capitalInitial-amortissements;
			double interets = this.capitalFinal*credit.taux();
			double annuite = amortissements + interets;
			double capitalFinal = this.capitalFinal - amortissements;
			return new Ligne(annee, capitalInitial, interets, amortissements, annuite, 
					capitalFinal);
		}
	}
	
	public String toString() 
	{
		return "\n  " + getAnnee() + "           "  + getAmortissements() + "        " +
				getCapitalInitial() + "      " + getInterets() + "       " + 
				getAnnuite() + "\n";
	}
}
