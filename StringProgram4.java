
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

        String Arr[] = Str.split(" ");

        sobj.close();

        System.out.println("Number of words are : "+Arr.length);

        for(int i = 0;i < Arr.length;i++)
        {
            System.out.println("Word is : "+Arr[i]+" : having length : "+Arr[i].length());
        }

       
    }
    
}
