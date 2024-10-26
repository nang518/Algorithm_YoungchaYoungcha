import java.io.*;

public class _4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            int jCnt = 0, mCnt = 0;
            boolean dupFlag = true; //같은 글자 두번 연속 오면 안됨
            boolean alphaFlag = false; //모음 반드시 포함
            boolean sequenceFlag = true; // 모음/자음 3개 연속 안됨

            if (s.equals("end")) break;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    mCnt++;
                    jCnt = 0;
                    alphaFlag = true;

                    if (mCnt >= 3) {
                        sequenceFlag = false;
                        break;
                    }
                }

                else {
                    jCnt++;
                    mCnt = 0;

                    if (jCnt >= 3) {
                        sequenceFlag = false;
                        break;
                    }
                }

                if (i >= 1) {
                    if (s.charAt(i) != 'e' && s.charAt(i) != 'o') {
                        if (s.charAt(i) == s.charAt(i-1)) {
                            dupFlag = false;;
                        }
                    }
                }
            }

            if (sequenceFlag && dupFlag && alphaFlag) {
                sb.append("<" + s + "> is acceptable." + "\n");
            } else {
                sb.append("<" + s + "> is not acceptable." + "\n");
            }
        }
        System.out.println(sb);
    }
}