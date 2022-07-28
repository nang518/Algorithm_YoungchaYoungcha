import java.util.*;
public class 전자레인지 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        //A:5 B:1 C:10s
        int A=0,B=0,C=0;

        if(T%10!=0)
        {
            System.out.print(-1);
        }
        else
        {
            if(T>=300)
            {
                A += T / 300;
                T -= A*300;
            }
            if(T>=60)
            {
                B += T/60;
                T -= B*60;
            }
            System.out.print(A+" "+B+" "+(T/10));
        }
    }
}