//Nathan R. Hall
//Code Implemented for Extra Credit
//Terminal3.java works as the concrete observer class in this Observer Design Pattern

public class Terminal3 extends Terminal{
    public Terminal3(){
        System.out.println("Terminal 3 Online");
    }

    @Override
    public void update()
    {
        System.out.println("Terminal 3 has been updated about the Shuttle. \n");
    }
}