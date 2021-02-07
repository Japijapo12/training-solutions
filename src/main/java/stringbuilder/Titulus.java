package stringbuilder;

public enum Titulus {
    MR("Mr."), MS("Miss"), DR("Dr."), PROF("Prof.");

    private String titulusString;

    Titulus(String titulusString) {
        this.titulusString = titulusString;
    }

    public String getTitulusString() {
        return titulusString;
    }
}
