import java.io.*;
import java.util.*;

public class _29160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<PriorityQueue<Integer>> arr = new ArrayList<>();

        for (int i = 0; i <= 11; i++) {
            arr.add(new PriorityQueue<>(Collections.reverseOrder()));
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            arr.get(p).offer(w);
        }

        while (k-- > 0) {
            for (int i = 1; i <= 11; i++) {
                if (arr.get(i).size() != 0) {
                    int x = arr.get(i).poll() - 1;

                    if (x > 0) arr.get(i).offer(x);
                }
            }
        }

        int result = 0;
        for (int i = 1; i <= 11; i++) {
            if (arr.get(i).size() != 0) result += arr.get(i).peek();
        }

        System.out.println(result);
    }
}
