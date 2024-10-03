import java.io.*;
import java.util.*;

public class _16493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] day = new int[m+1];
        int[] page = new int[m+1];
        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            day[i] = Integer.parseInt(st.nextToken());
            page[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (j-day[i] >= 0) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-day[i]] + page[i]);
                }

                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println(dp[m][n]);
    }
}
