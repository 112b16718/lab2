package lab02;
import java.util.Scanner;
public class jpa05 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        for (int i=0;i<4;i++){
            System.out.println("Enter an integer:");
            int a=x.nextInt();
            if (a%2==0){
                if (a%3==0){
                    System.out.println(a+"是2、3、6的倍數");
                    }
                else{
                    System.out.println(a+"是2的倍數");
                }
            }
            else{
                if (a%3==0){
                    System.out.println(a+"是3的倍數");
                }
                else{
                    System.out.println(a+"不是2、3、6的倍數");
                }
            }
        }
        x.close();
    }
}
