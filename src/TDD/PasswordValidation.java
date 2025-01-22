package TDD;

public class PasswordValidation {
    public boolean check(String password) {
        boolean hasEnoughChars = false;
        boolean hasDigits = false;
        boolean hasSpecialChars = false;

        if(password.length() >= 8) {
            hasEnoughChars = true;
        }
        
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i)))
            {
                hasDigits = true;
            }
            if(!Character.isLetterOrDigit(password.charAt(i)))
            {
                hasSpecialChars = true;
            }
        }

        return hasEnoughChars && hasDigits && hasSpecialChars;
    }
}