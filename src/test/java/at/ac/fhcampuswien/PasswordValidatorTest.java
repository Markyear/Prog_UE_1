package at.ac.fhcampuswien;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    private PasswordValidator pw;

    @BeforeEach
    void setup(){
        pw = new PasswordValidator();
    }

    @Test
    @DisplayName("Has password length between 8 and 25 characters")
    public void testPasswordLengthValid (){
        //PasswordValidator pw = new PasswordValidator();
        assertTrue(pw.checkPassword("A1!b2$C3%d4@"));
    }

}
