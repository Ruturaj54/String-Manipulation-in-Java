
//Number of times the word occurs that all words to rempve from the string

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
        
        StringBuffer sbobj = new StringBuffer(Str);

        sbobj = sbobj.reverse();
        System.out.println("Updated String is : "+sbobj);

       
    }
    
}
