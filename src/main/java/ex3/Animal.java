/**
 *
 */
package ex3;

import java.util.List;

/** Représente le concept d'animal
 * @author Nicolas LE LANNIER
 */
public class Animal {
	/** nom */
	private String nom;
	private EspeceAnimal espece;
	private ComportementAlimentaire comportements;

	/** Constructeur
	 * @param nom
	 * @param types
	 * @param comportements
	 */
	public Animal(String nom, EspeceAnimal espece, ComportementAlimentaire comportements) {
		super();
		this.nom = nom;
		this.espece = espece;
		this.comportements = comportements;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the comportements
	 */
	public ComportementAlimentaire getComportements() {
		return comportements;
	}

	/** Setter
	 * @param comportements the comportements to set
	 */
	public void setComportements(ComportementAlimentaire comportements) {
		this.comportements = comportements;
	}

	/** Getter
	 * @return the espece
	 */
	public EspeceAnimal getEspece() {
		return espece;
	}

	/** Setter
	 * @param espece the espece to set
	 */
	public void setEspece(EspeceAnimal espece) {
		this.espece = espece;
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", espece=" + espece + ", comportements=" + comportements + "]";
	}
	
	
}
