import java.io.*;
import java.util.*;

public class _1871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(0);
            return;
        }

        st = new StringTokenizer(br.readLine());

        int weight = m, cnt = 1;

        while(n-- > 0) {
            int cur = Integer.parseInt(st.nextToken());

            if (weight - cur >= 0) {
                weight -= cur;
            } else {
                cnt++;
                weight = m - cur;
            }
        }

        System.out.println(cnt);
    }
}
