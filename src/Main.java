import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;

        Scanner input =new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        yil = input.nextInt();

        int artikYil;
        artikYil = yil % 400 ;

        if ( artikYil == 0) {
            System.out.println( + yil + " bir artik yildir! ");
        }else{
            System.out.println( + yil + " bir artik yil degildir! ");
        }

    }
}