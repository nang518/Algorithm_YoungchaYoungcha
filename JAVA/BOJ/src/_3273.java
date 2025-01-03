import java.io.*;
import java.util.*;

public class _3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int x = Integer.parseInt(br.readLine());

        int cnt = 0;
        int sum;
        int left = 0, right = n-1;

        while (left < right) {
            sum = arr[left] + arr[right];

            if (sum == x) cnt++;
            if (sum < x) left++;
            else right--;
        }

        System.out.println(cnt);

    }
}
