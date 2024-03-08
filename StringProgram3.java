
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
            System.out.println("Words are : "+Arr[i]);
        }

        for(String s : Arr) // for each loop
        {
            System.out.println(s);
        }
        int i = 0;
        while(i != Arr.length)
        {
            System.out.println("Words are : "+Arr[i]);
            i++;
        }

    }
    
}
