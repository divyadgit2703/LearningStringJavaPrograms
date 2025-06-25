package ReverseEachWordInString;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hi Hello How are you";
        String[] words = str.split(" ");
        StringBuilder rev = new StringBuilder();
        for(String word:words)
        {
            StringBuilder reversed = new StringBuilder(word);
            rev.append(reversed.reverse()).append(" ");
        }
        System.out.println(rev);
    }
}
