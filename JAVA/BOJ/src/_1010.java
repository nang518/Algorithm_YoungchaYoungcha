import java.io.*;
import java.util.*;

public class _1010 {
    static int dp[][] = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            System.out.println(factorial(m,n));
        }
    }

    static int factorial(int n, int r) {
        if (dp[n][r] > 0)
            return dp[n][r];

        if (n == r || r == 0)
            return dp[n][r] = 1;

        return dp[n][r]= factorial(n-1,r-1) + factorial(n-1,r);
    }
}