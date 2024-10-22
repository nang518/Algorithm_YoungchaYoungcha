import java.io.*;
import java.util.*;

public class _1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            idx++;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[][] map = new int[n][n];
            int cnt = 0;
            int total = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            //행 카운팅
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 1) cnt++;
                    else if (cnt >= 1 && map[i][j] == 0) {
                        if (cnt == k) total++;
                        cnt = 0;
                    }
                }

                if (cnt == k) total++;
                cnt = 0;
            }

            //열 카운팅
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[j][i] == 1) cnt++;
                    else if (cnt >= 1 && map[j][i] == 0) {
                        if (cnt == k) total++;
                        cnt = 0;
                    }
                }
                if (cnt == k) total++;
                cnt = 0;
            }

            sb.append("#" + idx + " " + total).append('\n');
        }
        System.out.println(sb);
    }
}
