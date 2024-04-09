package Task7;

import java.util.Scanner;

public class Mevsimler {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        int ay=oku.nextInt();
        int gun=oku.nextInt();

if( ay==4 || (ay==5) || (ay == 3 && gun>=20) || (ay== 6 && gun<20))

    System.out.println("mevsim=Ilkbahar");
else
    if( ay==7 || ay==8 || (ay==9 && gun<21) || (ay==6 || gun>21))
        System.out.println("mevsim=yaz");
    else
        if ( ay == 10 || ay== 11 || (ay==9 && gun>21) || (ay==12 && gun<=20))
            System.out.println("mevsim=sonbahar");
        else
            if (ay == 1 || ay==2 || (ay==12 && gun>20) || (ay==3 && gun<=19))
                System.out.println("mevsim=kis");






    }
}
