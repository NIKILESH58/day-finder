import java.io.*;
import java.time.LocalDate;
import java.util.*;

class dayfinder
{
   public static void main(String[] args) 
        {
                  Scanner in = new Scanner(System.in);

            System.out.println("enter date month year");
            int a=in.nextInt();
                        int b=in.nextInt();
                                    int c=in.nextInt();
                                    Calendar d = Calendar.getInstance();
        d.set(a,b,c);
String e= LocalDate.of(a,b,c).getDayOfWeek().toString();
            System.out.println(e);

 

        }
}
