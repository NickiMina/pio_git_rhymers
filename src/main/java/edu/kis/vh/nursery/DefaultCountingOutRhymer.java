package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int flaga = -1;
    private static final int INT_12 = 12;
    private static final int INT_11 = 11;
    private int[] numbers = new int[INT_12];

    public int total = flaga;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == flaga;
    }

    public boolean isFull() {
        return total == INT_11;
    }

    protected int peekaboo() {
        if (callCheck())
            return flaga;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return flaga;
        return numbers[total--];
    }

}
