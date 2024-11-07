import java.io.*;
import java.util.*;

public class _1758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        long total = 0;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            arr.add(x);
        }

        Collections.sort(arr,Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int sum = arr.get(i) - i;

            if (sum > 0) total += sum;
        }

        System.out.println(total);

    }
}
