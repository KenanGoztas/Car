public class GearBox {
    private float [] getRatio;
    private int currentGear;
    public GearBox (float[] getRatio, int currentGear){
        this.getRatio = getRatio;
        this.currentGear = currentGear;
    }

    public float[] getGetRatio() {
        return getRatio;
    }

    public void setGetRatio(float[] getRatio) {
        this.getRatio = getRatio;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
    public void shiftUp(){

    }
    public void shiftDown(){

    }
}
