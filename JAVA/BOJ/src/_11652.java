import java.io.*;
import java.util.HashMap;

public class _11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> map = new HashMap<>();

        int maxCnt = 0;
        long maxCard = 0;

        while (n-- > 0) {
            long card = Long.parseLong(br.readLine());
            map.put(card, map.getOrDefault(card,0) +1);

            if (map.get(card) > maxCnt) {
                maxCnt = map.get(card);
                maxCard = card;
            }

            else if (map.get(card) == maxCnt) {
                maxCard = Math.min(card, maxCard);
            }
        }

        System.out.println(maxCard);
    }
}
