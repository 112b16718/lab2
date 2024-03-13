package lab02;
import java.util.Scanner;
public class jpa07 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        for (int i=0;i<4;i++){
            System.out.print("請輸入三個整數:");
            int a=x.nextInt();
            int b=x.nextInt();
            int c=x.nextInt();
            if (a+b>c&&a+c>b&&b+c>a){
                if(math(a)+math(b)==math(c)||math(a)+math(c)==math(b)||math(b)+math(c)==math(a)){
                    System.out.println("直角三角形");   
                }
                else if(math(a)+math(b)>=math(c)&&math(a)+math(c)>=math(b)&&math(b)+math(c)>=math(a)){
                    System.out.println("銳角三角形");
                }
                else if(math(a)+math(b)<=math(c)||math(a)+math(c)<=math(b)||math(b)+math(c)<=math(a)){
                    System.out.println("頓角三角形");
                }
            }
            else{
                System.out.println("不可構成三角形");
            }
        }
        x.close();
    }
    public static double math(double h){
        double v= Math.pow(h,2);
        return v;
    }    
}
