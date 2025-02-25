import java.io.*;

public class _14495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] dp = new long[117];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-3];
        }

        System.out.println(dp[n]);
    }
}
