package CountTotalNumberOfVowelsAndConsonants;

public class NumberOfVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "user nameee";
        String cleaned = str.toLowerCase().replaceAll("\\s+","");
        int vowels=0,consonants=0;
        for(int i=0;i<cleaned.length();i++)
        {
            char ch=cleaned.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else
            {
                consonants++;
            }
        }
        System.out.println("Total vowels count "+vowels);
        System.out.println("Total consonants count "+consonants);
    }
}
