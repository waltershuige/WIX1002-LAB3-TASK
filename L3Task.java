import java.util.Scanner;
public class L3Task{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
   System.out.print("Enter point1 x=");
   int x=sc.nextInt();
   System.out.print("y=");
   int y=sc.nextInt();
   System.out.print("Enter point2 x=");
   int x2=sc.nextInt();
   System.out.print("y=");
   int y2=sc.nextInt();
   System.out.print("Enter point3 x=");
   int x3=sc.nextInt();
   System.out.print("y=");
   int y3=sc.nextInt();
   if( (y * x2 == y2 * x) && (y2 * x3 == y3 * x2) ){
            System.out.println("Three points lie on the same straight line.");
        }else{
            System.out.println("Three points are NOT collinear.");
       
   }
    }
}

       
