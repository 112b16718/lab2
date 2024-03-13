package lab02;
import java.util.Scanner;
public class jpa02 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        for (int i=0;i<2;i++) {   
            System.out.println("Input:");
            int x1=x.nextInt();
            int x2=x.nextInt();
            if (x1>x2){
                System.out.println(x1+" is larger than "+x2);
            }
            else{
                System.out.println(x2+" is larger then "+x1);
            }
        }
        x.close();
    }
}