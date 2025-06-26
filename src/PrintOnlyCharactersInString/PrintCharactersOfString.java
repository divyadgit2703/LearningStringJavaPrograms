package PrintOnlyCharactersInString;

public class PrintCharactersOfString {
    public static void main(String[] args) {
        String str = "Hihow654@are";
        StringBuilder result = new StringBuilder();
        for(char ch:str.toCharArray())
        {
            if(Character.isLetter(ch))
                result.append(ch);
        }
        System.out.println(result);

    }
}
