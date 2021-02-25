
import java.io.*;
 
class Rec_1 {
 
    static void fun(int x) 
    { 
        if(x > 0) 
        { 
            fun(--x); 
            System.out.print(x + " "); 
            fun(--x); 
        } 
    } 
     
    public static void main (String[] args)
    { 
        int a = 4; 
        fun(a); 
    } 
}
 
