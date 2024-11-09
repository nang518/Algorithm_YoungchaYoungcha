import java.io.*;
import java.util.*;

public class _2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] time = new int[101];
        int total = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start; j < end; j++) {
                time[j]++;
            }
        }

        for (int val : time) {
            if (val == 1) {
                total += val * a;
            }
            else if (val == 2) {
                total += val * b;
            }
            else if (val == 3) {
                total += val * c;
            }
        }
        System.out.println(total);
    }
}
