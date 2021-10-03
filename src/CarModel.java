import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarModel {
   private String title;
  // private Car araba;
   private ArrayList<Car> myCarList = new ArrayList<>();

   public CarModel(String title) {

       this.title = title;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public ArrayList<Car> getCarList() {
      return myCarList;
   }
   public void addCar(Car araba) {
       myCarList.add(araba);
   }
   public void showInfos (){
      System.out.println("arabanın adı : " + this.title +"\n");
             for (Car araba: getCarList())
              System.out.println("kasası : " + araba +"\n"
              + "lisans numarası :" + araba.getLicenceNumber()
              +"\n"+ "kayıt numarası: " + araba.getRegistrationNum()
              + "\n"+ "üretim yılı : " + araba.getYear()
              + "\n"+ "motoru : " + araba.getEngine().getCapacity());
   }
}
