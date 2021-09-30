public class Car {
    private int registrationNum;
    private int year;
    private String licenceNumber;
    private Engine engine;


    public Car(int registrationNum, int year, String licenceNumber, Engine engine) {
        this.registrationNum = registrationNum;
        this.year = year;
        this.licenceNumber = licenceNumber;
        this.engine = engine;
    }


    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(int registrationNum) {
        this.registrationNum = registrationNum;
    }

    public void moveForward(){

    }
    public void moveBackward(){

    }
    public void stop(){

    }
    public void turnRight(){

    }
    public void turnLeft(){

    }


}
