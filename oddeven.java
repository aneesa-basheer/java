import java.util.Scanner;
class oddeven{
public static void main(String[] args){
Scanner num=new Scanner(System.in);
System.out.print("Enter a number:");
int n=num.nextInt();
if(n%2==0)
{
System.out.println("Even Number");
}
else
{
System.out.println("Odd Number");
}
}
}
