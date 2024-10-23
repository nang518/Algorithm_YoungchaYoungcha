import java.io.*;
import java.util.*;

public class _1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            idx++;
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            int first = 0, second = 0;
            first = p * w;

            if (w <= r) second = q;
            else second = q + (w-r) * s;

            int result = Math.min(first, second);
            sb.append("#" + idx + " " + result + "\n");
        }
        System.out.println(sb);
    }
}