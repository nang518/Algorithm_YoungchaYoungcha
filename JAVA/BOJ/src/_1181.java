import java.io.*;
import java.util.*;

public class _1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>(); // 중복 제거
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }

                else {
                    return s1.length() - s2.length();
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append('\n');
        }

        System.out.println(sb);
    }
}
