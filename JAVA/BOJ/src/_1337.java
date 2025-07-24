import java.io.*;
import java.util.*;

public class _1337 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        int[] cnt = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 5; j++) {
                if(!arr.contains(arr.get(i) + j)) {
                    cnt[i]++;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int c : cnt) {
            if (c < min) min = c;
        }

        System.out.println(min);
    }
}
