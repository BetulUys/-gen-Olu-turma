package advenced02;

import java.util.Scanner;

public class Odev_3basamakliSayi {
    public static void main(String[] args) {
        String deger,deger1,deger2;
        deger="";
        deger1="";
        deger2="";
        Scanner scan=new Scanner(System.in);
        System.out.println(" 3 basamaklı sayı giriniz");
        int sayi=scan.nextInt();
if (sayi>99&&sayi<1000) {
    switch (sayi / 100) {
        case 1:
            deger = "yüz";
            break;
        case 2:
            deger = "ikiyüz";
            break;
        case 3:
            deger = "üçyüz";
            break;
        case 4:
            deger = "dörtyüz";
            break;
        case 5:
            deger = "beşyüz";
            break;
        case 6:
            deger = "altıyüz";
            break;
        case 7:
            deger = "yediyüz";
            break;
        case 8:
            deger = "sekizyüz";
            break;
        case 9:
            deger = "dokuzyüz";
            break;

    }
    sayi = sayi % 100;

    switch (sayi / 10) {
        case 1:
            deger1 = "on";

            break;
        case 2:
            deger1 = "yirmi";
            break;
        case 3:
            deger1 = "otuz";
            break;
        case 4:
            deger1 = "kırk";
            break;
        case 5:
            deger1 = "elli";
            break;
        case 6:
            deger1 = "altmış";
            break;
        case 7:
            deger1 = "yetmiş";
            break;
        case 8:
            deger1 = "seksen";
            break;
        case 9:
            deger1 = "doksan";
            break;
    }
    sayi = sayi % 10;

    switch (sayi) {
        case 1:
            deger2 = "bir";
            break;
        case 2:
            deger2 = "iki";
            break;
        case 3:
            deger2 = "üç";
            break;
        case 4:
            deger2 = "dört";
            break;
        case 5:
            deger2 = "beş";
            break;
        case 6:
            deger2 = "altı";
            break;
        case 7:
            deger2 = "yedi";
            break;
        case 8:
            deger2 = "sekiz";
            break;
        case 9:
            deger2 = "dokuz";
            break;
    }
    System.out.println(deger + deger1 + deger2);
}else System.out.println("yanlış bir sayı girdiniz");
    }
}
