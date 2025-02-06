import java.io.*;
import java.util.*;

public class _15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];
        long result = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(arr);
            long x = arr[0] + arr[1];

            arr[0] = x;
            arr[1] = x;
        }

        for (int i = 0; i < n; i++) {
            result += arr[i];
        }

        System.out.println(result);
    }
}
