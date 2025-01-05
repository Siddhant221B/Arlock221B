import java.util.*;
public class Bank_Account
{
    static int balance;
    int withdraw,deposit;
    String name;
    
    Bank_Account()
    {balance=0;
        withdraw=0;
        deposit=0;
        name="";
        
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name and balance");
       name=sc.nextLine();
        balance=sc.nextInt();
        
    }
    void receptionist()
    { int choice=0;
          int a=0;
      Scanner sc=new Scanner(System.in);
          System.out.println("Name-"+name+" Balance-"+balance);
      while(1>0)
      { System.out.println("Enter \n 1 to deposit money \n 2 to withdraw money \n 3 to exit");
      choice=sc.nextInt();
 
      switch(choice)
      {
          case 1:
                    System.out.println("Enter the amount to be Deposited");
                   a=sc.nextInt();
                   Deposit(a);
                    break;
              
              case 2:
                  System.out.println("Enter the amount to be withdrawn");
                  a=sc.nextInt();
                  withdraw(a);
                  break;
              case 3:
                  System.out.println("Thank you");
                  System.exit(0);
                  break;
                  default:
                      System.out.println("Wrong Input");
                      
      }
    }
    }
      void withdraw(int b)
      {if(balance>=b)
          {
          balance=balance-b;
          System.out.println("Your Current balance is "+balance);
        }
        else
        {
          System.out.println("Insufficient balance");
        }
          
      } void Deposit(int b)
      {balance=balance+b;
          System.out.println("Your Current balance is "+balance);
          
          
      }
      public static void main(String args[])
      {
          Bank_Account ob1=new Bank_Account();
          ob1.input();
          ob1.receptionist();
      }
      
      
    
    
}