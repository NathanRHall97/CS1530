//Nathan R. Hall
//Code Implemented for Extra Credit
//Terminal4.java works as the concrete observer class in this Observer Design Pattern

public class Terminal4 extends Terminal{
    public Terminal4(){
        System.out.println("Terminal 4 Online");
    }

    @Override
    public void update()
    {
        System.out.println("Terminal 4 has been updated about the Shuttle. \n");
    }
}