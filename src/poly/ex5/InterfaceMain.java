package poly.ex5;
public class InterfaceMain {
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

    private static void soundAnimal(InterfaceAnimal interfaceAnimal) {
        interfaceAnimal.sound();
    }

    private static void moveAnimal(InterfaceAnimal interfaceAnimal) {
        interfaceAnimal.move();
    }
}
