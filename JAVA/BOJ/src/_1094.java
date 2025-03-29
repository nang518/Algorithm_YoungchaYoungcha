import java.io.*;

public class _1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int cnt = 0;
        int stick = 64;

        while (x > 0) {
            if (stick > x) {
                stick /= 2;
            }

            else {
                x -= stick;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
