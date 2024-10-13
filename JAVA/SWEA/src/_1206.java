import java.io.*;
import java.util.*;

public class _1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = 10;
        int idx = 0;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            int[] building = new int[n];
            int result = 0;
            idx++;

            for (int i = 0; i < n; i++) {
                building[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 2; i < n-2; i++) {
                int max = Math.max(building[i-2], Math.max(building[i-1], Math.max(building[i+1], building[i+2])));
                if (building[i] - max > 0) result += building[i] - max;
            }

            System.out.println("#" + idx + " " + result);
        }
    }
}