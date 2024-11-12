import java.io.*;
import java.util.*;

public class _1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = 10;
        int idx = 0;

        while (t-- > 0) {
            idx++;
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[100];
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 100; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n; i++) {
                Arrays.sort(arr);
                arr[0]++;
                arr[99]--;
            }

            Arrays.sort(arr);
            int result = arr[99] - arr[0];

            sb.append("#" + idx + " " + result + "\n");
        }
        System.out.println(sb);
    }
}
