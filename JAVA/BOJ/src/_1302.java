import java.io.*;
import java.util.*;

public class _1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> books = new HashMap<>();
        int max = 0;
        String maxBook = "";

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String name = br.readLine();

            if (books.containsKey(name)) {
                books.put(name, books.get(name) + 1);
            } else {
                books.put(name, 1);
            }
        }

        for (String key : books.keySet()) {
            int value = books.get(key);

            if (max == value && maxBook.compareTo(key) > 0) {
                maxBook = key;
                max = value;
            }

            else if (max < value) {
                maxBook = key;
                max = value;
            }
        }

        System.out.println(maxBook);
    }
}