import java.util.*;
public class 잃어버린괄호 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("-");
        int sum = Integer.MAX_VALUE;
        for(int i=0; i<str.length; i++)
        {
            int temp = 0;
            String[] add = str[i].split("\\+");

            for(int j=0; j<add.length; j++)
            {
                temp += Integer.parseInt(add[j]);
            }

            if(sum == Integer.MAX_VALUE)
                sum = temp;
            else
                sum -= temp;
        }
        System.out.print(sum);
    }
}