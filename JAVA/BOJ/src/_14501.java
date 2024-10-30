import java.io.*;
import java.util.*;

public class _14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        int[] T = new int[n];
        int[] P = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (i + T[i] <= n) {
                dp[i+T[i]] = Math.max(dp[i]+P[i], dp[i+T[i]]);
            }

            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }

        System.out.println(dp[n]);
    }
}
