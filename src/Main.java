public class Main {
    public static void main(String[] args) {

        Engine motor1 = new Engine(2, 4);
        Car oto1 = new Car(345, 2020, "kne24", motor1);
        CarModel model1 = new CarModel("passat");
        Engine motor2 = new Engine(3, 8);
        Car oto2 = new Car(876, 2021, "nğaea23", motor2);

        model1.addAraba(oto1); // aynı araçtan aynı dononımla birden fazla nasıl üretiriz
        for( int i = 0; i<100; i++){
            model1.addAraba(oto1);
        }
        model1.addAraba(oto2);
        model1.showInfos();
        System.out.println();




    }
}
