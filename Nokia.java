import java.util.*;
public class Nokia 
{
    String S;
    int count;
    int checkcount;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence in UPPERCASE");
        S=sc.nextLine();
    }
    void database(char ch)
    {
        String d[]={"1","ABC2","DEF3","GHI4","JKL5","MNO6","PQRS7","TUV8","WXYZ9"," 0"};
        for(int i=0;i<d.length;i++)
        {
            if(d[i].indexOf(ch)!=-1)
            Stroker(d[i],ch);
    }
}
        void Stroker(String s1,char ch)
        {
            checkcount++;
            for(int i=0;i<=s1.indexOf(ch);i++)
            count++;
        }
        void Separate()
        {
            char ch='a';
            for(int i=0;i<S.length();i++)
            {
                ch=S.charAt(i);
                database(ch);
            }
        }
        void display()
        {
            if(checkcount==S.length())
            System.out.println(count);
            else
            System.out.println("Invalid Input");
        }
        public static void main(String args[])
        {
            Nokia ob=new Nokia();
            ob.input();
            ob.Separate();
            ob.display();
        }}
    