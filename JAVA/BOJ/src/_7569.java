import java.io.*;
import java.util.*;

class point {
    int x;
    int y;
    int z;

    public point(int z, int x, int y) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class _7569 {
    static int result,n,m,h;
    static int[][][] graph;
    static Queue<point> q = new LinkedList<>();
    static int[] dx = {-1,1,0,0,0,0};
    static int[] dy = {0,0,1,-1,0,0};
    static int[] dz = {0,0,0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        graph = new int[h][n][m];

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    graph[k][i][j] = Integer.parseInt(st.nextToken());

                    if (graph[k][i][j] == 1) q.offer(new point(k,i,j));
                }
            }
        }

        bfs();

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (graph[k][i][j] == 0) {
                        System.out.println(-1);
                        return;
                    }

                    result = Math.max(result, graph[k][i][j]);
                }
            }
        }

        if (result == 1) System.out.println(0);
        else System.out.println(result - 1); // 처음부터 익어있던 토마토가 1이었기 때문에 -1 해줘야함
    }

    static void bfs() {
        while (!q.isEmpty()) {
            point p = q.poll();
            int px = p.x;
            int py = p.y;
            int pz = p.z;

            for (int i = 0; i < 6; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];
                int nz = pz + dz[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m && 0 <= nz && nz < h) {
                    if (graph[nz][nx][ny] == 0) {
                        q.add(new point(nz,nx,ny));
                        graph[nz][nx][ny] = graph[pz][px][py] + 1;
                    }
                }
            }
        }
    }
}
