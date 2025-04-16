import java.io.*;
import java.util.*;

public class _2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringBuilder sb = new StringBuilder();

            int n = Integer.parseInt(br.readLine());
            Set<Integer> arr = new HashSet<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            int m = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                int x = Integer.parseInt(st.nextToken());

                if (arr.contains(x)) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }

            System.out.print(sb);
        }
    }
}