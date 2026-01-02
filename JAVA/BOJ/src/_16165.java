import java.io.*;
import java.util.*;

public class _16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, List<String>> map = new HashMap<>();

        while (n-- > 0) {
            String group = br.readLine();
            int member = Integer.parseInt(br.readLine());
            List<String> list = new ArrayList<>();

            for (int i = 0; i < member; i++) {
                list.add(br.readLine());
            }

            Collections.sort(list);
            map.put(group, list);
        }

        while (m-- > 0) {
            String name = br.readLine();
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                List<String> list = map.get(name);

                for (String memName: list) {
                    sb.append(memName + "\n");
                }
            } else if (num == 1) {
                for (String key: map.keySet()) {
                    if (map.get(key).contains(name)) {
                        sb.append(key + "\n");
                    }
                }
            }
        }

        System.out.println(sb);

    }
}
