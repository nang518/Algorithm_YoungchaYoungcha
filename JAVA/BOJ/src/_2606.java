import java.io.*;
import java.util.*;

public class _2606 {
    public static int n;
    public static int m;
    public static int cnt = 0;
    public static int[][] graph;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        graph = new int[n+1][n+1];
        visited =  new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = graph[y][x] = 1;
        }

        dfs(1);
        System.out.println(cnt);
    }

    public static void dfs(int x) {
        visited[x] = true;

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[x][i] == 1) {
                cnt++;
                dfs(i);
            }
        }
    }
}
