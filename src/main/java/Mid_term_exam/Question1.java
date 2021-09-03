package Mid_term_exam;


public class Question1 {
    public static int sumUpperCaseWord(String s) {
        char[] arr = s.toCharArray();
        int sumWord = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                sumWord++;
            }
        }
        return sumWord;
    }

    public static String upperFirstChar(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.toString(arr[i]).equals(" ")) {
                if (Character.isLetter(arr[i + 1])) {
                    arr[i + 1] = Character.toUpperCase(arr[i + 1]);
                }
            }
        }
        return s;
    }

    public static String uppercaseCharAfterDot(String s) {
        char[] arr = s.toCharArray();
        do {
            if(Character.isLetter(arr[0]))
        } while (arr[i])
        return s;
    }
}