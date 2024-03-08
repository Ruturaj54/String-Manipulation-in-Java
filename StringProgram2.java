// To take string from user and find the Number of word present in it

import java.util.*;

class StringProgram1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String here : ");
        String Str = sobj.nextLine();
        
        Str = Str.trim();

        Str = Str.replaceAll("\\s+"," ");

        System.out.println("Updated string is : "+Str);
        
        sobj.close(); 
    }
    
}
