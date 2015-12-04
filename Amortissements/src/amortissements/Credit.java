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

	private TableauAmortissement tableauamortissement;

	/**
	 * Créé un crédit.
	 */
	
	Credit (int typeCredit, double montantEmprunte, double annuiteMaximale,
			double taux, int duree)
	{
		this.typeCredit = typeCredit;
		this.montantEmprunte = montantEmprunte;
		this.annuiteMaximale = annuiteMaximale;
		this.taux = taux;
		this.duree = duree;
		this.tableauamortissement = new TableauAmortissement(this);
	}
	
	/**
	 * Retourne le type de credit
	 */
	
	public int typeCredit()
	{
		return typeCredit;
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
		return tableauamortissement;
	}
	
	/**
	 * Retourne un crédit en calculant automatiquement le taux.
	 */
	
	public static Credit calculeTaux(int typeCredit, 
			double montantEmprunte, double annuiteMaximale,
			int duree)
	{
		if(typeCredit == AMORTISSEMENT_CONSTANTS)
		{
			double interet = annuiteMaximale - (montantEmprunte/duree);
			double taux = interet / montantEmprunte;
			return new Credit(typeCredit, montantEmprunte, annuiteMaximale, taux, duree);
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Retourne un crédit en calculant automatiquement la durée.
	 */
	
	public static Credit calculeDuree(int typeCredit, 
			double montantEmprunte, double annuiteMaximale,
			double taux)
	{
		if(typeCredit == AMORTISSEMENT_CONSTANTS)
		{
			
			double duree_d = -taux + (montantEmprunte/annuiteMaximale);
		    int duree = (int) Math.ceil(duree_d);
			return new Credit(typeCredit, montantEmprunte, annuiteMaximale, taux, duree);
		}
		else
		{
			return null;
		}
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
			double montantEmprunte = annuiteMaximale/((1./duree)+taux);
			return new Credit(typeCredit, montantEmprunte,
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
			double annuiteMaximale = montantEmprunte/duree + montantEmprunte*taux;
			return new Credit(typeCredit, montantEmprunte, annuiteMaximale, taux, duree);
		}
		else
		{
			return null;
		}
	}
	
	public String toString() 
	{
		return  "Montant emprunté: " + this.montantEmprunte() + "\n" + 
				"Durée : " + this.duree() + "\n" +
				"Taux : " + this.taux() + "\n" +
				"Annuité Maximale : " + this.annuiteMaximale();
	}
}

