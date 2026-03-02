import java.io.*;
import java.util.*;

public class _22864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int total_a = 0; // 피로도 합
        int total_b = 0; // 일 합
        int time = 24;

        while (time != 0) {
            if (total_a + a <= m) {
                total_a += a;
                total_b += b;
            }

            else {
                if (total_a - c < 0) total_a = 0;
                else total_a = total_a - c;
            }

            time--;
        }

        System.out.println(total_b);
    }
}