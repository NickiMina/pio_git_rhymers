package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int INT = -1;
    private static final int INT1 = 12;
    private int[] numbers = new int[INT1];

    public int total = INT;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INT;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INT;
        return numbers[total--];
    }

}
