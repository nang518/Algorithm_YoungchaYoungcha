/*
import java.util.*;
public class 오셀로재배치 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++)
        {
            int N = scanner.nextInt();
            for(int j=0; j<N; j++)
            {
                String input = scanner.next();
                String target = scanner.next();

                int cnt=0;
                int W_cnt=0, B_cnt=0;

                for(int k=0; k<target.length(); k++)
                {
                    if(input.charAt(k) != target.charAt(k))
                    {
                        if(input.charAt(k) == 'W')
                            W_cnt++;
                        else
                            B_cnt++;
                    }
                }
                cnt += Math.min(W_cnt,B_cnt) + Math.abs(W_cnt - B_cnt);
                System.out.print(cnt);
            }
        }
    }
}
 */