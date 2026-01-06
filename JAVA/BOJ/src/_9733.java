import java.io.*;
import java.util.*;

public class _9733 {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String[] arr = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s : arr) {
            map.put(s,0);
        }

        int cnt = 0;
        String input = "";

        while((input = br.readLine()) != null && (input.length() > 0)) {
            st = new StringTokenizer(input);

            while (st.hasMoreTokens()) {
                cnt++;
                String work = st.nextToken();
                if (map.containsKey(work)) map.put(work, map.get(work)+1);
            }
        }

        for (int i = 0; i < 7; i++) {
            int x = map.get(arr[i]);
            sb.append(String.format("%s %d %.2f", arr[i], x, (double)x/cnt)).append("\n");
        }

        sb.append("Total" + " " + cnt + " " + 1.00);

        System.out.println(sb);
    }
}