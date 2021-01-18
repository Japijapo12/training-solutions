package week12d01;

import java.util.Arrays;

public class GradeRounder {

    int[] roundGrades(int[] grades) {

        for (int i = 0; i<grades.length; i++) {

            if (grades[i] > 40) {

                 int floor = grades[i] / 5;
                 int next = (floor + 1) * 5;
                 if (next - grades[i] < 3) {
                     grades[i] = next;
                 }

            }


        }
        return grades;

    }

    public static void main(String[] args) {
        int[] result = new GradeRounder().roundGrades(new int[]{83, 87});
        System.out.println(Arrays.toString(result));
    }
}
