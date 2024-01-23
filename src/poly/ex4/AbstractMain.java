package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
        moveAnimal(duck);
    }

    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        abstractAnimal.sound();
    }

    private static void moveAnimal(AbstractAnimal abstractAnimal) {
        abstractAnimal.move();
    }
}
