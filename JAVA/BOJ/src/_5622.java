import java.io.*;

public class _5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ('A' <= c && c <= 'C') cnt += 3;
            else if ('D' <= c && c <= 'F') cnt += 4;
            else if ('G' <= c && c <= 'I') cnt += 5;
            else if ('J' <= c && c <= 'L') cnt += 6;
            else if ('M' <= c && c <= 'O') cnt += 7;
            else if ('P' <= c && c <= 'S') cnt += 8;
            else if ('T' <= c && c <= 'V') cnt += 9;
            else if ('W' <= c && c <= 'Z') cnt += 10;
        }
        System.out.println(cnt);
    }
}
