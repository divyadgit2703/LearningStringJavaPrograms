package SplitStringByHypen;

public class SplitStringByHypen {
    public static void main(String[] args) {
        String str ="abc-2019";
        String[] words = str.split("-");
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
    }
}
