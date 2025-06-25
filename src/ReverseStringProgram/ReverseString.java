package ReverseStringProgram;

public class ReverseString {
    public static void main(String[] args) {
        String str="Problem";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Original String is "+str);
        System.out.println("Reversed String is "+rev);
    }
}
