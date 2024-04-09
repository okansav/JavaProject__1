package Task9;


    public class PasswordGenerator {
        public static void main(String[] args) {
            int passwordLength = (int)(Math.random() * 4) + 7;
            char[] letters = new char[passwordLength];
            for (int i = 0; i < letters.length; i++)
                letters[i] = (char) ((Math.random() * 94) + 33);

            System.out.print("Generated Password : ");
            for(char letter : letters){
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}
