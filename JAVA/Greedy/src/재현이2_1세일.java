import java.util.*;
public class 재현이2_1세일 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer C[] = new Integer[N];
        for(int i=0; i<N; i++)
        {
            C[i] = scanner.nextInt();
        }
        Arrays.sort(C,Comparator.reverseOrder());

        int sum = 0;
        for(int i=0; i<N; i++)
        {
            if(i%3==2)
                continue;
            else
            {
                sum += C[i];
            }
        }
        System.out.print(sum);
    }
}