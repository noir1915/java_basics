public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        char [] [] chars = new char[size][size];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (i == chars.length - 1 || i == j + 1)
                    chars[i][j] = symbol;

                if (j == i || j == chars.length - 1 - i) {
                    chars[i][j] = symbol;
                } else {
                    chars[i][j] = ' ';
                }
            }
        }
        return chars;
    }
}