
public class Animaloverriding {
	public void speak() {
		System.out.println("The animal makes a sound");
	}

}

class Dog extends Animaloverriding {

	public void speak() {
		System.out.println("The dog barks");
	}
}

class Cat extends Dog {

	public void speak() {
		System.out.println("The cat meyow ");
	}

	public static void main(String[] args) {
		Animaloverriding Animaloverriding = new Animaloverriding();
		Animaloverriding.speak();
		Dog dog = new Dog();
		dog.speak();

	}
}