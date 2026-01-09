import java.io.*;
import java.util.*;

public class _29723 {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        int total = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String sub = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            map.put(sub,score);
        }

        for (int i = 0; i < k; i++) {
            String s = br.readLine();
            total += map.get(s);
            map.remove(s);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int minScore = total, maxScore = total;

        for (int i = 0; i < m-k; i++) {
            minScore += list.get(i);
            maxScore += list.get(list.size()-(i+1));
        }

        System.out.println(minScore + " " + maxScore);
    }
}
