import java.io.*;

public class _1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt;

        if (n < 100)  {
            cnt = n;
        }

        else {
            cnt = 99;

            for (int i = 100; i <= n; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if (hun - ten == ten - one) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
