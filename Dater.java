import java.util.*;
public class Dater
{
    int year;
    int dn;
    int N;
    boolean check;
    void perform(int n)
    {
        int m=1;
        int c=1;
        int y=year;
        for(int i=1;i<n;i++)
        {
            c++;
            if(i!=n-1)
            {
            if(m==1||m==3||m==5||m==7||m==8||m==10|m==12)
            {
                if(c==31)
                {
                    c=0;
                    m++;
                }
            }
            else if(m==4||m==6||m==9||m==11)
            {
                if(c==30)
                {
                    c=0;
                    m++;
                }
            }
            else if(m==2)
            {
                if(y%4==0)
                {
                    if(c==29)
                    {
                        c=0;
                        m++;
                    }
                }
                else
                {
                    if(c==28)
                    {
                        c=0;
                        m++;
                    }
                }
            }}
            if(m==13)
            {
                m=1;
                y++;
            }
        }
        
    
        String month="";
        if(m==1)
        month="January";
        else if(m==2)
        month="February";
        else if(m==3)
        month="March";
        else if(m==4)
        month="April";
        else if(m==5)
        month="May";
        else if(m==6)
        month="June";
        else if(m==7)
        month="July";
        else if(m==8)
        month="August";
        else if(m==9)
        month="September";
        else if(m==10)
        month="October";
        else if(m==11)
        month="November";
        else if(m==12)
        month="December";
        
        System.out.println(month+" "+c+","+y);
    }
    void input()
    {check=false;        
        Scanner sc=new Scanner(System.in);
        System.out.println("Day number");
        dn=sc.nextInt();
          System.out.println("Year");
        year=sc.nextInt();
          System.out.println("N");
        N=sc.nextInt();
        if(dn>=1&&dn<=366&&N>=1&&N<=100)
        check=true;
    }
    void display()
    {
        if(check==true)
        {
            System.out.print("Entered Date ");
            perform(dn);
            System.out.print(N+" days later ");
            N=N+dn;
            perform(N);
        }
        else
        System.out.println("Invalid input");
        
    }
    public static void main(String args[])
    {
        Dater ob1=new Dater();
        ob1.input();
        ob1.display();
    }
}
    
        
                