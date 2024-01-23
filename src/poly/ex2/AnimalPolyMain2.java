package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        Animal[] animals = {dog, cat, caw, duck};
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
