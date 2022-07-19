import java.util.*;
public class 지각 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++)
        {
            int d = scanner.nextInt();
            int max = 1;
            while(max+ (max*max) <= d)
                max++;

            System.out.println(max-1);
        }
    }
}