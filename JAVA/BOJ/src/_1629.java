import java.io.*;
import java.util.*;

public class _1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer a = Integer.parseInt(st.nextToken());
        Integer b = Integer.parseInt(st.nextToken());
        Integer c = Integer.parseInt(st.nextToken());

        System.out.println(pow(a,b,c));
    }

    static Integer pow(Integer a, Integer b, Integer c) {
        if (b == 1) return a % c;
        Integer val = pow(a, b/2, c);
        val = val * val % c;
        if (b % 2 == 0) return val;
        else return val * a % c;

    }
}
