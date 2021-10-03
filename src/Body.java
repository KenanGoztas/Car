public class Body {
    private int numberOfDoors;
    private Car car;
    public Body (int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
