//Created by Nathan R. Hall
//This factory producer is used to work with the AbtractFactoryTutorial.java and return a singleton factory every
//Time it is called upon
//I created this class to work
public class FactoryProducer{
    public static AbstractFactory getFactory(String factoryType) {
        if(factoryType.equals("COLOR")){
            SingletonColorFactory ColorInstance = SingletonColorFactory.getInstance();
            return ColorInstance;
        }
        else if(factoryType.equals("SHAPE")){
            SingletonShapeFactory ShapeInstance = SingletonShapeFactory.getInstance();
            return ShapeInstance;
            
        }
        else if(factoryType.equals("TEXTURE")){
            SingletonTextureFactory textureInstance = SingletonTextureFactory.getInstance();
            return textureInstance;
        }
        else{
            return null;
        }
    }
}