//************Demonstration of trim it and Replace  Activity**************

import java.util.*;

class ProgramString3
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
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);

        sobj.close();
    }

}
