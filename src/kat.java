import java.util.Scanner;

public class kat {

        public static void main(String[]args){
            int k;
            Scanner input=new Scanner(System.in);
            System.out.print("Sayı Giriniz :");
            k=input.nextInt();
            for (int i=1;i<=k;i*=4){
                System.out.println("4'ün Katı :"+i);
            }
            for (int s=1;s<=k;s*=5){
                System.out.println("5'in Katı :" + s);
            }

        }
    }

