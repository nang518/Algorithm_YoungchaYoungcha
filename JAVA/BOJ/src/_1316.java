import java.io.*;

public class _1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            boolean[] check = new boolean[26];
            boolean group = true;

            for (int j = 0; j < s.length(); j++) {
                int c = s.charAt(j) - 'a';

                if (check[c]) {
                    if (c != s.charAt(j - 1) - 'a') {
                        group = false;
                        break;
                    }
                }

                else {
                    check[c] = true;
                }
            }

            if (group) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}