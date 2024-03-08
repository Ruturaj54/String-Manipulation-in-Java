

import java.util.*;

class StringProgram11
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
        int iCnt = 0,Frequency = 0;
        sobj.close();

        HashMap <Character,Integer> hobj = new HashMap<>();

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if(hobj.containsKey(Arr[iCnt]))
            {
                Frequency = hobj.get(Arr[iCnt]);
                hobj.put(Arr[iCnt],Frequency + 1);

            }
            else
            {
                hobj.put(Arr[iCnt],1);
            }
        }

       
        System.out.println(hobj);
    }
    
}
