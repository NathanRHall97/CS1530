//Made by Nathan R. Hall
//Used to return a Create fine texture with a random id when called

import java.util.Random;
class Fine extends Texture{
   @Override
   public void create() {
      Random rand = new Random();
      int id = rand.nextInt(10000);       

      System.out.printf("Fine ID: %d\n\n", id);
   }
}