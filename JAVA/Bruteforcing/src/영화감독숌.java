import java.util.*;
public class 영화감독숌 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int num = 666;
        int count = 1;

        while(count != N)
        {
            num++;
            if(String.valueOf(num).contains("666"))
                count++;
        }
        System.out.print(num);
    }
}