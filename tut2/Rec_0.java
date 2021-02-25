import java.io.*;
 
class Rec_0{
     
    // Function to find string which has
    // first character of each word.
    static char first(String str, int i)
    {
        if (str.charAt(i) == '\0')
            return 0;
        if (Character.isUpperCase(str.charAt(i))) 
                return str.charAt(i);
        return first(str, i + 1);
    }
     
    // Driver code
    public static void main(String args[])
    {
        String str = "geeksforGeeKS";
        char res = first(str,0);
        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println (res );
    }
}
