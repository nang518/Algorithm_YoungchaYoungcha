import java.io.*;
import java.util.*;

public class _13904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        List<Node> arr = new ArrayList<>();
        int maxD = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            maxD = Math.max(maxD, d);
            arr.add(new Node(d,w));
        }

        Collections.sort(arr, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o2.w - o1.w;
            }
        });

        int result = 0;

        for (int i = maxD; i > 0; i--) {
            Node ans = new Node(0,0);

            for (Node node : arr) {
                if (node.d >= i) {
                    if (ans.w < node.w) ans = node;
                }
            }

            result += ans.w;
            arr.remove(ans);
        }

        System.out.println(result);
    }

    static class Node {
        int d,w;

        Node(int d,int w) {
            this.d = d;
            this.w = w;
        }
    }
}
