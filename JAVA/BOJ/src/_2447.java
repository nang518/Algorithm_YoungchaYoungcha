import java.io.*;

public class _2447 {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        board = new char[n][n];

        star(n,0,0,false);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(board[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    static void star(int n, int x, int y, boolean blank) {
        if (blank) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    board[i][j] = ' ';
                }
            }
            return;
        }

        if (n == 1) {
            board[x][y] = '*';
            return;
        }

        int size = n / 3;
        int cnt = 0;

        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                cnt++;

                if (cnt == 5) {
                    star(size, i, j, true);
                }

                else {
                    star(size, i, j, false);
                }
            }
        }
    }
}
