package prac4a;
public class Driver {

    public static void main(String[] args) {

        PasswordChecker pc = new PasswordChecker();
        String[] passwords = {"abc", "password", "Password", "Password1", "Abcd1234!"};
        for (String pw : passwords) {

            System.out.println("Password: " + pw);
            System.out.println("Length >= 8: " + pc.hasMinLength(pw));
            System.out.println("Contains Uppercase: " + pc.hasUpperCase(pw));
            System.out.println("Contains Digit: " + pc.hasDigit(pw));
            System.out.println("Contains Special Character: " + pc.hasSpecialCharacter(pw));
            System.out.println("Strength: " + pc.strength(pw));
            System.out.println("------------------------------");
        }
    }
}