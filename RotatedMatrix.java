import java.util.*;
public class RotatedMatrix
{
    void compute()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m");
        int m=sc.nextInt();
     int s=0;   int a[][]= new int[m][m];
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter the elements of row"+(i+1));
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
     for(int i=0;i<m;i++)
        {
           
            for(int j=0;j<m;j++)
            {if(i==0&&j==0||i==0 && j==(m-1)||j==0&&i==(m-1)||i==(m-1)&&j==(m-1))
                
                s=s+a[i][j];
             System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
 
    int y=m-1,z=0,p=0;
    int b[][]=new int[m][m];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<m;j++)
        {
            p=a[y][z];
            b[i][j]=p;
            if(y>0)
            {y--;
            }
            else{
                y=m-1;
                z++;
            }
            
            }
        }
        System.out.println("\nROTATED MATRIX");
        a=b;
         for(int i=0;i<m;i++)
        {
           
            for(int j=0;j<m;j++)
            {
             System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
      System.out.println("Sum of corner elements->"+s); 
      
      
      
      
      
    }
    
    }
    
