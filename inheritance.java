class Animal {
   protected String type; // protected variable
   
   public Animal(String type) { // constructor
      this.type = type;
   }
   
   public void sound() { // method
      System.out.println("The " + type + " makes a sound.");
   }
}

class Dog extends Animal {
   private String breed; // private variable
   
   public Dog(String type, String breed) { // constructor
      super(type); // call superclass constructor
      this.breed = breed;
   }
   
   public void bark() { // new method for Dog class
      System.out.println("The " + breed + " dog barks.");
   }
}

public class Main {
   public static void main(String[] args) {
      Dog germanShepherd = new Dog("Dog", "German Shepherd");
      germanShepherd.sound(); // calling parent class method
      germanShepherd.bark(); // calling child class method
   }
}
