package ioprintwriter.talentshow;

public class Vote {

    private long id;

    private int voteNumber;

    public Vote(long id, int voteNumber) {
        this.id = id;
        this.voteNumber = voteNumber;
    }

    public long getId() {
        return id;
    }

    public int getVoteNumber() {
        return voteNumber;
    }

    public void incNum() {
        this.voteNumber += 1;
    }
}
