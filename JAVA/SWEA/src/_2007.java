import java.io.*;

public class _2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int idx = 0;

        while (t-- > 0) {
            idx++;
            String s = br.readLine();
            int cnt = 0;

            for (int i = 2; i < s.length()/2; i++) {
                if (s.substring(0,i).equals(s.substring(i,i*2))) {
                    cnt = i;
                    break;
                }
            }

            System.out.println("#" + idx + " " + cnt);
        }
    }
}
