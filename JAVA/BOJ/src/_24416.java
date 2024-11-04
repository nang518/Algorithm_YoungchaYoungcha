import java.io.*;

public class _24416 {
    static int n;
    static int[] dp;
    static int fibCnt, fibonacciCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];

        fibCnt = 0;
        fibonacciCnt = 0;

        fib(n);
        fibonacci(n);

        System.out.println(fibCnt + " " + fibonacciCnt);
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            fibCnt++;
            return 1;
        }
        else return (fib(n - 1) + fib(n - 2));
    }

    static int fibonacci(int n) {
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibonacciCnt++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}