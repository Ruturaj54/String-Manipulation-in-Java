
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

        int iMax= 0;
        String MaxStr = "";
        int i = 0;

        //TO CALCULATE lastST LARGEST NUMBER
        for(i = 0;i < Arr.length;i++)
        {
            if(Arr[i].length() >= iMax)
            {
                iMax = Arr[i].length();
                MaxStr = Arr[i];
            
            }
        }

        System.out.println("Largest Word is : "+MaxStr+" : having length : "+iMax);

       
    }
    
}
