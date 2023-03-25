package com.vagdeviitstudents.naveen;

class Cat extends DogForOverride {

	public void speak() {
		System.out.println("The cat meyow ");
	}

	public static void main(String[] args) {
		Animaloverriding Animaloverriding = new Animaloverriding();
		Animaloverriding.speak();
		DogForOverride dog = new DogForOverride();
		dog.speak();
		Animaloverriding cat=new Cat();
		cat.speak();

	}
}
