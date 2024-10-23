import java.io.*;
import java.util.*;

public class _1948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[] months = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            idx++;
            st = new StringTokenizer(br.readLine());
            int total = 0;

            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());


            if (m1 == m2) {
                total = d2 - d1 + 1;
            }

            else {
                for (int i = m1+1; i < m2; i++) {
                    total += months[i];
                }

                total += months[m1] - d1 + 1;
                total += d2;
            }

            sb.append("#" + idx + " " + total).append('\n');
        }
        System.out.println(sb);
    }
}
