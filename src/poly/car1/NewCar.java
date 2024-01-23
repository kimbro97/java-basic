package poly.car1;

public class NewCar implements Car{
    public void startEngine() {
        System.out.println("NewCar시동 on");
    }

    public void offEngine() {
        System.out.println("NewCar시동 off");
    }

    public void pressAccelerator() {
        System.out.println("NewCar악셀");
    }
}
