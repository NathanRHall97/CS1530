//Made by Nathan R. Hall
//Used to return a filled red color with a random id when called

import java.util.Random;
class Red extends Color{
   @Override
   public void fill() {
      Random rand = new Random();
      int id = rand.nextInt(10000);       

      System.out.printf("Red ID: %d\n\n", id);
   }
}