import java.io.*;
import java.util.*;

public class _18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] sorted = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        int rank = 0;
        for (int val : sorted) {
            if (!map.containsKey(val)) {
                map.put(val,rank);
                rank++;
            }
        }

        for (int key : arr) {
            int val = map.get(key);
            sb.append(val).append(' ');
        }

        System.out.println(sb);
    }
}
