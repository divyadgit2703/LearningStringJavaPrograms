package ReverseOnlyLastWordOfString;

public class ReverseLastWord {
    public static void main(String[] args) {
        String str = "I love Java programming";
        String[] words = str.split(" ");
        String rev = "";
        String lastWord = words[words.length - 1];
        for (int i = lastWord.length() - 1; i >= 0; i--) {
            rev = rev + lastWord.charAt(i);
        }

        words[words.length - 1] = rev;
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sentence.append(words[i]).append(" ");
        }
        System.out.println(sentence);
    }
}
