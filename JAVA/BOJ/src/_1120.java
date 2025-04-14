import java.io.*;
import java.util.*;

public class _1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int result = 50;

        for (int i = 0; i <= b.length() - a.length(); i++) {
            int cnt = 0;

            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(i+j)) cnt++;
            }

            result = Math.min(result, cnt);
        }

        System.out.println(result);
    }
}
