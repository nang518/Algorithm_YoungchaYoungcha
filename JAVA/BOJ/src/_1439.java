import java.io.*;
import java.util.*;

public class _1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int cnt = 0;
        char word = str.charAt(0);

        for (int i = 1; i<str.length(); i++) {
            if (word != str.charAt(i)) {
                word = str.charAt(i);
                cnt++;
            }
        }

        System.out.println((cnt+1)/2);
    }
}