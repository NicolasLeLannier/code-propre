package ex3;

import java.util.List;

public class Zoo {

	/** types de l'animal */
	private List<TypeAnimal> types;
	/** noms de l'animal */
	private List<Animal> noms;
	/** comportements alimentaire de l'animal */
	private List<ComportementAlimentaire> comportements;
	
	/** Method
	 * @param nomAnimal : nom de l'animal
	 * @param typeAnimal : type de l'animal
	 * @param comportement : comportement alimentaire de l'animal
	 */
	public void addAnimal(Animal nomAnimal, TypeAnimal typeAnimal, ComportementAlimentaire comportement){
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	/** Method
	 * afficher liste animaux
	 */
	public void afficherListeAnimaux(){
		for (int i=0; i<types.size(); i++) {
			System.out.println(noms.get(i).getNom()+" "+types.get(i)+" "+comportements.get(i));
		}
	}
	
	/** Method
	 * @return
	 */
	public int taille() {
		return types.size();
	}

}
