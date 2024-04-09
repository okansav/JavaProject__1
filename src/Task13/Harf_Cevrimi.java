package Task13;

import java.util.Scanner;

public class Harf_Cevrimi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String kullaniciGirdisi = scan.nextLine();

        // Kullanıcıdan alınan cümleyi büyük harf formatına dönüştür
        String buyukHarfFormati = buyukHarfFormatiDonustur(kullaniciGirdisi);
        System.out.println("BÜYÜK HARF FORMATI: " + buyukHarfFormati);

        // Kullanıcıdan alınan cümleyi küçük harf formatına dönüştür
        String kucukHarfFormati = kucukHarfFormatiDonustur(kullaniciGirdisi);
        System.out.println("küçük harf formatı: " + kucukHarfFormati);
    }

    // Cümleyi büyük harf formatına dönüştüren fonksiyon
    public static String buyukHarfFormatiDonustur(String input) {
        return input.toUpperCase();
    }
    public static String kucukHarfFormatiDonustur (String input) {
        return input.toUpperCase();
    }


        }

