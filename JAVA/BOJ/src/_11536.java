import java.io.*;

public class _11536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] lineup = new String[n];

        for (int i = 0; i < n; i++) {
            lineup[i] = br.readLine();
        }

        boolean increase = true;
        boolean decrease = true;

        for (int i = 0; i < n-1; i++) {
            if (lineup[i].compareTo(lineup[i+1]) > 0) increase = false;
            else if (lineup[i].compareTo(lineup[i+1]) < 0) decrease = false;
        }

        if (increase) System.out.println("INCREASING");
        else if (decrease) System.out.println("DECREASING");
        else System.out.println("NEITHER");
    }
}
