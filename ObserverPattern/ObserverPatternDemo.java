//Nathan R. Hall
//This is the observer pattern demo class needed to run the observer
//pattern for terminal and shuttle as a demo!
//This is for extra credit
//Compile this whole project with javac ObserverPatternDemo.java
//Run this project with java ObserverPatternDemo
public class ObserverPatternDemo{
    public static void main(String[] args)
    {
        boolean stop = false;
        boolean go = true;
        boolean OOD = false;
        int termNum = 1;
        Shuttle shuttle = new Shuttle(stop, go, OOD, termNum);


        System.out.println("Shuttle making a stop at terminal 2..");
        shuttle.setCurrentTerminal(2);
        shuttle.setMoving(false);
        shuttle.setStopped(true);

        System.out.println("Shuttle going from terminal 2 to terminal 3");
        shuttle.setCurrentTerminal(3);
        shuttle.setMoving(true);
        shuttle.setStopped(false);

        System.out.println("SHUTTLE HAS BROKEN DOWN OH NO!");
        shuttle.setMoving(false);
        shuttle.setStopped(true);
        shuttle.setOutofOrder(true);
    }
}