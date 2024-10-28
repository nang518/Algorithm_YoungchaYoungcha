import java.io.*;
import java.util.*;

public class _9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] graph = new int[2][n];
            int[][] dp = new int[2][n];

            for (int i = 0; i < 2; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < n; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][0] = graph[0][0];
            dp[1][0] = graph[1][0];
            int max = Math.max(dp[0][0], dp[1][0]);

            for (int i = 1; i < n; i++) {
                if (i==1) {
                    dp[0][i] = dp[1][0] + graph[0][1];
                    dp[1][i] = dp[0][0] + graph[1][1];
                    max = Math.max(dp[0][i], dp[1][i]);
                    continue;
                }

                dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + graph[0][i];
                dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + graph[1][i];
                max = Math.max(max, Math.max(dp[0][i], dp[1][i]));
            }
            sb.append(max + "\n");
        }
        System.out.println(sb);
    }
}
