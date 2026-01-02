import java.io.*;
import java.util.*;

public class _17264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());

        int total = 0;
        ArrayList<String> winName = new ArrayList();
        ArrayList<String> loseName = new ArrayList();
        boolean winorlose = false;

        while (p-- > 0) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String result = st.nextToken();

            if (result.equals("W")) {
                winName.add(name);
            }
            else {
                loseName.add(name);
            }
        }

        while (n-- > 0) {
            String s = br.readLine();

            if (winName.contains(s)) total += w;
            else total -= l;

            if (total < 0) total = 0;

            if (total >= g) {
                winorlose = true;
                break;
            }
        }

        if (winorlose) System.out.println("I AM NOT IRONMAN!!");
        else System.out.println("I AM IRONMAN!!");
    }
}
