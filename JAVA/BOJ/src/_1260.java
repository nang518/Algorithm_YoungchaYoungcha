import java.io.*;
import java.util.*;

public class _1260 {
    public static int n;
    public static int m;
    public static int v;
    public static int[][] graph;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();
    public static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        graph = new int[n+1][n+1];
        visit =  new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = graph[y][x] = 1;
        }

        dfs(v);
        visit =  new boolean[n+1];
        sb.append('\n');
        bfs(v);
        System.out.println(sb);
    }

    public static void dfs(int num) {
        visit[num] = true;
        sb.append(num).append(" ");

        for (int i = 0; i <= n; i++) {
            if (!visit[i] && graph[num][i] == 1) {
                dfs(i);
            }
        }
    }

    public static void bfs(int num) {
        queue.add(num);
        visit[num] = true;
        sb.append(num).append(" ");

        while(!queue.isEmpty()) {
            int idx = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (!visit[i] && graph[idx][i] == 1) {
                    queue.add(i);
                    visit[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }
    }
}
