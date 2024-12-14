import java.io.*;
import java.util.*;

public class _14248 {
    static int n,cnt;
    static int[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        graph = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            graph[i] = Integer.parseInt(st.nextToken());
        }

        int s = Integer.parseInt(br.readLine()) - 1;
        cnt = 1;

        dfs(s);
        System.out.println(cnt);
    }

    static void dfs(int v) {
        visited[v] = true;

        int f = v - graph[v];
        int b = v + graph[v];

        if (f >= 0 && !visited[f]) {
            visited[f] = true;
            cnt++;
            dfs(f);
        }

        if (b < n && !visited[b]) {
            visited[b] = true;
            cnt++;
            dfs(b);
        }
    }
}
