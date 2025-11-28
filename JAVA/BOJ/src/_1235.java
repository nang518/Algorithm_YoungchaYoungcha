import java.io.*;
import java.util.*;

public class _1235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int len = arr[0].length();

        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < n; j++) {
                set.add(arr[j].substring(len-i));
            }

            if (set.size() == n) {
                System.out.println(i);
                return;
            }
            set.clear();
        }
    }
}
