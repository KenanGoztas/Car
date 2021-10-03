public class Wheel {
    private float diameter;
    private Brake brake;
    private Suspension suspension;
    private Tire tire;

    public Wheel(float diameter, Brake brake, Suspension suspension, Tire tire) {
        this.diameter = diameter;
        this.brake = brake;
        this.suspension = suspension;
        this.tire = tire;
    }

    public float getDiameter() {
        return diameter;
    }

    public Brake getBrake() {
        return brake;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
}
