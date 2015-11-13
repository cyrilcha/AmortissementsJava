package amortissements;

/**
 * Représente un crédit.
 */

public class Credit 
{
	public final static int AMORTISSEMENT_CONSTANTS = 1,
			ANNUITES_CONSTANTES = 2;
	
	private int typeCredit;
	private double montantEmprunte;
	private double annuiteMaximale;
	private double taux;
	private int duree;

	/**
	 * Cr�� un cr�dit.
	 */
	
	Credit (int typeCredit, double montantEmprunte, double annuiteMaximale,
			double taux, int duree)
	{
		this.typeCredit = typeCredit;
		this.montantEmprunte = montantEmprunte;
		this.annuiteMaximale = annuiteMaximale;
		this.taux = taux;
		this.duree = duree;
	}
	
	/**
	 * Retourne le montant emprunté.
	 */
	
	public double montantEmprunte()
	{
		return montantEmprunte;
	}
	
	/**
	 * Retourne le montant de la plus grande annuité. 
	 */
	
	public double annuiteMaximale()
	{
		return annuiteMaximale;
	}
	
	/**
	 * Retourne le taux du crédit.
	 */
	
	public double taux()
	{
		return taux;
	}
	
	/**
	 * Retourne le nombre d'annuités à verser.
	 */
	
	public int duree()
	{
		return duree;
	}
	
	/**
	 * Retourne le tableau d'amortissement du crédit.
	 */
	
	public TableauAmortissement getTableauAmortissement()
	{
		// TODO  à  compléter.
		return null;
	}
	
	/**
	 * Retourne un crédit en calculant automatiquement le taux.
	 */
	
	public static Credit calculeTaux(int typeCredit, 
			double montantEmprunte, double annuiteMaximale,
			int duree)
	{
		// TODO à compléter
		return null;
	}
	
	/**
	 * Retourne un crédit en calculant automatiquement la durée.
	 */
	
	public static Credit calculeDuree(int typeCredit, 
			double montantEmprunte, double annuiteMaximale,
			double taux)
	{
		// TODO à compléter
		return null;
	}

	/**
	 * Retourne un crédit en calculant automatiquement le montant
	 * 	qu'il est possible d'emprunter.
	 */
	
	public static Credit calculeMontantEmprunte(int typeCredit, 
			double annuiteMaximale,	double taux, int duree)
	{
		if(typeCredit == AMORTISSEMENT_CONSTANTS)
		{
			return new Credit(typeCredit, annuiteMaximale,
					annuiteMaximale, taux, duree);
		}
		else
		{
			return null;
		}
	}

	/**
	 * Retourne un crédit en calculant automatiquement
	 * l'annuité maximale.
	 */
	
	public static Credit calculeAnnuiteMaximale(int typeCredit, 
			double montantEmprunte,	double taux, int duree)
	{
		if(typeCredit == AMORTISSEMENT_CONSTANTS)
		{
			return new Credit(typeCredit, montantEmprunte,
					(montantEmprunte/duree + montantEmprunte*taux/100), taux, duree);
		}
		else
		{
			return null;
		}
	}
}

