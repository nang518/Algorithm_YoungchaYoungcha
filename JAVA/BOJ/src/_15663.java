import java.io.*;
import java.util.*;

public class _15663 {
    static int n,m;
    static int[] arr,ans;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        ans = new int[m];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        backTracking(0);
        System.out.println(sb);
    }

    static void backTracking(int depth) {
        if (depth == m) {
            for (int val : ans) {
                sb.append(val + " ");
            }
            sb.append("\n");
            return;
        }

        int before = 0;
        for (int i = 0; i < n; i++) {
            if (before != arr[i] && !visited[i]) {
                visited[i] = true;
                ans[depth] = arr[i];
                before = arr[i];
                backTracking(depth + 1);
                visited[i] = false;
            }

        }
    }
}