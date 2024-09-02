import java.io.*;
import java.util.*;

public class _15873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        if (s.charAt(1) == '0') {
            System.out.println(10 + Integer.parseInt(s.substring(2)));
        } else {
            System.out.println(Integer.parseInt(s.substring(0,1)) + Integer.parseInt(s.substring(1)));
        }

    }
}