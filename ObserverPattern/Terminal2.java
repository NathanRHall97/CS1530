//Nathan R. Hall
//Code Implemented for Extra Credit
//Terminal2.java works as the concrete observer class in this Observer Design Pattern

public class Terminal2 extends Terminal{
    public Terminal2(){
        System.out.println("Terminal 2 Online");
    }

    @Override
    public void update()
    {
        System.out.println("Terminal 2 has been updated about the Shuttle. \n");
    }
}