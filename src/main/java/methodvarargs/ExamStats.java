package methodvarargs;

//Vizsga statisztika


public class ExamStats {

    private double maxPoints;


        public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

        // küszöbérték megadása százalékban
        //kiszámítja a küszöbérték feletti eredmények számát
    public int getNumberOfTopGrades(int limitInPercent, int... results) {

        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number or results must not be empty!");
        }

        int count = 0;
        for (int result : results) {
            if (result >= maxPoints * limitInPercent / 100) {
                count++;
            }
        }
        return count;
    }

        // alsó küszöbérték alatt: bukott-e meg valaki
    public boolean hasAnyFailed(int limitInPercent, int... results){

        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number or results must not be empty!");
        }

        for (int result : results) {
            if (result < maxPoints * limitInPercent / 100) {
               return true;
            }
        }
        return false;
    }
}
