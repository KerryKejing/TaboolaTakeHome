public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(stringToInt("-134"));
        System.out.println(ifContainInt("a9aa"));
    }

    // Task #1
    public static int stringToInt(String s) {
        int i = 0;
        int num = 0;
        int len = s.length();
        boolean isNeg = false;
        if(s.charAt(0) == '-') {
            isNeg = true;
            i = 1;
        }
        while(i < len) {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }
        return isNeg ? -num : num;
    }

    // Task #2
    public static boolean ifContainInt(String s) {
        if (s == null || s.length() == 0 ) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 48 && c <= 57) {
                return true;
            }
        }
        return false;
    }
}
