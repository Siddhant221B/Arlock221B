import java.util.*;
public class Lucky
{
    void compute()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the upper Limit");
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=n;
        int f=2;
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;
            System.out.print(a[i]+" ");
        
        }
        System.out.println();
        while(f<c)
        {
            c=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]!=0)
                {
                    c++;
                    if(c%f==0)
                    {
                        a[i]=0;
                    }
                }
            }
        f++;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            System.out.print(a[i]+" ");
        }
    if(f>=c)
    System.out.println("are Lucky Numbers");
    else
    System.out.println();
    }
       }
    }
