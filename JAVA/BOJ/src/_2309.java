import java.io.*;
import java.util.*;

public class _2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int x = Integer.parseInt(br.readLine());
            arr.add(x);
            sum += x;
        }

        loop1:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr.get(i) - arr.get(j) == 100) {
                    arr.remove(j); //뒤부터 삭제
                    arr.remove(i);
                    break loop1;
                }
            }
        }

        Collections.sort(arr);

        for (int val : arr) {
            System.out.println(val);
        }
    }
}
