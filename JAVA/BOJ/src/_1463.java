import java.io.*;

public class _1463 {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1];
        dp[0] = 0;
        dp[1] = 0;

        System.out.println(recur(n));
    }

    static int recur(int x) {
        if (dp[x] == null) {
            if (x % 6 == 0) dp[x] = Math.min(Math.min(recur(x / 2), recur(x / 3)), recur(x - 1)) + 1;
            else if (x % 3 == 0) dp[x] = Math.min(recur(x / 3), recur(x - 1)) + 1;
            else if (x % 2 == 0) dp[x] = Math.min(recur(x / 2), recur(x - 1)) + 1;
            else dp[x] = recur(x - 1) + 1;
        }

        return dp[x];
    }
}
