import java.io.*;
import java.util.*;

public class _7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> map = new HashSet<>();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();

            if (log.equals("enter")) {
                map.add(name);
            } else {
                map.remove(name);
            }
        }

        ArrayList<String> list = new ArrayList<String>(map);
        Collections.sort(list, Collections.reverseOrder());

        for (var i : list) System.out.println(i);
    }
}