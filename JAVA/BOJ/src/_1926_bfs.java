import java.io.*;
import java.util.*;

public class _1926_bfs {
    static int n,m,total,cnt,result;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cnt = 0;
                if (graph[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    bfs(i,j);
                    if (cnt > result) result = cnt;
                    total++;
                }
            }
        }

        System.out.println(total + "\n" + result);
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        visited[x][y] = true;
        q.add(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        cnt++;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
