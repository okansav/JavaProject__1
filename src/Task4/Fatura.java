package Task4;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Fatura {
    public class CalculateElectricityBill {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter new electric meter value (kWh) = ");
            int newElectricMeter = scanner.nextInt();
            System.out.print("Enter old electric meter value (kWh) = ");
            int oldElectricMeter = scanner.nextInt();
            int consumption = newElectricMeter - oldElectricMeter;
            float monthlyBill = consumption * unitPrice(consumption);
            System.out.println("Your monthly bill is = " + monthlyBill +" €");
        }
        public static float unitPrice(int consumption){
            if (consumption >= 0 && consumption <= 100)
                return 1.1f;
            else
            if (consumption <= 200)
                return 1.3f;
            else
            if (consumption <=300)
                return 1.5f;
            else
            if (consumption <= 400)
                return 1.7f;
            else
            if (consumption <= 500)
                return 1.9f;
            return 2.3f;
        }
    }
}
