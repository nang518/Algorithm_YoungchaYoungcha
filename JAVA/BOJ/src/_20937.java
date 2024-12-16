import java.io.*;
import java.util.*;

public class _20937 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result = 1;
        int cnt = 1;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]) {
                cnt++;
                result = Math.max(result, cnt);
            }

            else cnt = 1;
        }

        System.out.println(result);
    }
}
