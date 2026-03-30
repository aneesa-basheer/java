import Graphics.*;
import java.util.Scanner; 
public class MainGraphics{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int ch;
   do{
   System.out.println("-----MENU DRIVEN ------");
   System.out.println("1. Circle");
	 System.out.println("2. Rectangle");
	 System.out.println("3. Triangle");
	 System.out.println("4. Square");
	 System.out.println("5.Exit");
	 System.out.print("Enter your choice :");
	 ch=sc.nextInt();
   
	 switch(ch){
			case 1:Circle c=new Circle();
             c.input();
             c.area();
             c.perimeter();
             break;
			case 2:Rectangle r=new Rectangle(); 
             r.input();
             r.area();
             r.perimeter();
             break;
      case 3:Triangle t=new Triangle();
             t.input();
             t.area();
             t.perimeter();
              break;
			case 4:Square s=new Square(); 
             s.input();
             s.area();
             s.perimeter();
             break;

			case 5:System.exit(0);
		  default:System.out.println("Invalid Choice");
		}
	  }while(ch!=5);
	}
}
