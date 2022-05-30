public class Average {
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i = 0; i<args.length; i++) //0부터 args 길이만큼 반복하면서 문자열을 정수로 변환
            sum += Integer.parseInt(args[i]); //변환된 값을 sum에 저장
        System.out.println("입력받은 인자 값의 평균은: " +(double)sum/args.length);
    }
}
