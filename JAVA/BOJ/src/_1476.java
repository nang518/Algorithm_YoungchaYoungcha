import java.io.*;
import java.util.*;

public class _1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int E = 0, S = 0, M = 0;
        int year = 0;

        while (true) {
            year++;
            E++;
            S++;
            M++;

            if (E == 16) E = 1;
            if (S == 29) S = 1;
            if (M == 20) M = 1;

            if (e == E & s == S & m == M) break;
        }
        System.out.println(year);
    }
}