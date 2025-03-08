import java.io.*;
import java.util.*;

public class _11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int x = 1, y = 1;
        int cnt = 0;

        while (cnt < k) {
            x *= n--;
            cnt++;
        }

        for (int i = 1; i <= k; i++) {
            y *= i;
        }

        System.out.println(x/y);
    }
}
