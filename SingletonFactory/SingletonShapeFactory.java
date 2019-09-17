// package abstractfactoryDriver;
/*
*       SingletonShapeFactory.java
*       Made by Nathan R. Hall to create a singleton instance of a shape factory and Pass it into ShapeFactory.java
*/
import java.util.Random;

public class SingletonShapeFactory extends AbstractFactory{
  //create an object of SingleObject
   private static SingletonShapeFactory instance = new SingletonShapeFactory();
   private static int factoryID;

   //make the constructor private so that this class cannot be
   //instantiated
   private SingletonShapeFactory(){
          Random rand = new Random();
          factoryID = rand.nextInt(10000);       
   }

   //Get the only object available
   public static SingletonShapeFactory getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.printf("Shape Factory ID: %d\n", factoryID);
   }    
   
   @Override
      public Color getColor(String colorType){
          return null;
      }   
   @Override
      public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
         }		
         if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();      
         } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
         } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
         }
         return null;
   
      }   

   @Override
      public Texture getTexture(String textureType)
      {
         return null;
      }
 
}