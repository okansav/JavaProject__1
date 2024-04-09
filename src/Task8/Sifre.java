package Task8;

import java.util.Scanner;

public class PasswordControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, password, passwordRepeat;
        String loginName, loginPassword;
        do {
            System.out.print("Enter your user name = ");
            userName = scanner.next();
            System.out.print("Enter your password = ");
            password = scanner.next();
            System.out.print("Enter your password again = ");
            passwordRepeat = scanner.next();
            if (password.equals(passwordRepeat))
                System.out.println("Your login information has been defined");
            else
                System.out.println("Your passwords do not match!");
        }while(!password.equals(passwordRepeat));

        System.out.println();
        int i = 3;
        System.out.println("--- LOGIN ----");
        do {
            System.out.print("User Name = ");
            loginName = scanner.next();
            System.out.print("Password = ");
            loginPassword = scanner.next();
            if (userName.equals(loginName) && password.equals(loginPassword)){
                System.out.println("You have successfully logged in. Welcome " + loginName + "!");
                i = 0;
            } else {
                i--;
                System.out.println("Invalid user name or password, you can try " + i + " times");
            }
        }while(i != 0);

    }
}











