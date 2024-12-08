import java.io.*;
import java.util.*;

public class _3187 {
    static int r,c,sheep,wolf;
    static char[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        graph = new char[r][c];
        visited = new boolean[r][c];
        int totalSheep = 0, totalWolf = 0;

        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                graph[i][j] = s.charAt(j);

                if (graph[i][j] == 'k') totalSheep++;
                if (graph[i][j] == 'v') totalWolf++;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!visited[i][j] && graph[i][j] != '#') {
                    wolf = 0;
                    sheep = 0;
                    dfs(i,j);

                    if (wolf >= sheep) totalSheep -= sheep;
                    else totalWolf -= wolf;
                }
            }
        }

        System.out.println(totalSheep + " " + totalWolf);
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        if (graph[x][y] == 'k') sheep++;
        else if (graph[x][y] == 'v') wolf++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < r && 0 <= ny && ny < c) {
                if (!visited[nx][ny] && graph[nx][ny] != '#') {
                    dfs(nx,ny);
                }
            }
        }
    }
}
