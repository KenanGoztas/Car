import java.util.ArrayList;

public class Car {
    private int registrationNum;
    private int year;
    private String licenceNumber;
    private Engine engine;
    private Body body;
    private Brake brake;
    private ArrayList<Suspension> suspension = new ArrayList<>();
    private GearBox gearbox;


    public Car(int registrationNum, int year, String licenceNumber, Engine engine, Body body, Brake brake, Suspension suspension, GearBox gearbox) {
        this.registrationNum = registrationNum;
        this.year = year;
        this.licenceNumber = licenceNumber;
        this.engine = engine;
        this.body = body;
        this.brake = brake;
       // this.suspension = suspension;
        this.gearbox = gearbox;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Brake getBrake() {
        return brake;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }

    public ArrayList<Suspension> getSuspension() {
        return suspension;
    }

    public void addSuspension(Suspension suspen) {

        this.suspension.add(suspen);
    }

    public GearBox getGearBox() {
        return gearbox;
    }

    public void setGearBox(GearBox gearbox) {
        this.gearbox = gearbox;
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
