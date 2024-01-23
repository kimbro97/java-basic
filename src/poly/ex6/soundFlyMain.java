package poly.ex6;

public class soundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }

    private static void flyAnimal(Fly fly) {
        fly.fly();
    }
}
