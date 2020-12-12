package Interface;

public class main {
    public static void main(String[]args){
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();

        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();
    }
}
