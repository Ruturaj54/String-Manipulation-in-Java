
//Number of times the word occurs that all words to rempve from the string

import java.util.*;

class StringProgram7
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String here : ");
        String Str = sobj.nextLine();

        System.out.println("Enter the Word that you want to repalce with noting : ");
        String Word = sobj.nextLine();

        Word = Word.trim();
        Str = Str.trim();

        Str = Str.replaceAll("\\s+"," ");
       
        sobj.close();
        
        Str = Str.replaceAll(Word,"");

        Str = Str.replaceAll("\\s+"," ");
        Str = Str.trim();

        System.out.println("Updated String is : "+Str);

       
    }
    
}
