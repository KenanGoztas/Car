public class Main {
    public static void main(String[] args) {

        Engine motor1 = new Engine(2, 4);
        Body bod = new Body(4);
        Brake bra = new Brake("oiled");
        Suspension susp = new Suspension(3);
        float [] getrat = {3, 4, 5};
        GearBox geBo = new GearBox (getrat, 3);
        Tire tir = new Tire(9,2);
        Wheel whe = new Wheel(5, bra, susp, tir );
        GearBoxType geBoTy = new GearBoxType("gebotype", "botype");
        Car oto1 = new Car(345, 2020, "kne24", motor1, bod, bra, susp, geBo);
        Engine motor2 = new Engine(3, 8);
        Car oto2 = new Car(876, 2021, "nğaea23", motor2, bod,bra, susp,geBo);
        oto1.addSuspension(susp); //suspension en az bir veya daha fazla olabilir

        CarModel model1 = new CarModel("passat");
        model1.addCar(oto1); // aynı araçtan aynı dononımla birden fazla nasıl üretiriz
        for( int i = 0; i<100; i++){
            model1.addCar(oto1);
        }
        model1.addCar(oto2);
        model1.showInfos();
        System.out.println();

        CarModel model2 = new CarModel("Touran");
        model2.addCar(oto1);
        model2.showInfos();





    }
}
