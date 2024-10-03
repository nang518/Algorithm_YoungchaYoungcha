import java.io.*;
import java.util.*;

public class _3067 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            int[] coins = new int[n+1];
            for (int i = 1; i <= n; i++) {
                coins[i] = Integer.parseInt(st.nextToken());
            }

            int m = Integer.parseInt(br.readLine());
            int[] dp = new int[m+1];
            dp[0] = 1;

            for (int i = 1; i <= n; i++) {
                for (int j = coins[i]; j <= m; j++) {
                    dp[j] += dp[j - coins[i]];
                }
            }

            System.out.println(dp[m]);
            for (int i = 0; i <= m; i++) {
                System.out.print(dp[i] + " ");
            }
        }
    }
}
