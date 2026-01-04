import java.io.*;
import java.util.*;

public class _2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> map = new LinkedHashMap<>();

        while(n-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer e = it.next();

            for (int i = 0; i < map.get(e); i++) {
                sb.append(e + " ");
            }
        }

        System.out.println(sb);
    }
}
