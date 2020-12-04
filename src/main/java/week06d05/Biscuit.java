package week06d05;

public class Biscuit {

    BiscuitType biscuitType;
    int gramAmount;



    public Biscuit(BiscuitType biscuitType, int gramAmount) {
        this.biscuitType = biscuitType;
        this.gramAmount = gramAmount;
    }

    public BiscuitType getBiscuitType() {
        return biscuitType;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of(BiscuitType biscuitType, int gramAmount) {
        Biscuit biscuit = new Biscuit(biscuitType, gramAmount);
        return biscuit;


    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "biscuitType=" + biscuitType +
                ", gramAmount=" + gramAmount +
                '}';
    }



    /*public static Biscuit of(BiscuitType biscuitType, int gramAmount) {
        Biscuit biscuit = new Biscuit();
        biscuit.biscuitType = biscuitType;
        biscuit.gramAmount = gramAmount;
        return biscuit;
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "biscuitType=" + biscuitType +
                ", gramAmount=" + gramAmount +
                '}';
    }

     */
}
