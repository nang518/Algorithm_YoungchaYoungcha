import java.io.*;
import java.util.*;

public class _1289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            idx++;
            String s = br.readLine();
            int cnt = 0;
            int prev = 0;

            for (int i = 0; i < s.length(); i++) {
                int cur = s.charAt(i) - '0';

                if (prev != cur) {
                    cnt++;
                    prev = cur;
                }
            }
            sb.append("#" + idx + " " + cnt + "\n");
        }
        System.out.println(sb);
    }
}
