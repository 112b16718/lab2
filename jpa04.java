package lab02;
import java.util.Scanner;
public class jpa04 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        for (int i=0;i<2;i++){
            System.out.println("Input:");
            int x1=x.nextInt();
            if (x1%45==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        x.close();    
    }
}
