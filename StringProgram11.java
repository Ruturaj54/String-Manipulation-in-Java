

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

        int Frequency[] = new int[26];
    

        for(int iCnt = 0;iCnt < Frequency.length;iCnt++)
        {
            Frequency[((int)Arr[iCnt]) - 'a']++;
        }

        System.out.println("Frequency of each letter is : ");

        for(int iCnt = 0;iCnt < Frequency.length;iCnt++)
        {
            if(Frequency[iCnt] != 0)
            {
                System.out.println((char)(iCnt+'a')+" occurs "+Frequency[iCnt]+" times");
            }
        }

        sobj.close();

        //System.out.println(Str);
    }
    
}
