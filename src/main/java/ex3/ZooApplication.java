package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Beauval");
		
		zoo.addAnimal(new Animal("Gazelle", EspeceAnimal.MAMMIFERE, ComportementAlimentaire.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", EspeceAnimal.MAMMIFERE, ComportementAlimentaire.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", EspeceAnimal.MAMMIFERE, ComportementAlimentaire.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", EspeceAnimal.MAMMIFERE, ComportementAlimentaire.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", EspeceAnimal.POISSON, ComportementAlimentaire.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", EspeceAnimal.POISSON, ComportementAlimentaire.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", EspeceAnimal.REPTILE, ComportementAlimentaire.CARNIVORE));
		zoo.addAnimal(new Animal("Python", EspeceAnimal.REPTILE, ComportementAlimentaire.CARNIVORE));
		
		zoo.afficherListeAnimaux();
		System.err.println(zoo.taille());
	}

}
