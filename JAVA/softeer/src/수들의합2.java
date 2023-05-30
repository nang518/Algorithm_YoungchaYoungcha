import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수들의합2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        System.out.println(TwoPointer(arr, m));
    }

    static int TwoPointer(int[] arr, int m) {
        int cnt=0, left=0, right=0, sum=0;
        int len = arr.length;

        while (true) {
            if (sum >= m)
                sum -= arr[left++];

            else if (right >= len)
                break;

            else
                sum += arr[right++];

            if (sum == m)
                cnt++;
        }

        return cnt;
    }
}
