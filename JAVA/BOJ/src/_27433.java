import java.io.*;

public class _27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long result = factorial(n);
        System.out.println(result);
    }

    static long factorial(int n) {
        if (n <= 1) return 1;

        return n * factorial(n - 1);
    }
}