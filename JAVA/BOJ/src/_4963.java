import java.io.*;
import java.util.*;

public class _4963 {
    public static int w,h;
    public static int[][] graph;
    public static boolean[][] visited;
    public static int[] dx = {1,-1,0,0,1,1,-1,-1};
    public static int[] dy = {0,0,1,-1,1,-1,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) break;

            graph = new int[h][w];
            visited = new boolean[h][w];
            int cnt = 0;

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < w; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && graph[i][j] == 1) {
                        cnt++;
                        dfs(i, j);
                    }
                }
            }

            sb.append(cnt).append('\n');
        }

        System.out.println(sb);
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                if (!visited[nx][ny] && graph[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }
}