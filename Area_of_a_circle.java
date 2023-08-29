import java.util.Scanner;
public class AreaOfCircle {
   public static void main(String args[]){
      int radius;
      double area,pi=3.14;
      Scanner sc = new Scanner(System.in);
      radius = sc.nextInt();
      area = (radius*radius)*pi;
      System.out.println(area);
   }
}