import java.io.*;
import java.util.*;

public class _2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int s = 0, e = 0, sum = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            if (sum > m) {
                sum -= arr[s];
                s++;
            }
            else if (e == n) break;
            else {
                sum += arr[e];
                e++;
            }

            if (sum == m) cnt++;
        }

        System.out.println(cnt);
    }
}
