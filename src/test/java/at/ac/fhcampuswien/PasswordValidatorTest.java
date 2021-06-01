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

    @Test
    @DisplayName("Has password length less than 8 characters")
    public void testPasswordLengthInvalidUnder_8(){
        //PasswordValidator pw = new PasswordValidator();
        assertFalse(pw.checkPassword("1234567"));
    }

    @Test
    @DisplayName("Has password length more than 25 characters")
    public void testPasswordLengthInvalidOver_25(){
        //PasswordValidator pw = new PasswordValidator();
        assertFalse(pw.checkPassword("123456789...............26"));
    }

    @Test
    @DisplayName("Has password upper and lower case")
    public void testPasswordUpperAndLowerCase(){
        assertTrue(pw.checkPassword("A1!b2$C3%d4@"));
    }

    @Test
    @DisplayName("Has password only lower case")
    public void testPasswordOnlyLowerCase(){
        assertFalse(pw.checkPassword("abcdefghij"));
    }

    @Test
    @DisplayName("Has password only upper case")
    public void testPasswordOnlyUpperCase(){
        assertFalse(pw.checkPassword("ABCDEFGHIJ"));
    }

    @Test
    @DisplayName("Has password numbers")
    public void testPasswordIncludeNumbers(){
        assertTrue(pw.checkPassword("A1!b2$C3%d4@"));
    }

    @Test
    @DisplayName("Has password no numbers")
    public void testPasswordNoNumbers(){
        assertFalse(pw.checkPassword("AbCdEfGhIj"));
    }
}
