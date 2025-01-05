import java.util.*;
public class DoubleLetter
{
    void compute()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String S1=sc.nextLine();
        StringTokenizer st=new StringTokenizer(S1);
        int z=st.countTokens();
        String S="";
        for(int i=1;i<=z;i++)
        {S=st.nextToken();
            for(int j=0;j<S.length()-1;j++)
            {
                if(S.charAt(j)==S.charAt(j+1))
                System.out.println(S.charAt(j)+" - "+S);
                
            }
            
        }
    }
}