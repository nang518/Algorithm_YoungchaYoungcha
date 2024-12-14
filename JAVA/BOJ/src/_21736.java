import java.io.*;
import java.util.*;

public class _21736 {
    static int n,m,cnt;
    static char[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = s.charAt(j);
            }
        }

        cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 'I' && !visited[i][j]) {
                    dfs(i,j);
                }
            }
        }

        if (cnt == 0) System.out.println("TT");
        else System.out.println(cnt);

    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        if (graph[x][y] == 'P') cnt++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                if (graph[nx][ny] != 'X' && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }

    }
}
