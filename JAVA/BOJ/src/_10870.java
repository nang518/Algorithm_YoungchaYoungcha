import java.io.*;

public class _10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = fibonacci(n);

        System.out.println(result);
    }

    static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
