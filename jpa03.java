package lab02;
import java.util.Scanner;
public class jpa03 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        for (int i=0;i<2;i++){
            System.out.println("Input an integer:");
            int x1=x.nextInt();
            if (x1%2==0){
                System.out.println("The namber is even.");
            }
            else{
                System.out.println("The namber is odd.");
            }
        }
        x.close();
    }
}
