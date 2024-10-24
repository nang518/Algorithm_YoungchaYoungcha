import java.io.*;
import java.util.*;

public class _3431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            idx++;
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int u = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int result = 0;

            if (x < l) result = l - x;
            else if (x > u) result = -1;
            else result = 0;

            sb.append("#" + idx + " " + result + "\n");
        }

        System.out.println(sb);
    }
}
