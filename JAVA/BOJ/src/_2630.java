import java.io.*;
import java.util.*;

public class _2630 {
    static int[][] board;
    static int white = 0, blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0,0,n);

        System.out.println(white);
        System.out.println(blue);
    }

    static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }

    static void partition(int row, int col, int size) {
        if (colorCheck(row, col, size)) {
            if (board[row][col] == 0) {
                white++;
            } else {
                blue++;
            }

            return;
        }

        int newSize = size / 2;

        partition(row, col, newSize);
        partition(row + newSize, col, newSize);
        partition(row,  col + newSize, newSize);
        partition(row + newSize, col + newSize, newSize);
    }
}