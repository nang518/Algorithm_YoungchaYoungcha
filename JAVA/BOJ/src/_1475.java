import java.io.*;
import java.util.*;

public class _1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] arr = new int[10];

        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0';

            if (n == 9) arr[6]++;
            else arr[n]++;
        }

        if (arr[6] % 2 == 0) arr[6] /= 2;
        else arr[6] = arr[6] / 2 + 1;

        int max = 0;

        for (int i = 0; i < 10; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}
