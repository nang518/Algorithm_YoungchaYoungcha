import java.io.*;
import java.util.*;

public class _1012_bfs {
    static int n,m;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            graph = new int[n][m];
            visited = new boolean[n][m];
            int cnt = 0;

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                graph[x][y] = 1;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (graph[i][j] == 1 && !visited[i][j]) {
                        bfs(i,j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    static void bfs(int x, int y) {
        Queue<Integer[]> q = new LinkedList<>();
        q.offer(new Integer[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Integer[] cur = q.poll();

            int a = cur[0];
            int b = cur[1];
            visited[a][b] = true;

            for (int i = 0 ; i < 4; i++) {
                int nx = a + dx[i];
                int ny = b + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                        q.offer(new Integer[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}
