import java.io.*;
import java.util.*;

public class _13335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            truck.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < w; i++) {
            bridge.add(0);
        }

        int time = 0, weight = 0;

        while (!bridge.isEmpty()) {
            time++;
            weight -= bridge.poll();

            if (!truck.isEmpty()) {
                if (weight + truck.peek() <= l) {
                    weight += truck.peek();
                    bridge.add(truck.poll());
                }

                else {
                    bridge.offer(0);
                }
            }
        }

        System.out.println(time);
    }
}
