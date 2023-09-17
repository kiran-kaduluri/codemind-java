import java.util.*;
public class palin{
    public static void main(String args[])
    {
        int n,rev,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n!=0){
            rev=n%10;
            sum=sum*10+rev;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}