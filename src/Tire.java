public class Tire {
    private float width;
    private float airPressure;

    public Tire(float width, float airPressure) {
        this.width = width;
        this.airPressure = airPressure;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(float airPressure) {
        this.airPressure = airPressure;
    }
}
