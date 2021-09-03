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

    public static String toFirstUCCharInWord(String s) {
        String resultS = "";
        String[] arrS = s.split(" ");
        for (int i = 0; i < arrS.length; i++) {
            resultS = resultS + arrS[i].substring(0, 1).toUpperCase() + arrS[i].substring(1) + " ";
        }
        return resultS;
    }

    public static String toFirstUCCharInSentence(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '.')
                arr[i + 2] = Character.toUpperCase(arr[i + 2]);
        }
        return String.valueOf(arr);
    }
}