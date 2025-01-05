import java.util.*;
public class StringOp
{
    String str,msk,nstr;
   StringOp()
   {
       str="";
       msk="";
       nstr="";
    
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
    System.out.print("enter the command");
    String ab=sc.nextLine();
        
        System.out.println("Enter the String ");
        
        str=sc.next();
        System.out.println("Enter the mask String");
        msk=sc.next();
        str=str.toLowerCase();
        msk=msk.toLowerCase();
    }
    void form()
    {
        char ch='a';String temp="";
     String S[]=new String[str.length()];
for(int i=0;i<str.length();i++)
{
ch=str.charAt(i);
S[i]=""+ch;
}
for(int i=0;i<msk.length();i++)
{
ch=msk.charAt(i);
temp=""+ch;
for(int j=0;j<S.length;j++)
{System.out.println(" "+temp+" "+S[j]);
if(S[j].equals(temp)==true)
{System.out.println("check");
    S[j]="";
}
}
}
for(int i=0;i<S.length;i++)
{
nstr=nstr.concat(S[i]);
}
}
void display()
{
System.out.println(nstr);
}
public static void main(String args[])
{
StringOp ob1=new StringOp();
ob1.accept();
ob1.form();
ob1.display();
}}    