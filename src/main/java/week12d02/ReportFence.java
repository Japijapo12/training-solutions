package week12d02;

public class ReportFence {
    private Fence fenceType;
    private int counter;

    public ReportFence(Fence fenceType, int counter) {
        this.fenceType = fenceType;
        this.counter = counter;
    }

    public Fence getFenceType() {
        return fenceType;
    }

    public int getCount() {
        return counter;
    }
}
