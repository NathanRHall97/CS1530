//Made by Nathan R. Hall
//Used to return a Created coarse texture with a random id when called

import java.util.Random;
class Coarse extends Texture{
   @Override
   public void create() {
      Random rand = new Random();
      int id = rand.nextInt(10000);       

      System.out.printf("Coarse ID: %d\n\n", id);
   }
}