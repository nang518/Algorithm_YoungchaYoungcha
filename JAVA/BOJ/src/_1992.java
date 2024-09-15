import java.io.*;
import java.util.*;

public class _1992 {
    static int[][] board;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < n; j++) {
                board[i][j] = str.charAt(j) - '0';
            }
        }

        quadTree(0, 0, n);
        System.out.println(sb);
    }

    static boolean check(int x, int y, int size) {
        int value = board[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (board[i][j] != value) {
                    return false;
                }
            }
        }

        return true;
    }

    static void quadTree(int x, int y, int size) {
        if (check(x, y, size)) {
            sb.append(board[x][y]);
            return;
        }

        int newSize = size / 2;

        sb.append('(');

        quadTree(x, y, newSize);
        quadTree(x, y + newSize, newSize);
        quadTree(x + newSize, y, newSize);
        quadTree(x + newSize, y + newSize, newSize);

        sb.append(')');
    }
}
