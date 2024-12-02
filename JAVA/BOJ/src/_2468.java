import java.io.*;
import java.util.*;

public class _2468 {
    static int n,height,cnt;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Integer> result = new ArrayList<>();

        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visited = new boolean[n][n];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());

                if (graph[i][j] > max) max = graph[i][j];
            }
        }

        height = -1;

        while (true) {
            height++;
            cnt = 0;
            visited = new boolean[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && graph[i][j] > height) {
                        cnt++;
                        dfs(i,j);
                    }
                }
            }
            result.add(cnt);
            if (height == max) break;
        }

        System.out.println(Collections.max(result));
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                if (!visited[nx][ny] && graph[nx][ny] > height) {
                    dfs(nx,ny);
                }
            }
        }

    }
}
