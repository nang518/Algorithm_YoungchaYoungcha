import java.io.*;
import java.util.*;

public class _24460 {
    static int[][] board;
    static StringBuilder sb = new StringBuilder();

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

        System.out.println(partition(0,0,n));
    }

    static int partition(int x, int y, int size) {
        if (size == 1) {
            return board[x][y];
        }

        int newSize = size / 2;

        int[] divideSeat = new int[4];
        divideSeat[0] = partition(x, y, newSize);
        divideSeat[1] = partition(x, y + newSize, newSize);
        divideSeat[2] = partition(x + newSize, y, newSize);
        divideSeat[3] = partition(x + newSize, y + newSize, newSize);


        Arrays.sort(divideSeat);
        return divideSeat[1];
    }
}
