import java.io.*;
import java.util.*;

public class _1012 {
    static int n,m;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int cnt = 0;

            graph = new int[n][m];
            visited = new boolean[n][m];

            for (int i = 0 ; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0;j < m; j++) {
                    if (!visited[i][j] && graph[i][j] == 1) {
                        cnt++;
                        dfs(i,j);
                    }
                }
            }

            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                if (!visited[nx][ny] && graph[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
