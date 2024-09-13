import java.io.*;
import java.util.*;

public class _15650 {
    static int n,m;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visited = new boolean[n];

        backTracking(0, 0);
        System.out.println(sb);
    }

    static void backTracking(int x, int depth) {
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = x; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i+1;
                backTracking(i+1, depth+1);
                visited[i] = false;
            }
        }
    }
}