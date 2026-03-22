package Assisted_Problem.Problem_1;

public class Runner {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.name = "tommy";
        d.age = 3;

        Cat c = new Cat();
        c.name = "kitty";
        c.age = 2;

        Bird b = new Bird();
        b.name = "pikko";
        b.age = 1;

        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}
