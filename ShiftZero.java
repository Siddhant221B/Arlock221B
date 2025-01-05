import java.util.*;
public class ShiftZero
{
    int num;
    int Shiftnum;
    void Readnumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
    num=sc.nextInt();
    }
    void Shift()
    {
        int d=0;
        int a =checkduck(num);
        if(a==1)
        {
            int n1=num;
            while(num>0)
            {
                d=num%10;
                if(d!=0)
                Shiftnum=Shiftnum*10+d;
                num/=10;
            }
            
                int c=count(n1);
            while(Shiftnum>0)
            {d=Shiftnum%10;
                num=num*10+d;
                Shiftnum/=10;
            }
            Shiftnum=num;
            num=n1;
            Shiftnum=Shiftnum*((int)Math.pow(10,c));
        }
    }
    void show()
    {
        int c=checkduck(num);
        if(c==1)
        {System.out.println(num+" is a duck number");
        System.out.println(Shiftnum);
    }
    else
    System.out.println(num+" is not a duck number");
    
        
    }
    int count(int b)
    {int t=0;
        while(b>0)
        {
            if(b%10==0)
            t++;
            b/=10;
            
        }
        return t;
    }
    int checkduck(int a)
    {
        int k=0;
        k=count(num);
        if(k>0)
        return 1;
        else
        return 0;
    }
    public static void main(String args[])
{
    ShiftZero ob1=new ShiftZero();
    ob1.Readnumber();
    ob1.Shift();
    ob1.show();
}}
    
            
 
