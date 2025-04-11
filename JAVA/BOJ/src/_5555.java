import java.io.*;

public class _5555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String ring = br.readLine();
            ring += ring;

            if (ring.contains(s)) cnt++;
        }

        System.out.println(cnt);
    }
}
