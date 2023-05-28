import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 섬의개수 {
    static int[] dx = {-1,1,0,0,-1,-1,1,1};
    static int[] dy = {0,0,-1,1,1,-1,1,-1};
    static boolean[][] visited;
    static int[][] graph;
    static int w,h;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w==0 && h==0)
                break;

            graph = new int[h][w];
            visited = new boolean[h][w];

            for (int i=0; i<h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<w; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;
            for (int i=0; i<h; i++) {
                for (int j=0; j<w; j++) {
                    if (graph[i][j]==1 && !visited[i][j]) {
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

        for (int i=0; i<8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < h && 0 <= ny && ny < w) {
                if (graph[nx][ny]==1 && !visited[nx][ny]) {
                    dfs(nx,ny);
                }
            }

        }
    }
}