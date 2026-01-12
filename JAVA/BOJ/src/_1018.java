import java.io.*;
import java.util.*;

public class _1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] arr = new boolean[n][m];
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == 'W') arr[i][j] = true;
                else arr[i][j] = false;
            }
        }

        for (int i = 0; i < n-7; i++) {
            for (int j = 0; j < m-7; j++) {
                int cnt = 0;
                boolean color = arr[i][j];

                for (int x = i; x < i+8; x++) {
                    for (int y = j; y < j+8; y++) {
                        if (arr[x][y] != color) cnt++;
                        color = !color;
                    }

                    color = !color;
                }

                cnt = Math.min(cnt, 64-cnt);
                result = Math.min(result, cnt);
            }
        }


        System.out.println(result);
    }
}
