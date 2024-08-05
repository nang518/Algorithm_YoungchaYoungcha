import java.io.*;
import java.util.*;

public class _20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String ext = st.nextToken();

            if (!map.containsKey(ext)) {
                result.add(ext);
            }
            map.put(ext, map.getOrDefault(ext, 0) + 1);
        }

        Collections.sort(result);

        for (String s : result) {
            sb.append(s + " " + map.get(s) + "\n");
        }
        System.out.println(sb);
    }
}