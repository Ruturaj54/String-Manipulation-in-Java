

import java.util.*;

class StringProgram7
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String here : ");
        String Str = sobj.nextLine();

        Str = Str.trim();
        Str = Str.replaceAll("\\s+"," ");
        sobj.close();

        String Arr[] = Str.split(" ");

        StringBuffer output = new StringBuffer();

        StringBuffer word = null;

        int iCnt = 0;
        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            word = new StringBuffer(Arr[iCnt]);
            output.append(word.reverse()).append(" ");

        }
        
        System.out.println(output);
    }
    
}
