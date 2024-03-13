package lab02;
import java.util.Scanner;
public class jpa06 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        for (int i=0;i<4;i++){
            System.out.println("Input chinese score:");
            int ch=x.nextInt();
            System.out.println("Input ehglish score:");
            int en=x.nextInt();
            System.out.println("Input math score:");
            int ma=x.nextInt();
            if (ch>=60){
                if(en>=60){
                    if(ma>=60){
                        System.out.println("All Pass");
                    }
                    else{
                        System.out.println("math failed");
                    }
                }
                else{
                    if(ma>=60){
                        System.out.println("english failed");
                    }
                    else{
                        System.out.println("english failed\nmath failed");
                    }
                }
            }
            else{
                if(en>=60){
                    if(ma>=60){
                        System.out.println("chinese failed");
                    }
                    else{
                        System.out.println("chinese failed\nmath failed");
                    }
                }
                else{
                    if(ma>=60){
                        System.out.println("chinese failed\nenglish failed");
                    }
                    else{
                        System.out.println("chinesefailed\nenglish failed\nmath failed");
                    }
                }
            }
        }
        x.close();
        }
}

