

import java.util.*;

class StringProgram12
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String here : ");
        String Str = sobj.nextLine();

        Str = Str.trim();
        Str = Str.replaceAll("\\s+","");
        Str = Str.toLowerCase();

        char Arr[] = Str.toCharArray();
        int Frequency = 0;
        sobj.close();

        HashMap <Character,Integer> hobj = new HashMap<>();


        for(char ch : Arr)
        {
            if(hobj.containsKey(ch))
            {
                Frequency = hobj.get(ch);
                hobj.put(ch,Frequency + 1);

            }
            else
            {
                hobj.put(ch,1);
            }
        }

       
        System.out.println(hobj);
    }
    
}
