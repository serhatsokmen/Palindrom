import java.util.Scanner;
public class Main {

   static boolean Palindrom(int number) {
       int temp = number, revN = 0, sonBas;
       while( temp != 0) {
           sonBas = temp % 10;
           revN = (revN * 10) + sonBas;
           temp/=10;
       }

       if (number == revN)
           return true;
       else
           return false;
   }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x;

        System.out.print("sayi giriniz : ");
        x = scan.nextInt();


        System.out.println(Palindrom(x));
    }
}