import java.io.*;

public class _15941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            idx++;
            int n = Integer.parseInt(br.readLine());

            sb.append("#" + idx + " " + n*n + "\n");
        }
        System.out.println(sb);
    }
}
