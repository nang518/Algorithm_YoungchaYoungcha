import java.io.*;
import java.util.*;

public class _1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        int idx = 0;

        while (t-- > 0) {
            idx++;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            Double[] score = new Double[n];
            double findScore = 0.0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                score[i] = (0.35 * a) + (0.45 * b) + (0.2 * c);

                if (i + 1 == k) findScore = score[i];
            }

            Arrays.sort(score, Collections.reverseOrder());

            int index = 0;

            for (int i = 0; i < n; i++) {
                if (score[i] == findScore) {
                    index = i;
                }
            }

            index = index / (n / 10);


            System.out.println("#" + idx + " " + grade[index]);
        }
    }
}
