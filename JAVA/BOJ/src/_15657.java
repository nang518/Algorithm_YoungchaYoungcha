import java.io.*;
import java.util.*;

public class _15657 {
    static int n,m;
    static int[] arr,ans;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        ans = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        backTracking(0,0);
        System.out.println(sb);

    }

    static void backTracking(int idx, int depth) {
        if (depth == m) {
            for (int val : ans) {
                sb.append(val + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = idx; i < n; i++) {
            ans[depth] = arr[i];
            backTracking(i, depth + 1);
        }
    }
}
