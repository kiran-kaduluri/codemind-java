import java.util.*;
public class Reverse
{  
public static void main(String[] args)   
{  
int n, rev = 0;  
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
while(n != 0)   
{  
int r = n % 10;  
rev = rev * 10 + r;  
n= n/10;  
}  
System.out.println(rev);  
}  
}  