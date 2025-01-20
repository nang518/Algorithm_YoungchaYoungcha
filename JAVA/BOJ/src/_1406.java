import java.io.*;
import java.util.*;

public class _1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Stack<Character> Lstk = new Stack<>();
        Stack<Character> Rstk =  new Stack<>();

        String s = br.readLine();
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < s.length(); i++) {
            Lstk.push(s.charAt(i));
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            char command = st.nextToken().charAt(0);

            if (command == 'P') {
                char c = st.nextToken().charAt(0);

                Lstk.push(c);
            }

            else if (command == 'L') {
                if (!Lstk.isEmpty()) {
                    Rstk.push(Lstk.pop());
                }
            }

            else if (command == 'D') {
                if (!Rstk.isEmpty()) {
                    Lstk.push(Rstk.pop());
                }
            }

            else if (command == 'B') {
                if (!Lstk.isEmpty()) {
                    Lstk.pop();
                }
            }
        }

        while (!Rstk.isEmpty()) {
            Lstk.push(Rstk.pop());
        }

        for (int i = 0; i < Lstk.size(); i++) {
            sb.append(Lstk.get(i));
        }
        System.out.println(sb);
    }
}
