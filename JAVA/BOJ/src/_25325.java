import java.io.*;
import java.util.*;

public class _25325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> map = new HashMap<>();


        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = st.nextToken();
            map.put(arr[i], 0);
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                map.put(s, map.get(s)+1);
            }
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (map.get(o1) == map.get(o2)) {
                    return o1.compareTo(o2);
                } else {
                    return -(map.get(o1) - map.get(o2));
                }
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(arr[i] + " " + map.get(arr[i]) + "\n");
        }

        System.out.println(sb);
    }
}
