public class Main {
    public static void main(String[] args) {

        Engine motor1 = new Engine(2, 4);
        Car oto1 = new Car(345, 2020, "kne24", motor1);
        CarModel model1 = new CarModel("passat", oto1);
        Engine motor2 = new Engine(3, 8);
        Car oto2 = new Car(876, 2021, "nğaea23", motor2);
        CarModel model2 = new CarModel("a4", oto2);
        //nesneler ile diğer classlara ulaşamıyorum??

    }
}
