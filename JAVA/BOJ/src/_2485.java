import java.io.*;
import java.util.*;

public class _2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int gcd = 0;

        for (int i = 0; i < n-1; i++) {
            int distance = arr[i+1] - arr[i];
            gcd = GCD(distance, gcd);
        }

        int result = (arr[n-1] - arr[0]) / gcd +1 - arr.length;

        System.out.println(result);
    }

    static int GCD(int x, int y) {
        if (y == 0) return x;
        else return GCD(y, x % y);
    }
}
