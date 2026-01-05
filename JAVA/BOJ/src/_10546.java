import java.io.*;
import java.util.*;

public class _10546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for (int i = 0; i < n-1; i++) {
            String s = br.readLine();
            map.put(s, map.get(s)-1);
        }

        List<String> list = new ArrayList<>(map.keySet());

        for (String str : list) {
            if (map.get(str) == 1) System.out.println(str);
        }
    }
}
