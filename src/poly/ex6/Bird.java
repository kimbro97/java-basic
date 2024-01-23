package poly.ex6;

public class Bird extends Animal implements Fly {

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 날다");
    }
}
