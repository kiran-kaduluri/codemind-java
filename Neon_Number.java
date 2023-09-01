import java.util.*;
public class sum{
    public static void main(String args[])
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int sqrt=n*n;
        while(sqrt>0)
        {
            sum=sum+sqrt%10;
            sqrt=sqrt/10;
        }
        if(n==sum){
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
        
    }
}