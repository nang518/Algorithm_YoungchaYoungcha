import java.io.*;

public class _14555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            idx++;
            String s = br.readLine();

            int cnt = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') cnt++;
                else if (s.charAt(i) == ')') {
                    if (i != 0) {
                        if (s.charAt(i - 1) != '(') cnt++;
                    }
                }
            }

            sb.append("#" + idx + " " + cnt + '\n');
        }
        System.out.println(sb);
    }
}
