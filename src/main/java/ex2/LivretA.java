package ex2;

/** 
 * @author Nicolas LE LANNIER
 */
public class LivretA extends CompteBancaire {

	private static final int CENT_POURCENT = 100;
	
	/** tauxRemuneration : taux de rémunération */
	private double tauxRemuneration;
	
	/** Constructor
	 * @param type
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(TypeCompte.LIVRETA, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/** Method
	 * 
	 */
	public void appliquerRemuAnnuelle(){
			setSolde(getSolde() + getSolde()*tauxRemuneration/CENT_POURCENT);
	}
	
	@Override
	public void debiterMontant(double montant){
		if(getSolde() - montant > 0) {
			setSolde(getSolde() - montant);
		}
	}
	
	/** Getter
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
