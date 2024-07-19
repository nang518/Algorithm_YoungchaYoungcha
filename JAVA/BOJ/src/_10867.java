import java.io.*;
import java.util.*;

public class _10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> a = new HashSet<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());


        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        // hashset 정렬
        ArrayList<Integer> b = new ArrayList<>(a);
        Collections.sort(b);

        for (int i : b) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
