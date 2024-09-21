import java.io.*;
import java.util.*;

public class _17845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] importance = new int[k+1];
        int[] time = new int[k+1];
        int[][] dp = new int[k+1][n+1];

        for (int i = 1; i <= k; i++) {
            st = new StringTokenizer(br.readLine());
            importance[i] = Integer.parseInt(st.nextToken());
            time[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                if (time[i] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j-time[i]] + importance[i], dp[i-1][j]);
                }

                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[k][n]);
    }
}