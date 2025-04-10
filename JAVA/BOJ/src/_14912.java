import java.io.*;
import java.util.*;

public class _14912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (i == d) cnt++;

            if (i >= 10) {
                String s = Integer.toString(i);
                char d_char = Character.forDigit(d, 10);

                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);

                    if (c == d_char) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
