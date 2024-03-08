//************Demonstration of trim it and Replace  Activity**************

import java.util.*;

class ProgramString6
{
    public static void main(String[] Args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String here : ");
        String Str = sobj.nextLine();

        Str = Str.trim();
        Str = Str.replaceAll("\\s+"," "); //it indicates if there is multiple space in between word then replace it with 1 space
        String words[] = Str.split(" ");

        for(int i = 0;i < words.length;i++)
        {
            System.out.println("Word is : "+words[i]+ " Having length : "+words[i].length());
        }

        sobj.close();
    }

}
