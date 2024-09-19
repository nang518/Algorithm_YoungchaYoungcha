import java.io.*;
import java.util.*;

public class _2667 {
    static int n,cnt;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(s.charAt(j) + "");
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && graph[i][j] == 1) {
                    cnt = 0;
                    dfs(i,j);
                    result.add(cnt);
                }
            }
        }

        Collections.sort(result);

        for(int val : result) {
            sb.append(val).append('\n');
        }

        System.out.println(result.size());
        System.out.println(sb);
    }

    static void dfs(int x, int y) {
        cnt++;
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                if (!visited[nx][ny] && graph[nx][ny] == 1) {
                    dfs(nx,ny);
                }
            }
        }
    }
}