package Inheritance;

class Animal{
	
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	void makeSound() {
		System.out.println("animal makes a sound");
	}

}
 

 class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
	@Override
	
	void makeSound() {
		System.out.println(name + ":" + " bark");
	}
	
	 

}
 
 class Bird extends Animal{
	 public Bird(String name,int age) {
		 super(name,age);
	 }
		 
		@Override 
		void makeSound() {
			System.out.println(name + ": chirps");
	 }
 }
 
 class Cat extends Animal{

		public Cat(String name, int age) {
			super(name, age);
		}
		@Override
		
		void makeSound() {
			System.out.println(name +  ": meow");
		}
	}
public class AnimalHierarchy{
	public static void main(String[] args) {
		Animal a1=new Dog("Rocky" ,4);
		Animal a2=new Cat("Whiskers",3);
		Animal a3=new Bird("tweety",2);
		
		a1.makeSound();
		a2.makeSound();
		a3.makeSound();
	
	 
 }
}