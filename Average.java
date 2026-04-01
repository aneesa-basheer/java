import java.util.Scanner;
class NegativeException extends Exception{
    public NegativeException(String message){
        super(message);
    }
}
public class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int sum=0;
        try{
            for(int i=1;i<=n;i++){
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                if(num<0){
                    throw new NegativeException("Negative number not allowed: "+num);
                }
                sum+=num;
            }
            double avg=(double)sum/n;
            System.out.println("Average = "+avg);
        }catch(NegativeException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
