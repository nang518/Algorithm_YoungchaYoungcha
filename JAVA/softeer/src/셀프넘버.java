import java.util.ArrayList;
import java.util.List;

public class 셀프넘버 {
    public static void main(String[] args) {
       List<Integer> arr= new ArrayList<>();
       List<Integer> remove = new ArrayList<>();
       for (int i=1; i<10001; i++) {
           arr.add(i);
       }

       for (int i : arr) {
           String num = String.valueOf(i);
           int sum = i;
           for (int j=0; j<num.length(); j++) {
               sum += Character.getNumericValue(num.charAt(j));
           }

           if (sum <= 10000) {
               remove.add(sum);
           }
       }

       arr.removeAll(remove);

       for (int i : arr) {
           System.out.println(i);
       }
    }
}
