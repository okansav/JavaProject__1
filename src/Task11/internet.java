package Task11;

import java.util.Scanner;

    public class internet {
        public static void main(String[] args) {
            boolean result;
            do{
                result = isContinue();
            }while (result);
            System.out.println("Program is ended.");
        }
        public static boolean isContinue(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like to calculate for a new client?");
            System.out.print("Enter 'Y' for yes and enter 'N' for no :");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("Y")){
                System.out.printf("Your bill = %.2f € %n", calculateBill());
                return true;
            }else
            if(choice.equalsIgnoreCase("N"))
                return false;
            else {
                System.out.println("You entered invalid value, please try again");
                System.out.println();
                return true;
            }
        }
        public static float calculateBill(){
            float unitCostForExtra;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your monthly fix fee = ");
            float fixFee = scanner.nextFloat();
            System.out.print("Enter the category (enter 1,2 or 3) = ");
            int category = scanner.nextInt();
            switch (category){
                case 1:
                    unitCostForExtra = 0.10f;
                    break;
                case 2:
                    unitCostForExtra = 0.20f;
                    break;
                case 3:
                    unitCostForExtra = 0.30f;
                    break;
                default:
                    unitCostForExtra = 0f;
            }
            System.out.print("Enter your extra usage (GB) = ");
            int extra = scanner.nextInt();
            float extraCost = unitCostForExtra * extra;
            return fixFee + extraCost;
        }
    }
}
