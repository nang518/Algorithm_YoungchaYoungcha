import java.io.*;

public class _2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'c' && i < s.length() - 1) {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') i++;
            }

            else if (c == 'd' && i < s.length() - 1) {
                if (s.charAt(i + 1) == '-') i++;
                else if (s.charAt(i + 1) == 'z' && i < s.length() - 2) {
                    if (s.charAt(i + 2) == '=') i += 2;
                }
            }

            else if ((c == 'l' || c == 'n') && i < s.length() - 1) {
                if (s.charAt(i + 1) == 'j') i++;
            }

            else if ((c == 's' || c == 'z') && i < s.length() - 1) {
                if (s.charAt(i + 1) == '=') i++;
            }

            cnt++;
        }
        System.out.println(cnt);
    }
}
