import java.io.*;

public class _1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            idx++;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) result -= i;
                else result += i;
            }

            sb.append("#" + idx + " " + result).append("\n");
        }
        System.out.println(sb);
    }
}