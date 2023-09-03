import java.util.Arrays;

public class TwoDimensionalArray {
    public static final char SYMBOL = 'X';
    public static final char SPACE = ' ';
    public static char[][] getTwoDimensionalArray(int size) {
        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i == array.length - 1 || i == j + 1)
                    array[i][j] = SYMBOL;

                if (j == i || j == array.length - 1 - i) {
                    array[i][j] = SYMBOL;
                } else {
                    array[i][j] = SPACE;
                }
            }
        }
        return array;
    }
}
