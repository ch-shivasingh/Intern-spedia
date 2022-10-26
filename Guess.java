import java.util.*;
public class Guess{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Random r=new Random();
        int trials=0;
        int rand=r.nextInt(100);
        int a=0;
        System.out.println("Enter your number, b/w 0 to 100 : ");
        while(a!=rand){
            trials=trials+1;
            a=sc.nextInt();
            if(a<rand){
                System.out.println("the guessed number is lower than the actual number.");
            }
            else if(a>rand){
                System.out.println("the guessed number is higher than the actual number.");
            }
            else if(a==rand){
                System.out.println("You choose the correct number");
                System.out.println("Number of trials = "+trials);
            }
        }
    }
}