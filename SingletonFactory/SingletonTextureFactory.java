// package abstractfactoryDriver;
/*
*       SingletonColorFactory.java
*       Made by Nathan R. Hall to create a singleton instance of a shape factory and pass it into ColorFactory.java
*/
import java.util.Random;

public class SingletonTextureFactory extends AbstractFactory{
  //create an object of SingleObject
   private static SingletonTextureFactory instance = new SingletonTextureFactory();
   private static int factoryID;

   //make the constructor private so that this class cannot be
   //instantiated
   private SingletonTextureFactory(){
          Random rand = new Random();
          factoryID = rand.nextInt(10000);       
   }

   //Get the only object available
   public static SingletonTextureFactory getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.printf("Texture Factory ID: %d\n", factoryID);
   }    
   
   @Override
      public Color getColor(String colorType){
         return null;
      }   
   @Override
      public Shape getShape(String shapeType){
       return null;
      }   

   @Override
      public Texture getTexture(String textureType)
      {
        if(textureType == null){
            return null;
         }		
         if(textureType.equalsIgnoreCase("COARSE")){
            return new Coarse();      
         } else if(textureType.equalsIgnoreCase("FINE")){
            return new Fine();
         }
         return null;
      }
 
}