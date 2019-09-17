//Made by Nathan R. Hall
//Used to return a drawed circle with a random id when called

import java.util.Random;
public class Circle implements Shape{
   @Override
   public void draw() {
      Random rand = new Random();
      int id = rand.nextInt(10000);       

      System.out.printf("Circle ID: %d\n\n", id);
   }
}