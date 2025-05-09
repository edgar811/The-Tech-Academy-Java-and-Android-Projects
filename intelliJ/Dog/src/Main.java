//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breed ="Hound";
        dog.color = "Brown";
        dog.height = 2;
        dog.weight = 60;
        System.out.println("Breed: " + dog.breed);
        System.out.println("Color: " + dog.color);
        System.out.println("Height: " + dog.height + " feet");
        System.out.println("Weight: " + dog.weight + " pounds");

        // Call the behaviors
        dog.shake();
        dog.sit();
        dog.layDown();
        }
    }
