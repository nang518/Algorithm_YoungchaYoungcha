import java.io.*;
import java.util.*;

public class _2644 {
    static int n, end;
    static int[][] graph;
    static int[] distance;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        distance = new int[n+1];

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = graph[y][x] = 1;
        }

        dfs(start);

        if (distance[end] == 0) System.out.println(-1);
        else System.out.println(distance[end]);
    }

    static void dfs(int idx) {
        if (idx == end) return;

        for (int i = 1; i <= n; i++) {
            if (graph[idx][i] == 1 && distance[i] == 0) {
                distance[i] = distance[idx] + 1;
                dfs(i);
            }
        }
    }
}
