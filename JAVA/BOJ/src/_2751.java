import java.io.*;
import java.util.*;

public class _2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            sb.append(list.get(i)).append('\n');
        }

        System.out.println(sb);
    }
}