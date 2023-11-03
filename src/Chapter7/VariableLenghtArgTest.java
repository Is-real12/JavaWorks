package Chapter7;
import org.junit.jupiter.api.Test;

import static Chapter7.VariableLenghtArg.*;
import static org.junit.jupiter.api.Assertions.*;

class VariableLenghtArgTest {
    @Test
    void variableLenghtArg(){
        assertEquals(4.5, VLA(2, 3, 4, 5, 6, 7));
    }

}