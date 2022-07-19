import java.util.*;
public class 도비의영어공부 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            int count = 0;
            String alp = scanner.nextLine();
            if(alp.equals('#'))
                break;

            String[] sen = alp.toLowerCase().split("");
            for(int i=0; i<sen.length; i++)
            {
                if (alp.split(" ")[0].equals(sen[i]))
                    count++;
            }
            System.out.println(alp.split(" ")[0]+" "+(count-1));

        }
    }
}