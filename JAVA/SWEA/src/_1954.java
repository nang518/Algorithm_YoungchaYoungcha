import java.io.*;

public class _1954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];

            int r = 0, c = 0;
            int dir = 0;
            idx++;

            for (int i = 1; i <= n * n; i++) {
                arr[r][c] = i;
                if (r + dr[dir] < 0 || r + dr[dir] >= n || c + dc[dir] < 0 || c + dc[dir] >= n || arr[r + dr[dir]][c + dc[dir]] != 0) {
                    dir = (dir + 1) % 4;
                }

                r += dr[dir];
                c += dc[dir];
            }

            System.out.println("#" + idx);
            for (int i = 0; i < n; i++) {
                for (int x : arr[i]) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}