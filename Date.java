import java.util.*;
public class Date
{
    int day,m,year;
    boolean check;
    Date()
    {check=true;
        day=0;
        m=0;
        year=0;
    }
void input()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter day");
    day=sc.nextInt();
       System.out.println("Enter month");
    m=sc.nextInt();
       System.out.println("Enter year");
    year=sc.nextInt();
    
}
void check()
{
    if(m>12)
    check=false;
    if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
    {if(day>31)
        check=false;
    }
    else if(m==2)
    {
        if(year%4==0)
            {
                if(day>29)
                check=false;
                
                
            }
            else
            {if(day>28)
                check=false;
                
                
            }
    }
    else
    {
        if(day>30)
        check=false;
    }
    
    
}
void generate()
{
    int s=0;
    if(check==true)
    { for(int i=1;i<m;i++)
        {
            if(i==1)
            s+=31;
            else if(i==2)
            {
                if(year%4==0)
                s+=29;
                else
                s+=28;
                
            }
            else if(i==3)
           s+=31;
            else if(i==4)
           s+=30;
            else if(i==5)
           s+=31;
            else if(i==6)
           s+=30;
            else if(i==7)
           s+=31;
            else if(i==8)
           s+=31;
            else if(i==9)
           s+=30;
           else if(i==10)
           s+=31;
           else if(i==11)
           s+=30;
        }
        s+=day;
        System.out.println("No of days of the year-"+s);
        
        

           
           
            
        
       
    }
    else
    System.out.println("Invalid date");
    System.exit(0);
    
}
public static void main(String args[])
{
    Date ob1=new Date();
    ob1.input();
    ob1.check();
    ob1.generate();
    
}
}
