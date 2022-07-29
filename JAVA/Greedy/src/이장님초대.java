import java.util.*;
public class 이장님초대 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] t = new Integer[N];
        int result=0;
        for(int i=0; i<N; i++)
        {
            t[i] = scanner.nextInt();
        }
        Arrays.sort(t,Collections.reverseOrder());
        for(int i=0; i<N; i++)
        {
            result = Math.max(result, i+t[i]);
        }
        result += 2;
        System.out.print(result);
    }
}
