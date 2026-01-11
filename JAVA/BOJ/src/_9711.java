import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class _9711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        BigInteger[] dp = new BigInteger[10001];
        dp[1] = new BigInteger("1");
        dp[2] = new BigInteger("1");

        for (int i = 3; i <= 10000; i++) {
            dp[i] = dp[i-1].add(dp[i-2]);
        }

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            sb.append("Case #" + i + ": " + dp[p].remainder(BigInteger.valueOf(q))).append("\n");
        }

        System.out.println(sb);
    }
}
