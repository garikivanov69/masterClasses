package privatemethod;

import java.util.Locale;

public class Login {
    private static final String PREFIX = "1234";

    public void loginUser(String loginUser) {
        if (checkLogin(loginUser)) {
            System.out.println("Login user is successful");
        } else {
            System.out.println("Login user is failed");
        }


    }

    public void getAccessToConsole(String loginUser) {
        if (checkLogin(loginUser)) {
            System.out.println("Access to Console is permitted");
        } else {
            System.out.println("Access to Console is canceled");
        }


    }

    public void getAccessToDB(String loginUser) {
        if (checkLogin(loginUser)) {
            System.out.println("Access to DB is permitted");
        } else {
            System.out.println("Access to DB is canceled");
        }
    }


    private boolean checkLogin(String loginUser) {
        if (loginUser != null && loginUser.length() > 0) {
            if (Credentials.LOGIN_USER != null) {
                String resultLogin = loginUser.toLowerCase() + PREFIX;
                if (resultLogin.equals(Credentials.LOGIN_USER)) {
                    return true;
                }
            }
        }
        return false;
    }
}
