import java.io.*;
import java.util.*;

public class _1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[101];
            int max = Integer.MIN_VALUE;
            int result = 0;

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 1000; i++) {
                int x = Integer.parseInt(st.nextToken());
                arr[x]++;
            }

            for (int i = 0; i < 101; i++) {
                if (max <= arr[i]) {
                    max = arr[i];
                    result = i;
                }
            }
            System.out.println("#" + n + " " + result);
        }
    }
}