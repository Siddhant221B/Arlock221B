import java.util.*;
public class Sum_series
{
    int x;
    int n;
    double Sum;
    Sum_series()
    {
        n=0;
        x=0;
        Sum=0;
        
    }
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x and the power");
        x=sc.nextInt();
        n=sc.nextInt();
    }
int getpower(int m,int p)
{
    int t=m;
    for(int i=1;i<p;i++)
    {
        m=m*t;
    }
    
    return m;

    }
    void sum()
    {double a=0,b=0,c=0;
        for(int i=1;i<=n;i++)
        {a=getpower(x,i*2);
            b=getpower(i,i);
            Sum=Sum+(a/b);
           c=(a/b);
           
            
        }
        System.out.println(Sum);
    }
public static void main(String args[])
{
    Sum_series ob1=new Sum_series();
    ob1.read();
    ob1.sum();
}
}


