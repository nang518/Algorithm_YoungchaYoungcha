import java.io.*;

public class _2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        if (n == 4 || n == 7) sb.append(-1).append('\n');
        else if (n % 5 == 0) sb.append(n/5).append('\n');
        else if (n % 5 == 1 || n % 5 == 3) sb.append((n/5)+1).append('\n');
        else if (n % 5 == 2 || n % 5 == 4) sb.append((n/5)+2).append('\n');

        System.out.println(sb);
    }
}