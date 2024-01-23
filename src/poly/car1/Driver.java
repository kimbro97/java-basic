package poly.car1;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void drive() {
        this.car.startEngine();
        this.car.pressAccelerator();
        this.car.offEngine();
    }
}
