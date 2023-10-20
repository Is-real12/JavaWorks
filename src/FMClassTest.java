import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FMClassTest {

    @Test
    void checkingIt(){
        String some = "A12320" +
                "89076)(*&^)((&*&^|%%$05--4, B123, C123";
        assertEquals(19,FMClass.lenght(some));
    }

    @Test
    void checkingreal() {
        String other = "ABc21F, 13CPZ, A1Ln";
        assertEquals(5,FMClass.lenght(other));
    }
}