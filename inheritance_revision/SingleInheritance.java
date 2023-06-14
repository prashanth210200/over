package inheritance_revision;

public class SingleInheritance {

}
class Animal {
	   String name;
	   int age;

	   public Animal(String name, int age) {
	      this.name = name;
	      this.age = age;
	   }

	   public void speak() {
	      System.out.println("I am an animal.");
	   }
	}

	class Mammal extends Animal {
	   public Mammal(String name, int age) {
	      super(name, age);
	   }

	   public void giveBirth() {
	      System.out.println("I give birth to live young.");
	   }
	}

	class Dog extends Mammal {
	   public Dog(String name, int age) {
	      super(name, age);
	   }

	   public void speak() {
	      System.out.println("Woof!");
	   }
	}

	 class UseDog {
	   public static void main(String[] args) {
	      Dog myDog = new Dog("Fido", 3);
	      System.out.println("Name: " + myDog.name);
	      System.out.println("Age: " + myDog.age);
	      myDog.speak();
	      myDog.giveBirth();
	   }
	}
