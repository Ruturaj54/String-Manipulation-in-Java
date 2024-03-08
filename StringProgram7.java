
import java.util.*;

class StringProgram7
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String here : ");
        String Str = sobj.nextLine();

        System.out.println("Enter the Word that you want to count Frequency : ");
        String Word = sobj.nextLine();

        Word = Word.trim();
        Str = Str.trim();

        Str = Str.replaceAll("\\s+"," ");

        String Arr[] = Str.split(" ");
       
        int iFrequency = 0;

        sobj.close();
        
        for(int i = 0;i < Arr.length;i++)
        {
            if(Word.equalsIgnoreCase(Arr[i]))
            {
               iFrequency++;
            }
        }

        System.out.println("Word : "+Word+" Occurs : "+iFrequency);

       
    }
    
}
