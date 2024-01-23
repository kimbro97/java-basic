package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

//        Caw[] caws = { dog,cat, caw }

        dog.sound();
        cat.sound();
        caw.sound();

        soundCat(cat);
        soundCaw(caw);
    }

    private static void soundCaw(Caw caw) {
        caw.sound();
    }
    private static void soundCat(Cat cat) {
        cat.sound();
    }
}
