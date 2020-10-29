package classstructureattributes;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        song.band = "Wolfgang Amadeus Mozart";
        song.length = 40 ;
        song.title = "K. 41. C-dúr szimfónia";

        System.out.println(song.band + " - " + song.title + " (" + song.length + " perc)");

    }
}
