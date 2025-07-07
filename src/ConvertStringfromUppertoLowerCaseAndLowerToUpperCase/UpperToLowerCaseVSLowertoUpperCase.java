package ConvertStringfromUppertoLowerCaseAndLowerToUpperCase;

public class UpperToLowerCaseVSLowertoUpperCase {
    public static void main(String[] args) {
        String str = "Information given";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(int k=0;k<words.length;k++) {
            char[] character=words[k].toCharArray();
            for (int i = 0; i < character.length; i++) {
                if (character[i] >= 'A' && character[i] <= 'Z') {
                    character[i] = (char) (character[i] + 32);
                } else {
                    character[i] = (char) (character[i] - 32);
                }
                result.append(character[i]);
            }
            result.append(" ");
        }
        System.out.println(result);
    }
}
