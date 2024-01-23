package poly.car0;

public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        if (k3Car != null) {
            this.k3Car.startEngine();
            this.k3Car.pressAccelerator();
            this.k3Car.offEngine();
        }
        if (model3Car != null) {
            this.model3Car.startEngine();
            this.model3Car.pressAccelerator();
            this.model3Car.offEngine();
        }
    }
}
