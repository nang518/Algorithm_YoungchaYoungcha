import java.io.*;
import java.util.*;

public class _1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = s.length();
        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(s.charAt(i));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (char c : arr) {
            System.out.print(c);
        }
    }
}
