package Interface;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("I am a cat and I am eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
