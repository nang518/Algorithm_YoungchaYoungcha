import java.io.*;
import java.util.*;

public class _15953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = 0;

            if (a == 1) result += 500;
            else if (2 <= a && a < 4) result += 300;
            else if (4 <= a && a < 7) result += 200;
            else if (7 <= a && a < 11) result += 50;
            else if (11 <= a && a < 16) result += 30;
            else if (16 <= a && a < 22) result += 10;

            if (b == 1) result += 512;
            else if (2 <= b && b < 4) result += 256;
            else if (4 <= b && b < 8) result += 128;
            else if (8 <= b && b < 16) result += 64;
            else if (16 <= b && b < 32) result += 32;

            if (result == 0) System.out.println(0);
            else System.out.println(result + "0000");
        }
    }
}