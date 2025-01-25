import java.io.*;
import java.util.*;

public class _2435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int result = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i <= n-k; i++) {
            int x = 0;
            for (int j = 0; j < k; j++) {
                x += arr[i+j];
            }

            result = Math.max(result, x);
        }

        System.out.println(result);
    }
}
