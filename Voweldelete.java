
import java.util.*;
public class Voweldelete {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int n=s.length();
        System.out.println("After removing vowels");
        for(int i=0;i< n;i++)
        {
            if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='0')||(s.charAt(i)=='u')||(s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U'))
            {
                continue;
            }
            else
            {
                System.out.print(s.charAt(i));
            }
        }
    }
    
}
