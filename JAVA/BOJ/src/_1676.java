import java.io.*;
import java.math.BigInteger;

public class _1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        String s = factorial(BigInteger.valueOf(n)).toString();

        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '0') cnt++;
            else break;
        }

        System.out.println(cnt);

    }

    static BigInteger factorial(BigInteger n) {
        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= n.intValue(); i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
