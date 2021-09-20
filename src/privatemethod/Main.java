package privatemethod;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();

        login.loginUser("user");
        login.getAccessToConsole("user");
        login.getAccessToDB("user");
    }
}
