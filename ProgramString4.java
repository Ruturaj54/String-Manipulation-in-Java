//************Demonstration of trim it and Replace  Activity**************

import java.util.*;

class ProgramString4
{
    public static void main(String[] Args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String here : ");
        String Str = sobj.nextLine();

        Str = Str.trim();

        System.out.println("After Trim : "+Str);

        Str = Str.replaceAll("\\s+"," "); //it indicates if there is multiple space in between word then replace it with 1 space
        System.out.println("After ReplaceAll : "+Str);

        String words[] = Str.split(" ");

        System.out.println("Number of Words in sentence are : "+words.length);
        
        for(int i = 0;i < words.length;i++)
        {
            System.out.println(words[i]);
        }

        sobj.close();
    }

}
