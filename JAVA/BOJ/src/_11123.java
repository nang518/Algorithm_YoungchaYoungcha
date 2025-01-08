import java.io.*;
import java.util.*;

public class _11123 {
    static int h,w;
    static char[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            graph = new char[h][w];
            visited = new boolean[h][w];

            int cnt = 0;

            for (int i = 0; i < h; i++) {
                String s = br.readLine();

                for (int j = 0; j < w; j++) {
                    graph[i][j] = s.charAt(j);
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (graph[i][j] == '#' && !visited[i][j]) {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < h && 0 <= ny && ny < w) {
                if (graph[nx][ny] == '#' && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
