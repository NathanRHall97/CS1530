//Nathan R. Hall
//Code Implemented for Extra Credit
//Shuttle.java works as the subject class in this Observer Design Pattern
import java.util.*;

import jdk.nashorn.internal.ir.Terminal;
class Shuttle{
    Terminal1 t1 = new Terminal1();
    Terminal2 t2 = new Terminal2();
    Terminal3 t3 = new Terminal3();
    Terminal4 t4 = new Terminal4(); 
    private boolean Moving = false;
    private boolean Stopped = false;
    private boolean OutOOrd = false;
    private int currentTerm = 0;

    Shuttle(boolean Mov, boolean stop, boolean OOD, int CT)
    {
        this.Moving = Mov;
        this.Stopped = stop;
        this.OutOOrd = OOD;
        this.currentTerm = CT;
        notifyAllObservers();
    }

    public void setCurrentTerminal(int setTerm)
    {
        this.currentTerm = setTerm;
        System.out.println("Shuttle at Terminal: " + setTerm);
        notifyAllObservers();
    }
    public void setMoving(boolean condition)
    {
        this.Moving = condition;
        System.out.println("Shuttle Moving = " + Moving);
        notifyAllObservers();
    }

    public void setStopped(boolean condition)
    {
        this.Stopped = condition;
        System.out.println("Shuttle Stopped = " + Stopped);
        notifyAllObservers();
    }

    public void setOutofOrder(boolean condition)
    {
        this.OutOOrd = condition;
        System.out.println("Shuttle Out of Order = " + OutOOrd);
        notifyAllObservers();
    }

    public void notifyAllObservers()
    {
        t1.update();
        t2.update();
        t3.update();
        t4.update();
    }
}