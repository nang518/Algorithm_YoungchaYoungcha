import java.io.*;
import java.util.*;

public class _11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] preSum = new long[n+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i-1] + Long.parseLong(st.nextToken());
        }

        while (m-- > 0) {
             st = new StringTokenizer(br.readLine());
             int i = Integer.parseInt(st.nextToken());
             int j = Integer.parseInt(st.nextToken());

             long total = preSum[j] - preSum[i-1];

             sb.append(total).append("\n");
        }

        System.out.println(sb);
    }
}
