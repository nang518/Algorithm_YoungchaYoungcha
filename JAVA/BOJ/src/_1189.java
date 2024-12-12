import java.io.*;
import java.util.*;

public class _1189 {
    static int r,c,k,result;
    static char[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        graph = new char[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            String s = br.readLine();

            for (int j = 0; j < c; j++) {
                graph[i][j] = s.charAt(j);
            }
        }

        result = 0;
        dfs(r-1,0,1);
        System.out.println(result);
    }

    static void dfs(int x, int y, int dis) {
        visited[x][y] = true;

        if (dis == k) {
            if (x == 0 && y == c-1) {
                result++;
                return;
            }
        }

        if (dis >= k) return;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < r && 0 <= ny && ny < c) {
                if (!visited[nx][ny] && graph[nx][ny] != 'T') {
                    dfs(nx,ny,dis+1);
                    visited[nx][ny] = false;
                }
            }
        }
    }
}