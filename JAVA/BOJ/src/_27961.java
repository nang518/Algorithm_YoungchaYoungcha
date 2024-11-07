import java.io.*;

public class _27961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long cnt = 1;
        long cat = 1;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        while (cat < n) {
            cat *= 2;
            cnt++;
        }
        System.out.println(cnt);

    }
}
