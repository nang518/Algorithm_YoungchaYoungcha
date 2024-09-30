import java.io.*;
import java.util.*;

public class _5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int[] math = new int[n];

            for (int j = 0; j < n; j++) {
                math[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(math);

            int max = math[n-1];
            int min = math[0];
            int gap = 0;

            for (int j = 0; j < n-1; j++) {
                gap = Math.max(gap, math[j+1] - math[j]);
            }

            System.out.println("Class " + (i+1));
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + gap);
        }
    }
}