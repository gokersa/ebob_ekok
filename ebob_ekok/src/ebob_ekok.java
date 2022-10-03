import java.util.Scanner;

public class ebob_ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();

        boolean rw = false;
        do {
            if (n1 <= 0 || n2 <= 0) {
                System.out.print("Girdiğiniz sayılardan biri negatif. Lütfen pozitif sayı giriniz");
            } else {
                rw = true;
            }
        } while (!rw);


            int i = n1;
            while (i >= 1) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    System.out.print("Girdiğiniz iki sayının en büyük ortak böleni: " + i);
                    break;
                } else {
                    i--;
                }

            }
            int k = n2;
            while (k <= (n1 * n2)) {
                if ((k % n1 == 0) && (k % n2 == 0)) {
                    System.out.print("Girdiğiniz iki sayının en küçük ortak katı: " + k);
                    break;
                } else {
                    k++;
                }
            }
        }
    }
