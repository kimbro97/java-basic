package poly.car1;

public class K3Car implements Car {
    public void startEngine() {
        System.out.println("K3Car시동 on");
    }

    public void offEngine() {
        System.out.println("K3Car시동 off");
    }

    public void pressAccelerator() {
        System.out.println("K3Car악셀");
    }
}
