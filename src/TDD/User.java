package TDD;

public class User {
    private String userName;
    private String password;
    private String userType;

    public User(String name, String password) {
        this.userName = name;
        this.password = password;
        this.userType = "normal";
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String changeUserName(String name) {
        this.userName = name;

        return name;
    }

    public String checkUsernameLength(String name) {
        if (name.length() > 3) {
            return name;
        }

        return this.userName;
    }

    public String changePassword(String newpass) {
        return newpass;
    }

    public boolean checkSpecialCharsInPassword() {
        boolean hasSpecialChars = false;

        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i) == '!' || password.charAt(i) == '$')
            {
                hasSpecialChars = true;
            }
        }

        return hasSpecialChars;
    }

    public String getUserType() {
        return userType;
    }
}
