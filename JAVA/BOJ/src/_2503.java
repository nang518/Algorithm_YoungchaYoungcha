import java.io.*;
import java.util.*;

public class _2503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        boolean[] check = new boolean[988];

        for (int i = 123; i < 988; i++) {
            String s = Integer.toString(i);

            if (s.charAt(0) == '0' || s.charAt(1) == '0' || s.charAt(2) == '0') continue;

            if (s.charAt(0) == s.charAt(1) || s.charAt(1) == s.charAt(2) || s.charAt(0) == s.charAt(2)) continue;

            check[i] = true;
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            for (int a = 123; a < 988; a++) {
                if (check[a]) {
                    int s_cnt = 0;
                    int b_cnt = 0;

                    String sa = Integer.toString(x);

                    for (int p = 0; p < 3; p++) {
                        char c = sa.charAt(p);

                        for (int q = 0; q < 3; q++) {
                            char a_split = Integer.toString(a).charAt(q);

                            if (c == a_split && p == q) s_cnt++;
                            else if (c == a_split && p != q) b_cnt++;
                        }
                    }

                    if (s_cnt == strike && b_cnt == ball) check[a] = true;
                    else check[a] = false;
                }
            }
        }

        int result = 0;
        for (int i = 123; i < 988; i++) {
            if (check[i]) result++;
        }

        System.out.println(result);

    }
}
