package poly.car0;

public class Driver {
    private K3Car k3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void drive() {
        this.k3Car.startEngine();
        this.k3Car.pressAccelerator();
        this.k3Car.offEngine();
    }
}
