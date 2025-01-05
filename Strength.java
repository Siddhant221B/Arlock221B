import java.util.*;
public class Strength
{String st;
    Strength(String Constructor)
    {
        st=Constructor;
        st=st.toUpperCase();
        
    }
    int potential(String ew1)
    {int str=0;char ch='a';
        for(int i=0;i<ew1.length();i++)
        {
            ch=ew1.charAt(i);
            str+=ch-64;
        }
        return str;
    }
    void show()
    {String nextW="";
        int p=0;
        StringTokenizer s=new StringTokenizer(st);
        int c=s.countTokens();
        for(int i=1;i<=c;i++)
        {nextW=s.nextToken();
            System.out.println(c);
            p=potential(nextW);
            System.out.println(nextW+"-"+p);
            
            
        }
    }
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String input=sc.nextLine();
        Strength ob1=new Strength(input);
        ob1.show();
    }}
    
    
