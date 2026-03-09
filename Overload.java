import java.util.Scanner;
class Area {  
    void area(float s){
        System.out.println("Area of Square = "+(s*s)+" sq units");
    }
    void area(float l, float b){
        System.out.println("Area of Rectangle = "+(l*b)+" sq units");
    }
    void area(double r){
        System.out.println("Area of Circle = "+(3.14*r*r)+" sq units");
    }
}
public class Overload{
    public static void main(String args[]){
        
        Area obj = new Area();
        Scanner sc = new Scanner(System.in);
        int ch;
        float l, b, s;
        double r;
        
        do { 
            System.out.println("\nChoose the menu");
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice :");
            ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:System.out.print("Enter side :");
                       s = sc.nextFloat();
                       obj.area(s);
                       break;
                case 2:System.out.print("Enter length :");
                       l = sc.nextFloat();
                       System.out.print("Enter breadth :");
                       b = sc.nextFloat();
                      obj.area(l,b);
                      break;
                case 3:System.out.print("Enter radius :");
                       r = sc.nextDouble();
                       obj.area(r);
                       break;
                case 4:System.exit(0);
                default:System.out.println("Invalid Choice");
            }
        } while (ch != 4);
    }
}
