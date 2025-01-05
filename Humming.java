import java.util.*;
public class Humming
{
    int n;
    boolean check;
    Humming()
    {
        n=0;
        check=true;
    }
    void input(int a)
    {n=a;
        
    }
    void generate(int con)
    {int num=n;
        for(int i=2;i<=n;i++)
        {
            if(num%i==0)
            {
                if(con==1)
                System.out.print(i+"  ");
                num=num/i;
               if(i!=2&&i!=3&&i!=5)
               check=false;
               i--;
            }
                
                
                
            
        }
        
    }
    void print()
    {
        if(check==true)
        {
            System.out.print(n+" is a humming no. as prime factors of "+n+" are ");
            generate(1);
        }
        else
        {     System.out.print(n+" is not a humming no. as prime factors of "+n+" are ");
             generate(1);
        }
        
        
        
    }
    
    public static void main(String args[])
    {
        Humming ob1=new Humming();
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
       int n1=sc.nextInt();
        ob1.input(n1);
        ob1.generate(0);
        ob1.print();
    }
    }





