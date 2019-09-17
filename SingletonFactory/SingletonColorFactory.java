// package abstractfactoryDriver;
/*
*       SingletonColorFactory.java
*       Made by Nathan R. Hall to create a singleton instance of a shape factory and pass it into ColorFactory.java
*/
import java.util.Random;

public class SingletonColorFactory extends AbstractFactory{
  //create an object of SingleObject
   private static SingletonColorFactory instance = new SingletonColorFactory();
   private static int factoryID;

   //make the constructor private so that this class cannot be
   //instantiated
   private SingletonColorFactory(){
          Random rand = new Random();
          factoryID = rand.nextInt(10000);       
   }

   //Get the only object available
   public static SingletonColorFactory getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.printf("Color Factory ID: %d\n", factoryID);
   }    
   
   @Override
      public Color getColor(String colorType){
        if(colorType == null){
            return null;
         }		
         if(colorType.equalsIgnoreCase("BLUE")){
            return new Blue();      
         } else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();
         } else if(colorType.equalsIgnoreCase("RED")){
            return new Red();
         }
         return null;
      }   
   @Override
      public Shape getShape(String shapeType){
       return null;
      }   

   @Override
      public Texture getTexture(String textureType)
      {
         return null;
      }
 
}