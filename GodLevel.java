import java.util.*;
public class GodLevel
{
    String S;
    boolean check;
    GodLevel()
    {S="";
    check=false;    
        
    }
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        S=sc.nextLine();
        char ch=S.charAt(S.length()-1);
        if(ch=='.'||ch=='?'||ch=='!')
        check=true;
    }
    
    
    void display()
    {
        String S1=S.substring(0,S.length()-1);
        StringTokenizer st=new StringTokenizer(S1);
        int z=st.countTokens();
        System.out.println("WORD     COUNT");
        if(check==true)
        {
            for(int i=1;i<=z;i++)
            {work(st.nextToken());
                
            }
        }
        else
        {
            System.out.println("Incorrect Terminating Character.Invalid Input");
            
            
        }
    }
  void work(String S2)
    {
        char ch='a';
        System.out.print(S2+"     ");
        
        for(int i=0;i<S2.length();i++)
        {ch=S2.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.print("V");
            
        }
        System.out.println();
        for(int i=0;i<S2.length();i++)
        System.out.print(" ");
        System.out.print("     ");
        
        
        for(int i=0;i<S2.length();i++)
        {ch=S2.charAt(i);
            if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
            System.out.print("C");
            
        }
        System.out.println();
               System.out.println();
    }
    public static void main(String args[])
    {
        GodLevel ob1=new GodLevel()
         ;
        ob1.read();
        ob1.display();
        
    }
}