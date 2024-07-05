import java.io.*;

public class _16674 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int one = 0, two = 0, zero = 0, eight = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != '2' && c != '0' && c != '1' && c != '8') {
                System.out.println(0);
                System.exit(0);
            }

            if (c == '2') two++;
            if (c == '0') zero++;
            if (c == '1') one++;
            if (c == '8') eight++;
        }

        if (two == 0 || zero == 0 || one == 0 || eight == 0) {
            System.out.println(1);
            System.exit(0);
        }
        if (two == zero && zero == one && one == eight) {
            System.out.println(8);
        } else {
            System.out.println(2);
        }
    }
}