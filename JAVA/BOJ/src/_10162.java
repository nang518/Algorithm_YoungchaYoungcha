import java.io.*;

public class _10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int a = 0, b = 0, c = 0;

        if (t % 10 != 0) {
            System.out.println(-1);
        }

        else {
            if (t >= 300) {
                a = t / 300;
                t -= a * 300;
            }

            if (t >= 60) {
                b = t / 60;
                t -= b * 60;
            }

            System.out.println(a + " " + b + " " + t / 10);
        }
    }
}