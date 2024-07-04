import java.io.*;

public class _1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int cnt = 0;
        char word = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (word != s.charAt(i)) {
                cnt++;
                word = s.charAt(i);
            }
        }

        System.out.println((cnt + 1) / 2);
    }
}