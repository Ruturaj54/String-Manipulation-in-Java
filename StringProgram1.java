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
        char Arr[] = Str.toCharArray();
        int i = 0;
        int SpaceCnt = 0;
        sobj.close(); 
        
        for(i = 0;i < Arr.length;i++)
        {
            if(Arr[i] == ' ')
            {
                SpaceCnt++;
            }
        }
        System.out.println("Number of words are : "+(SpaceCnt+1));
        
        
    }
    
}
