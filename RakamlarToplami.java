package advenced02;

import java.util.Scanner;

public class RakamlarToplami {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("lütfen bie sayı giriniz");
        int sayi = scan.nextInt();
        String str1 = Integer.toString(sayi);
        int bSayi = str1.length();
        System.out.println("bSayi = " + bSayi);
        int rakam = 0;
        int rakamlarToplami = 0;
        int rakam2 = 0;
        int rakamlarToplami2 = 0;
        for (int i = 0; i < bSayi; i++) {
            rakam = sayi % 10;
            rakamlarToplami += rakam;
            sayi /= 10;
        }
        System.out.println("rakamlarToplami = " + rakamlarToplami);
        String str2 = Integer.toString(rakamlarToplami);
        int bSayi2 = str2.length();
        System.out.println("bSayi2 = " + bSayi2);
        for (int j = 0; j < bSayi2; j++) {
            rakam2 = rakamlarToplami % 10;
            rakamlarToplami2 += rakam2;
            rakamlarToplami /= 10;
        }
        System.out.println("rakamlarToplami son = " + rakamlarToplami2);
    }

}

