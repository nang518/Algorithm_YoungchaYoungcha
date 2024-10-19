import java.io.*;

public class _1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            String s = br.readLine();
            String[] word = s.split("");
            idx++;
            boolean palindrome = true;

            for (int i = 0; i < s.length()/2; i++) {
                String x = word[i];
                String y = word[s.length()-i-1];

                if (!x.equals(y)) {
                    palindrome = false;
                    break;
                }
            }

            if (palindrome) {
                System.out.println("#" + idx + " " + 1);
            } else {
                System.out.println("#" + idx + " " + 0);
            }
        }
    }
}
