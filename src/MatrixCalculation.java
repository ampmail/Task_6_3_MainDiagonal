import java.util.Arrays;

public class MatrixCalculation {

    final static int ROW_COUNT = 9, COL_COUNT = ROW_COUNT;
    final static int RANGE_MIN = 0;
    final static int RANGE_MAX = 9;

    public static void main(String[] args) {

        int[][] myArray = new int[ROW_COUNT][COL_COUNT];
        long sumOfElements = 0;

        for (int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COL_COUNT; j++) {
                myArray[i][j] = (int) (Math.random() * (RANGE_MAX - RANGE_MIN + 1) + RANGE_MIN);
                if (j < i) {
                    sumOfElements += myArray[i][j];
                }
            }
            System.out.println(Arrays.toString(myArray[i]));
        }
        System.out.println("Сумма элементов, которые стоят до главной диагонали (не включительно), равна:" +
                +sumOfElements);
    }
}