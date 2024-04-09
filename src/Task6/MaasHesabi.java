package Task6;

import java.util.Scanner;

public class MaasHesabi {
    public static void main(String[] args) {
        float  toplammaas, prim , prim_orani;

        Scanner oku= new Scanner(System.in);
        float sabit_maas= oku.nextFloat();
        float satis_kazanci=oku.nextFloat();
        float performansseviyesi=oku.nextFloat();

        if (satis_kazanci > performansseviyesi)
            prim_orani = 0.10;
         else
            prim_orani = 0.05;

        prim = satis_kazanci * prim_orani;
        int toplam_maas = sabit_maas + prim;
        System.out.println("toplam_maas = " + toplam_maas);
        
        




    }


}
