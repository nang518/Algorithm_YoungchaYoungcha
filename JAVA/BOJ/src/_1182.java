import java.io.*;
import java.util.*;

public class _1182 {
    static int n,s,cnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];
        cnt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(0,0);
        if (s == 0) System.out.println(cnt-1);
        else System.out.println(cnt);
    }

    static void backTracking(int depth, int sum) {
        if (depth == n) {
            if (sum == s) cnt++;
            return;
        }

        backTracking(depth + 1, sum);
        backTracking(depth + 1, sum + arr[depth]);
    }
}