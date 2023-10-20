package ArrayAss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FmClassTest {

    @Test
    void anagramLenghtChecker(){
        assertFalse(FmClass.anagram("foodista","food"));
    }
    @Test
    void anagramCharacter(){
        assertFalse(FmClass.anagram("lisraeio","israel"));
    }
@Test
    void StringPalindrom(){
        assertTrue(FmClass.palindrome("mallam"));
    }
    @Test
    void checkingForNotPalindrom(){
        assertFalse(FmClass.palindrome("generator"));
    }
    @Test
    void checkingForPalindromAgian(){
        assertTrue(FmClass.palindrome("dood"));
    }

}