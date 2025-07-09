package CountTheNumberOfVowelsInAString;

public class NumberOfVowelsInAString {
    public static void main(String[] args) {
        String str = "user nameee";
        int count=0;
        for(int i=0;i<str.toLowerCase().length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
