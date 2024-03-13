package lab02;
import java.util.Scanner;
public class jpa08 {
    public static void main(String[] args) {
        
        Scanner n=new Scanner(System.in);
        for (int i=0;i<5;i++){
            int n1=n.nextInt();
            if (n1>=90){
                System.out.println("Your grade is A");
            }
            else if(90>n1&&n1>=80){
                System.out.println("Your grade is B");
            }
            else if(80>n1&&n1>=70){
                System.out.println("Your grade is C");
            }
            else if(70>n1&&n1>=60){
                System.out.println("Your grade is D");
            }
            else if(60>n1){
                System.out.println("Your grade is F");
            }
        }
        n.close();
    }   
}
