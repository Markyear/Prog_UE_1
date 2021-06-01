package at.ac.fhcampuswien;

public class PasswordValidator {

    public boolean checkPassword(String password){
        if(password.length() >= 8 && password.length() <= 25){
            return true;
        }
        else {
            return false;
        }

    }

}
