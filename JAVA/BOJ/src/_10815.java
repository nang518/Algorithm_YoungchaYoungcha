import java.io.*;
import java.util.*;

public class _10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            map.put(st.nextToken(), 0);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            if (map.get(st.nextToken()) != null) {
                sb.append(1 + " ");
            }

            else {
                sb.append(0 + " ");
            }
        }

        System.out.println(sb.toString());

    }
}