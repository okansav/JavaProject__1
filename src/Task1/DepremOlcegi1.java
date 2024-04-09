package Task1;

import java.util.Scanner;

public class DepremOlcegi1 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.println("Lütfen depremin büyüklügünü giriniz=");
        double mag= oku.nextDouble();

        if (mag < 2.00)
        System.out.println("Micro - Mikro");
        else
            if (mag>=2 && mag<3)
            System.out.println("Very Minor");
            else
                if(mag>=3 && mag<4)
            System.out.println("Minor ");
                else
                    if(mag>=4 && mag<5)
                        System.out.println("Light - Hafif");
                    else
                        if(mag>=5 && mag<6)
                            System.out.println("mag = " + mag);
                        else
                            if(mag>=6 && mag<7)
                                System.out.println("mag = " + mag);
                            else
                                if(mag>=7 && mag<8)
                                    System.out.println("mag = " + mag);
                                else
                                    if(mag>=8 && mag<10)
                                        System.out.println("mag = " + mag);
                                    else
                                        if(mag>=10)
                                            System.out.println("mag = " + mag);








    }
}
