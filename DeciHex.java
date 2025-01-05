import java.util.*;
public class DeciHex
{
    int Num;
    String Hexa;
    DeciHex()
    {Num=0;
        Hexa="";
        
    }
    void getNum()
    {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        Num=sc.nextInt();
    }
    void convert(int n)
    {
        if(n>=16)
        {    convert(n/16);
        }
            if(n%16<=9)
        Hexa=Hexa+Integer.toString(n%16);
        else if(n%16==10)
        Hexa=Hexa+'A';
        else if(n%16==11)
        Hexa=Hexa+'B';
            else if(n%16==12)
        Hexa=Hexa+'C';
            else if(n%16==13)
        Hexa=Hexa+'D';
            else if(n%16==14)
        Hexa=Hexa+'E';
        else if(n%16==15)
        Hexa=Hexa+'F';
    }
    void display()
    {
        System.out.println(Num);
         convert(Num);
        System.out.println(Hexa);
    }
    public static void main(String args[])
    {
    DeciHex ob1=new DeciHex();
    ob1.getNum();
    ob1.display();
}}
            
            

