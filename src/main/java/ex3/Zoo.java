package ex3;

import java.util.ArrayList;
import java.util.List;

/** Représente le concept de Zoo
 * @author Nicolas LE LANNIER
 */
public class Zoo {

	/** nom du zoo */
	private String nom;
	/** animaux */
	private List<Animal> animaux = new ArrayList<>();
	
	/** Constructeur
	 * @param nom
	 */
	public Zoo(String nom) {
		super();
		this.nom = nom;
	}

	/** Method
	 * @param nomAnimal : nom de l'animal
	 * @param typeAnimal : type de l'animal
	 * @param comportement : comportement alimentaire de l'animal
	 */
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}
	
	/** Method
	 * afficher liste animaux
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : animaux) {
			System.out.println(animal);
		}
	}
	
	/** Method
	 * @return
	 */
	public int taille() {
		return animaux.size();
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

}
