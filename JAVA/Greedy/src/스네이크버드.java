import java.util.*;
public class 스네이크버드 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int h[] = new int[N];
        for(int i=0; i<N; i++)
        {
            h[i]= scanner.nextInt();
        }
        Arrays.sort(h);
        for(int i=0; i<h.length; i++)
        {
            if(L>=h[i])
                L+=1;
        }
        System.out.print(L);
    }
}