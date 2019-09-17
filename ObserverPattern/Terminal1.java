//Nathan R. Hall
//Code Implemented for Extra Credit
//Terminal1.java works as the concrete observer class in this Observer Design Pattern

public class Terminal1 extends Terminal{
    public Terminal1(){
        System.out.println("Terminal 1 Online");
    }

    @Override
    public void update()
    {
        System.out.println("Terminal 1 has been updated about the Shuttle. \n");
    }
}