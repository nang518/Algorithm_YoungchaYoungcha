import java.io.*;

public class _9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n % 2 == 0) System.out.println("CY");
        else System.out.println("SK");
    }
}