package FindTheOccuranceOFEachCharacterInAString;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OccurancesOfEachCharacter {
    public static void main(String[] args) {
        String str = "DDiiIvya";
        char[] character = str.toLowerCase().toCharArray();
        Map<Character,Integer> DupMap = new HashMap<>();
for (char ch:character)
{

    if(DupMap.containsKey(ch))
    {
        DupMap.put(ch,DupMap.get(ch)+1);
    }
    else
    {
        DupMap.put(ch,1);
    }
}
for(Map.Entry<Character,Integer> entry:DupMap.entrySet())
{
    System.out.println(entry.getKey()+":"+entry.getValue());
}
int max = Collections.max(DupMap.values());
System.out.println("Maximum character occurance");
        for(Map.Entry<Character,Integer> entry:DupMap.entrySet())
        {
            if(entry.getValue()==max)
            {
                System.out.println(entry.getKey()+":"+entry.getValue());

            }
        }
    }
}
