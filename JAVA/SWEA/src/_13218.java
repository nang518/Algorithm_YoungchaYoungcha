import java.io.*;

public class _13218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            idx++;
            int n = Integer.parseInt(br.readLine());

            int result = n / 3;
            sb.append("#" + idx + " " + result + "\n");
        }
        System.out.println(sb);
    }
}
