import java.io.*;
import java.util.*;

public class _10211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            int[] arr = new int[n];
            int[] dp = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int max = arr[0];
            dp[0] = arr[0];

            for (int i = 1; i < n; i++) {
                dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
                max = Math.max(max, dp[i]);
            }

            sb.append(max).append('\n');
        }

        System.out.println(sb);
    }
}
