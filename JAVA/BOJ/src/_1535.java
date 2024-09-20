import java.io.*;
import java.util.*;

public class _1535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] hp = new int[n+1];
        int[] joy = new int[n+1];
        int[][] dp = new int[n+1][100];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            hp[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            joy[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 99; j++) {
                if (hp[i] <= j) {
                    dp[i][j] = Math.max(dp[i-1][j-hp[i]]+joy[i], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println(dp[n][99]);
    }
}