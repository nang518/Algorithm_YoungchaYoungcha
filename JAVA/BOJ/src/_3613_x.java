import java.io.*;

public class _3613_x {
    static boolean allOfLower = true;
    static boolean whatIsLanguage = true; //true: JAVA, false: C++

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());

        if (allOfLower) { // 모든 문자가 소문자인 경우
            System.out.println(sb);
            return;
        }

        if (!(isJAVA(sb) && isCpp(sb) && check(sb))) {
            System.out.println("Error!");
            return;
        }

        if (isJAVA(sb)) sb = JAVAtoCpp(sb);
        else if (isCpp(sb)) sb = CpptoJAVA(sb);

        System.out.println(sb);
    }


    static boolean isJAVA(StringBuilder sb) {
        if (Character.isUpperCase(sb.charAt(0))) return false;
        else return true;
    }

    static boolean isCpp(StringBuilder sb) {
        if (sb.charAt(0) == '_') return false;
        else if (sb.charAt(sb.length()-1) == '_') return false;
        else if (sb.indexOf("__") >= 0) return false;

        return true;
    }

    static boolean check(StringBuilder sb) {
        boolean containUpper = false;
        boolean containUnder = false;

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (Character.isUpperCase(c)) containUpper = true;
            else if (c == '_') containUnder = true;
        }

        if (!(containUnder && containUpper)) {
            if (containUnder) return false; //C++
            else return true; //JAVA
        }
        else return false;
    }

    static StringBuilder JAVAtoCpp(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (Character.isUpperCase(c)) {
                sb.insert(i,"_");
            }
        }

        return sb;
    }

    static StringBuilder CpptoJAVA(StringBuilder sb) {
        boolean nextUpper = false;

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (nextUpper) {
                sb.append(String.valueOf(c).toUpperCase());
                nextUpper = false;
            } else {
                if (c == '_') {
                    nextUpper = true;
                    continue;
                }

                sb.append(c);
            }
        }

        return sb;
    }
}

