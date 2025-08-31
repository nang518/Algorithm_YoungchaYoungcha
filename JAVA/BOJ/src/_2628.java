import java.io.*;
import java.util.*;

public class _2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] cutM = new int[m+1];
        int[] cutN = new int[n+1];

        int c = Integer.parseInt(br.readLine());

        while (c-- > 0) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (v == 0) {
                cutN[num] = 1;
            } else {
                cutM[num] = 1;
            }
        }

        int maxN = 0, maxM = 0;
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            cnt++;

            if (cutN[i] == 1 || i == n) {
                maxN = Math.max(maxN, cnt);
                cnt = 0;
            }
        }

        cnt = 0;
        for (int i = 1; i <= m; i++) {
            cnt++;

            if (cutM[i] == 1 || i == m) {
                maxM = Math.max(maxM, cnt);
                cnt = 0;
            }
        }

        System.out.println(maxN * maxM);
    }
}
