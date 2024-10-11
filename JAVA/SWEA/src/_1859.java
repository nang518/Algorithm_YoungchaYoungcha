import java.io.*;
import java.util.*;

public class _1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 0;
        
        while (t-- > 0) {
            idx++;
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            int[] arr = new int[n];
            int max = 0;
            long result = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = n-1; i >= 0; i--) {
                if (arr[i] > max) max = arr[i];
                result += max - arr[i];
            }

            System.out.println("#" + idx + " " + result);
        }
    }
}