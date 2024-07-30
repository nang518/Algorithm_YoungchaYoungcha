import java.io.*;
import java.util.*;

public class _9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            HashMap<String, Integer> map = new HashMap<>();

            int n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();

                String clothes = st.nextToken();

                if (map.containsKey(clothes)) {
                    map.put(clothes,map.get(clothes)+1);
                } else {
                    map.put(clothes,1);
                }
            }

            int result = 1;

            for (int val : map.values()) {
                result *= (val + 1); // 안 입는 경우 고려 +1
            }

            sb.append(result - 1).append('\n');
        }
        System.out.println(sb);
    }
}