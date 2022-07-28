import java.util.*;
public class 세탁소사장동혁 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++)
        {
            int C = scanner.nextInt();
            int Q = C/25;
            C = C%25;
            int D = C/10;
            C = C%10;
            int N = C/5;
            C = C%5;

            System.out.println(Q+" "+D+" "+N+" "+C);
        }
    }
}