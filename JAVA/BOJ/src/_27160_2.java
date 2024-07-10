import java.io.*;
import java.util.*;

public class _27160_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (map.containsKey(fruit)) {
                map.put(fruit, map.get(fruit) + num);
            } else {
                map.put(fruit, num);
            }
        }

        if (map.containsValue(5)) System.out.println("YES");
        else System.out.println("NO");
    }
}