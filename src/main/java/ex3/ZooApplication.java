package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		zoo.addAnimal(new Animal("Gazelle"), TypeAnimal.MAMMIFERE, ComportementAlimentaire.HERBIVORE);
		zoo.addAnimal(new Animal("Zèbre"), TypeAnimal.MAMMIFERE, ComportementAlimentaire.HERBIVORE);
		zoo.addAnimal(new Animal("Lion"), TypeAnimal.MAMMIFERE, ComportementAlimentaire.HERBIVORE);
		zoo.addAnimal(new Animal("Panthère"), TypeAnimal.MAMMIFERE, ComportementAlimentaire.CARNIVORE);
		zoo.addAnimal(new Animal("Requin blanc"), TypeAnimal.POISSON, ComportementAlimentaire.HERBIVORE);
		zoo.addAnimal(new Animal("Truite dorée"), TypeAnimal.POISSON, ComportementAlimentaire.HERBIVORE);
		zoo.addAnimal(new Animal("Boa constrictor"), TypeAnimal.SERPENT, ComportementAlimentaire.CARNIVORE);
		zoo.addAnimal(new Animal("Python"), TypeAnimal.SERPENT, ComportementAlimentaire.CARNIVORE);
	}

}
