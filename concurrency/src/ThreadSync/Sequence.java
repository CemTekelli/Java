package ThreadSync;

public class Sequence {
    private int value = 0;
    public synchronized int getNext(){
        // make it atomic -> not repeated values
        value++;
        return value;
    }
}
