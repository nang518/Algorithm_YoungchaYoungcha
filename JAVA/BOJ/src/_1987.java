import java.io.*;
import java.util.*;

public class _1987 {
    static int r,c,result;
    static int[][] graph;
    static boolean[] visited = new boolean[26];
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        graph = new int[r][c];

        for (int i = 0; i < r; i++) {
            String s = br.readLine();

            for (int j = 0; j < c; j++) {
                graph[i][j] = s.charAt(j) - 'A';
            }
        }

        dfs(0,0,1);
        System.out.println(result);

    }

    static void dfs(int x, int y, int cnt) {
        visited[graph[x][y]] = true;
        result = Math.max(result, cnt);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < r && 0 <= ny && ny < c) {
                if (!visited[graph[nx][ny]]) {
                    dfs(nx, ny, cnt+1);
                    visited[graph[nx][ny]] = false;
                }
            }
        }
    }
}
