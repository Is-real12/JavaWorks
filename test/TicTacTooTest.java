import TicTacTo.Empty;
import TicTacTo.TicTacToe;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class TicTacTooTest {

    @Test
    public void testThatMyBoardIsContainsEmpty(){
        TicTacToe tiktac = new TicTacToe();
        Empty empty;
        assertTrue(tiktac.getEmpty());

    }

    @Test
    public void testThatUserCanOnlyBe_X_or_O_AndTheyCanChooseWhereToPlay (){
        TicTacToe tiktac = new TicTacToe();
        assertThrows(InputMismatchException.class, ()->tiktac.play("W", 2));
        tiktac.play("X", 2);
        tiktac.play("O", 1);

    }
    @Test
    public void testThatUserCantPlayInTheSamePlace (){
        TicTacToe tiktac = new TicTacToe();
        tiktac.play("X", 1);
        assertThrows(IllegalArgumentException.class,  ()->tiktac.play("O", 1));

    }
    @Test
    void testThatAfterthreeMacthingXorOYouShouldWin(){
        TicTacToe tiktac = new TicTacToe();
        tiktac.play("X", 1);
        tiktac.play("X", 4);
        tiktac.play("X", 7);
        assertEquals("X",tiktac.checkGameResult());
    }

    @Test
    void testThatAfterAllPlaysWithoutMacthing_XorO_it_A_Draw(){
        TicTacToe tiktac = new TicTacToe();
        tiktac.play("X", 1);
        tiktac.play("X", 2);
        tiktac.play("O", 3);
        tiktac.play("O", 4);
        tiktac.play("X", 5);
        tiktac.play("X", 6);
        tiktac.play("X", 7);
        tiktac.play("O", 8);
        tiktac.play("O", 9);
        assertEquals( "Draw",tiktac.checkGameResult());
    }
//    public static void main(String[] args) {
//
//    }
}