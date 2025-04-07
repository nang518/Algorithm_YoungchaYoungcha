import java.io.*;
import java.util.*;

public class _11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> s = new ArrayList<>();

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if (command.equals("all")) {
                s.clear();

                for (int i = 1; i <= 20; i++) {
                    s.add(i);
                }
            }
            else if (command.equals("empty")) {
                s = new ArrayList<>();
            }

            while (st.hasMoreTokens()) {
                int x = Integer.parseInt(st.nextToken());

                if (command.equals("add")) {
                    if (!s.contains(x)) s.add(x);
                }

                else if (command.equals("remove")) {
                    if (s.contains(x)) {
                        int idx = s.indexOf(x);
                        s.remove(idx);
                    }
                }

                else if (command.equals("check")) {
                    if (s.contains(x)) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                }

                else if (command.equals("toggle")) {
                    if (s.contains(x)) {
                        int idx = s.indexOf(x);
                        s.remove(idx);
                    }
                    else s.add(x);
                }
            }
        }

        System.out.println(sb);
    }
}
