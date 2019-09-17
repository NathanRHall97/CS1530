import java.util.Random;
class Blue extends Color{
   @Override
   public void fill() {
      Random rand = new Random();
      int id = rand.nextInt(10000);       

      System.out.printf("Blue ID: %d\n\n", id);
   }
}