package lab02;
import java.util.Scanner;
public class jpa01{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        for (int i=0;i<2;i++){
            System.out.println("Please enter scroe:");
            float a1=a.nextInt();
            if (a1>=60){
                System.out.println("You pass\nEnd");
            }
            else{
                System.out.println("End");
            }
        }
        a.close();
    
    }
}