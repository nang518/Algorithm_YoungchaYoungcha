import java.io.*;
import java.util.*;

public class _7562 {
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {2,1,-2,-1,-2,-1,2,1};
    static int[] dy = {1,2,1,2,-1,-2,-1,-2};
    static int i;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            i = Integer.parseInt(br.readLine());

            graph = new int[i][i];
            visited = new boolean[i][i];

            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            bfs(x1,y1);
            System.out.println(graph[x2][y2]);
        }
    }

    static void bfs(int x1, int y1) {
        visited[x1][y1] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x1, y1});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int k = 0; k < 8; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx >= 0 && nx < i && ny >= 0 && ny < i) {
                    if (!visited[nx][ny] && graph[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        graph[nx][ny] = graph[x][y] + 1;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}