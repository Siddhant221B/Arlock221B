import java.util.*;
public class Vampire 
{
    int c;
    int m;
    int n;
    void reader()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the m and n");
        m=sc.nextInt();
        n=sc.nextInt();
    }
   void check1()
    {
        if(m>=1000&&m<=9999&&n>=1000&&n<=9999)
        Generator();
        else
        System.out.println("Wrong input");
    }
  void  Generator()
    {
        System.out.println("Vampire no are");
        for(int i=m;i<=n;i++)
        {
            check2(i);
        }
        end();
    }
   void check2(int a1)
    {
        int count=0;int a2=a1;
        while(a1>0)
        {
            count++;
            a1/=10;
        }
        if(count%2==0)
        factor(a2,count);
    }
   void factor(int x,int y)
    {
        int f1=0,f2=0;
        int p=(int)(Math.pow(10,y/2-1));
     int p2=(int)(Math.pow(10,y/2));
        p2=999999999%p2;
        
        for(int i=p;i<p2;i++)
        {
            if(x%i==0)
            {
                f1=i;
                for(int j=f1+1;j<p2;j++)
                {
                    if(x%j==0)
                    {
                        f2=j;
                        check3(f1,f2,x);
                    }}}}
                }
                     void check3(int n1,int n2,int o)
                    { int k=n1*n2;
                        if(k==o)
                        {String s2=""+n1+""+n2;
                           check4(s2,o);
                            s2=""+n2+""+n1;
                           check4(s2,o);
                            
                        }
                      
                    }
                   void check4(String s2,int o)             
                   {
                   
                       boolean fcheck=true;
                        char ch='a';
                        String s1=""+o;
            
                        
                        System.out.println(s1+" "+s2);
                        if(s1==s2)
                        {System.out.println(o);
                          
                  

                        c++;
                        }
                    }
                        
                    void end()
                    {
                        if(c>0)
                        System.out.println("Frequency of vampires"+c);
                        else
                        System.out.println("nil");
                    }
                    public static void main()
                    {
                        Vampire ob1=new Vampire();
                        ob1.reader();
                        ob1.check1();
                    }}
                        
    