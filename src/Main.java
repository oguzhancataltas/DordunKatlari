import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k, total = 0;



        do {

            System.out.print("Bir sayı giriniz : ");
            k = scanner.nextInt();

            if(k % 4 == 0){
                total += k;
            }
        }while (k % 2 == 0);

        System.out.println("Girilen sayılardan 4'ün katı olanların toplamı : " + total);
    }
}
