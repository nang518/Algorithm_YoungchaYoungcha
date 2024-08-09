import java.io.*;
import java.util.*;

public class _25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> member = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String chat = br.readLine();

            if (chat.equals("ENTER")) {
                cnt += member.size();
                member = new HashSet<>();
            }

            else {
                if (!member.contains(chat)) {
                    member.add(chat);
                }
            }
        }
        cnt += member.size();

        System.out.println(cnt);
    }
}
