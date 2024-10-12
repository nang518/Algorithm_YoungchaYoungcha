import java.io.*;
import java.util.*;

public class _2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int result = 0;
            idx++;

            for (int i = 0; i < 10; i++) {
                int x = Integer.parseInt(st.nextToken());

                if (x % 2 != 0) {
                    result += x;
                }
            }

            System.out.println("#" + idx + " " + result);
        }
    }
}