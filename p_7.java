
import java.util.*;

class p_7
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A SENTENCE");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        int z=st.countTokens();
        String t="";String a[]=new String[z];
        
        
        for(int i=0;i<z;i++)
        {
            a[i]=st.nextToken();   
    }
    for(int i=0;i<z;i++)
    {
        for(int j=0;j<z-1;j++)
        {
            if(a[j].length()<a[j+1].length())
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
                
                
            }
            else if(a[j].length()==a[j+1].length())
            {
                if(a[j].compareToIgnoreCase(a[j+1])<=0)
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    for(int i=0;i<z;i++)
    System.out.print(a[i]+" ");
}
}