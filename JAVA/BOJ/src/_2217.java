import java.io.*;
import java.util.*;

public class _2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int result = 0;

        for (int i = 0; i < n; i++) {
            result = Math.max(result, arr[i] * (i + 1));
        }

        System.out.println(result);
    }
}
