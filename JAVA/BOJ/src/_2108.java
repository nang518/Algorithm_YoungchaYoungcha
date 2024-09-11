import java.io.*;
import java.util.*;

public class _2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);
        int avg = (int)(Math.round(sum / n));

        int cnt = 0;
        int maxCnt = -1;
        int mod = arr[0];
        boolean second = false;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]) cnt++;
            else cnt = 0;

            if (maxCnt < cnt) {
                maxCnt = cnt;
                mod = arr[i];
                second = true;
            }

            else if (maxCnt == cnt && second == true) {
                mod = arr[i];
                second = false;
            }
        }

        sb.append(avg).append('\n');
        sb.append(arr[(n-1) / 2]).append('\n');
        sb.append(mod).append('\n');
        sb.append(arr[n-1] - arr[0]).append('\n');

        System.out.println(sb);
    }
}
