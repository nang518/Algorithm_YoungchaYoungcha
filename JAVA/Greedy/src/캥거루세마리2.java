import java.util.*;
public class 캥거루세마리2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            int max = Math.max((B-A),(C-B));
            System.out.println(max-1);
        }
    }
}