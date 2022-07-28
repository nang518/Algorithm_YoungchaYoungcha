import java.util.Scanner;
public class 뒤집기 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        int zero = 0, one = 0;
        if(S.charAt(0)=='0')
            zero++;
        else
            one++;

        for(int i=1; i<S.length(); i++)
        {
            if(S.charAt(i) != S.charAt(i-1))
            {
                if(S.charAt(i) == '0')
                    zero++;
                else
                    one++;
            }
        }
        System.out.println(Math.min(zero,one));
    }
}