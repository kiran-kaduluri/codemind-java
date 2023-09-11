import java.util.*;
public class greate{
    public static void main (String args[])
    {
        int n,sum=0,avg,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
           avg=sum/n;
           for(int i=0;i<n;i++){
               if(a[i]<=avg){
                  count++;
               }
           }
        
        System.out.println(count);
    
    }
}