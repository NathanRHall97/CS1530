//Made by Nathan R. Hall
//Used to return drawed Rectangle Shape with a random id when called
import java.util.Random;
public class Rectangle implements Shape{
   @Override
   public void draw() {
      Random rand = new Random();
      int id = rand.nextInt(10000);       

      System.out.printf("Rectangle ID: %d\n\n", id);
   }
}