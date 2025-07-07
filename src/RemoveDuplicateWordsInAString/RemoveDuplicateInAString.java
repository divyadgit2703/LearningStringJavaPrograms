package RemoveDuplicateWordsInAString;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInAString {
    public static void main(String[] args) {
        String str = "hi hi hello how are you you";
        String[] words = str.split(" ");
        Set<String> set = new LinkedHashSet<>();
        for(String word:words)
        {
            set.add(word);
        }
        StringBuilder sentence = new StringBuilder();
        for(String sent:set)
        {
            StringBuilder sentence1 = new StringBuilder(sent);
            sentence.append(sentence1).append(" ");
        }
        System.out.println(sentence);

    }
}
