package PrintNonRepeatedCharacterInString;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "Dduuupllicaatee";
        int n = str.length()-1;
        for(int i=0;i<=n;i++)
        {
            boolean unique = false;
            for(int j=0;j<=n;j++)
            {
                if(i!=j&&Character.toLowerCase(str.charAt(i))==Character.toLowerCase(str.charAt(j)))
                {
                    unique = true;
                    break;
                }
            }
            if(!unique)
            System.out.println(str.charAt(i));
        }
    }
}
