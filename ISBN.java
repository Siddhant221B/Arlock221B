import java.util.*;
public class ISBN
{
    String S1;
    int sum;
    boolean check;
    boolean check2;
    ISBN()
    {
        S1="";
        sum=0;
        check=true;check2=false;
        
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 digit no");
        S1=sc.next();S1=S1.toUpperCase();
    }
    void sum()
    {char ch='a';
        String S2="";
        int a=0;
        for(int i=0;i<S1.length();i++)
        {
            ch=S1.charAt(i);
            if(ch=='X')
            sum+=(1*10);
            else
            {
                S2=""+ch;
                a=Integer.parseInt(S2);
                sum+=(a*(10-i));
            }}}
            void check()
            {
                int l=S1.length();
                if(l!=10)
                check=false;
                if(sum%11==0)
                {
                    check2=true;
                }
            }
            void print()
            {System.out.println(sum);
                if(check==true&&check2==true)
                {
                    System.out.println("ISBN no");
                    
                }
                else
                System.out.println("Not ISBN no");
            }
 
            public static void main(String args[])
            {
                ISBN ob1=new ISBN();
                ob1.input();
                ob1.sum();
                ob1.check();
                ob1.print();
            
        }
    }