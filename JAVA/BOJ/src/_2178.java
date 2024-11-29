import java.io.*;
import java.util.*;

public class _2178 {
    static int n,m;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static boolean[][] visited;
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < m; j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0,0);
        System.out.println(graph[n-1][m-1]);
    }

    static void bfs(int x, int y) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{x, y});
        visited[x][y] = true;

        while (!que.isEmpty()) {
            int[] cur = que.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (!visited[nx][ny] && graph[nx][ny] != 0) {
                        que.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        graph[nx][ny] = graph[cur[0]][cur[1]] + 1;
                    }
                }
            }
        }

    }
}
