package at.ac.fhcampuswien;

public class PasswordValidator {

    public boolean checkPassword(String password){
        if(password.length() >= 8 && password.length() <= 25 && password.matches("(.*[a-z].*)") && password.matches("(.*[A-Z].*)") && password.matches("(.*\\d.*)") && password.matches("^[a-zA-Z 0-9\\)\\(\\#\\$\\?\\!\\%\\/\\@]+$") && password.matches(".*[)(#$?!%/@].*") && !password.matches("\\d\\d\\d.*")){
            return true;
        }
        else {
            return false;
        }
    }
}
