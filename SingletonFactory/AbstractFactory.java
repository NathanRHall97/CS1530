/*
 * 
 * Nathan R. Hall
 * Added in a getTexture method for the abstract factory
 * 
 */
// package abstractfactoryDriver;

/**
 *
 * @author sohel
 */
public abstract class AbstractFactory {
  //  private static long VIN; 
    public abstract Shape getShape(String colorType);
    public abstract Color getColor(String shapeType); 
    public abstract Texture getTexture(String textureType);
    public void showMessage(){};
}
