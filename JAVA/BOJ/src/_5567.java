import java.io.*;
import java.util.*;

public class _5567 {
    static int n;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(1,0);

        int result = 0;
        for (int i = 2; i < n+1; i++) {
            if (visited[i]) result++;
        }

        System.out.println(result);
    }

    static void dfs(int x, int depth) {
        if (depth == 2) return;

        for (int i = 0; i < n+1; i++) {
            if (graph[x][i] == 1) {
                visited[i] = true;
                dfs(i, depth+1);
            }
        }
    }
}