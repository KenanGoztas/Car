public class Engine {
    private float capacity;
    private int numberOfCylinders;
    private Car car;

    public Engine(float capacity, int numberOfCylinders) {
        this.capacity = capacity;
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void start(){
    }
    public void brake(){
    }
    public void accelerate(){
    }





}
