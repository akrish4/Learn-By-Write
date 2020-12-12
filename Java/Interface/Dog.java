package Interface;

public class Dog  implements  Animal{
    @Override
    public void eat() {
        System.out.println("I am a dog and I am eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Barf! Barf!");
    }
}
