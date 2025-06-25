package PrintDuplicateWordsInString;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsInString {
    public static void main(String[] args) {
        String str = "Hi hi how are you you";
        String[] words = str.split(" ");
        Set<String> set = new HashSet<>();
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=1;j<words.length;j++)
            {
                if(words[i].equalsIgnoreCase(words[j])&&i!=j)
                {
                    set.add(words[i]);
                }
            }
        }
        System.out.println(set);
    }
}
