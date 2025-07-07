package ReverseOnlyCharacterAndNumberInAnArray;

public class ReverseOnlyCharacterAndNumber {
    public static void main(String[] args) {
        String str = "#dfr%t123*";
        char[] array = str.toCharArray();
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            if (Character.isLetterOrDigit(array[i])) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            rev.append(array[i]);
        }
        System.out.println(rev);
    }
}
