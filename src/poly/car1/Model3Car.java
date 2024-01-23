package poly.car1;

public class Model3Car implements Car {
    public void startEngine() {
        System.out.println("Model3Car시동 on");
    }

    public void offEngine() {
        System.out.println("Model3Car시동 off");
    }

    public void pressAccelerator() {
        System.out.println("Model3Car악셀");
    }
}
