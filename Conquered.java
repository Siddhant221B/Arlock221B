import java.util.*;
public class Conquered
{
    void compute()
    {
    
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the sentence");
    String S=sc.nextLine();
    StringTokenizer st=new StringTokenizer(S);
    int z=st.countTokens();
    String a[]=new String[z];
    for(int i=0;i<z;i++)
    {a[i]=st.nextToken();
    }
     
    String temp="";int max=0;String maxL="";
       int p=0;
    for(int i=0;i<z;i++)
    {
        maxL=a[i];
        max=maxL.length();
     p=i;
        for(int j=i;j<z;j++)
        {
            if(a[j].length()>max)
            {maxL=a[j];
                max=maxL.length();
                p=j;
                
            }
        }
        temp=a[i];
        a[i]=a[p];
        a[p]=temp;
    }
   
           
    for(int i=0;i<z;i++)
    {
        for(int j=0;j<z-1;j++)
        {
            if(a[j].length()==a[j+1].length())
            {
                if(a[j+1].compareToIgnoreCase(a[j])<1)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                 
                }
            }}}
            for(int i=0;i<z;i++)
            {
                if(a[i].charAt(0)>='a'&&a[i].charAt(0)<='z')
                {temp=a[i].substring(1);
                  maxL=""+a[i].charAt(0);
                  maxL=maxL.toUpperCase();
                  a[i]=maxL.concat(temp);
                    
                }
                System.out.print(a[i]+" ");
            }
                }
            }
 

