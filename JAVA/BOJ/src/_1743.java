import java.io.*;
import java.util.*;

public class _1743 {
    static int n,m,cnt;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        graph = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph[r][c] = 1;
        }

        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (!visited[i][j] && graph[i][j] == 1) {
                    cnt = 0;
                    dfs(i,j);

                    if (result < cnt) result = cnt;
                }
            }
        }

        System.out.println(result);
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 < nx && nx <= n && 0 < ny && ny <= m) {
                if (!visited[nx][ny] && graph[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
