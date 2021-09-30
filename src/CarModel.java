public class CarModel {
   private String title;
   private Car araba;

   public CarModel(String title, Car araba) {
      this.title = title;
      this.araba = araba;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }
}
